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
		int[] count = new int[10];
		for(int i=0; i<10; i++) { //0~9 숫자를 카운팅하는 숫자들의 배열, 초기값을 0으로 초기화!
			count[i] = 0;
		}
		
		
		for(int i=0; i<3; i++) { //3개의 숫자를 읽어서 nums 배열에 저장!, 
			sentence = br.readLine();
			multiplyed = multiplyed * Integer.parseInt(sentence);
		}
		
		modifier = Integer.toString(multiplyed).split(""); //한자리씩 끊어서 modifier배열에 저장 ~ 
		
		for(int i=0; i<modifier.length; i++) { //각 자릿수마다 0 ~ 9 를 확인하고 카운팅!
			if(modifier[i].equals("0")) {
				count[0]++;
			}
			else if(modifier[i].equals("1")) {
				count[1]++;
			}
			else if(modifier[i].equals("2")) {
				count[2]++;
			}
			else if(modifier[i].equals("3")) {
				count[3]++;
			}
			else if(modifier[i].equals("4")) {
				count[4]++;
			}
			else if(modifier[i].equals("5")) {
				count[5]++;
			}
			else if(modifier[i].equals("6")) {
				count[6]++;
			}
			else if(modifier[i].equals("7")) {
				count[7]++;
			}
			else if(modifier[i].equals("8")) {
				count[8]++;
			}
			else if(modifier[i].equals("9")) {
				count[9]++;
			}	
		}
		
		for(int i =0; i<count.length; i++) { //count의 배열의 모든 값을 write에 입력
			bw.write(Integer.toString(count[i])+"\n");
		}
		bw.flush();//전부 출력
	}

}
