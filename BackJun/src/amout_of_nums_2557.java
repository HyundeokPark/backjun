import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class amout_of_nums_2557 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String sentence ="";
		String[] modifier;
		int multiplyed= 1;
		
		for(int i=0; i<3; i++) { //3개의 숫자를 읽어서 nums 배열에 저장!, 
			sentence = br.readLine();
			multiplyed = multiplyed * Integer.parseInt(sentence);
		}
		modifier = Integer.toString(multiplyed).split("");
		for(int i=0; i<modifier.length; i++) {
			
		}
	}

}
