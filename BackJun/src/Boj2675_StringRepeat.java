import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Boj2675_StringRepeat {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int testNum =0;
		int repeatCount = 0;
		String result =""; 
		String[] answer;
		String converter[] = new String[2];
		String[] singleWord;
		//테스트케이스 수 입력
		testNum = Integer.parseInt(br.readLine()); 
		answer = new String[testNum];
		
		//테스트케이스 수만큼 반복
		for(int w=0; w< testNum; w++) {
			
			//반복횟수와 문자열을 나누어 저장
			converter = br.readLine().split(" ");
			
			//반복횟수
			repeatCount = Integer.parseInt(converter[0]);
			
			//문자열을 문자하나하나로 쪼개어 배열에 저장
			singleWord = converter[1].split("");
			
			//반복횟수만큼 단일문자 반복하기
			for(int i=0; i<singleWord.length; i++) {
				for(int j=0; j<repeatCount; j++){
					result = result + singleWord[i];
				}
				bw.write(result);
				result="";
			}
			bw.write("\n");
		}
		
		bw.flush();
		
	}
}
