import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Ascii_11654 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); //��� ����ȯ �Ѱ� ��� ����... ����....
		String input = "";
		char answer;
		input = br.readLine();
		answer = input.charAt(0);
		int ascii = (int)answer;
	
		System.out.println(ascii);
		
		bw.write(Integer.toString(ascii));
		bw.flush();
		

	}

}
