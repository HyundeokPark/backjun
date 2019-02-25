import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class OX_8958 {

	public static void main(String[] args)throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String test_case = ""; //테스트 케이스 갯수 
		String result =""; // 문제의 결과를 한줄단위로 받는 변수
		String[] results ;
		//int[] points;
		int count = 0;
		int sum =0;
		
		test_case = br.readLine(); //테스트 케이스 갯수 입력
		for(int i=0; i<Integer.parseInt(test_case); i++) {
			result = br.readLine(); //OX퀴즈의 결과를 한줄 단위로 입력받음
			results = result.split(""); // 한글자씩 나눠 배열에 저장
			for(int j=0; j<results.length; j++) {
	         
				if(results[j].equals("O")) {
					count++; //결과가 O이면 카운트를 더한다!...
					sum = sum + count;				       	
			       // bw.write("현재 result[" + j+ "]의 값 : " +results[j] + " 현재 count의 값: " + Integer.toString(count) + " 현재 sum의 값 : " + Integer.toString(sum) + "\n");
				}
				else if(results[j].equals("X")) {
					count = 0;
					sum = sum + count;
					 //bw.write("현재 result[" + j+ "]의 값 : " +results[j] + " 현재 count의 값: " + Integer.toString(count) + " 현재 sum의 값 : " + Integer.toString(sum) + "\n");
				}
			}
			bw.write(Integer.toString(sum) + "\n");
			sum=0;
			count=0;
		}
		bw.flush();
	}

}
