import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class fast_sum {

	public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	int sum = 0;
	
	int mount = Integer.parseInt(br.readLine()); //테스트케이스 갯수 입력 받기
	
	for(int i=0; i < mount; i++) {		
	String sentence =br.readLine();
	String[] word = sentence.split(" ");	
	sum = Integer.parseInt( word[0]) +Integer.parseInt( word[1]);
    bw.write(Integer.toString(sum)+"\n"); 
	}
    bw.flush();
	}
	
}