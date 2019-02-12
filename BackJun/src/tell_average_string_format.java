import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;


public class tell_average_string_format  {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String receiver = "";
		String[] converter;
		double[] points;
		double max = 0;
		double sum = 0;
		double average = 0;
		int count=0;
		float percentage = 0;
		String answer = "";
	    int numOfcase = 0;
	    receiver = br.readLine();
	    numOfcase = Integer.parseInt(receiver);//testcase 수 입력받기
	    
	   for(int i=0; i<numOfcase; i++) {
		    receiver = br.readLine();   	
	    	converter = receiver.split(" ");//띄어쓰기 로 구분해서 자르자
		    points = new double[converter.length];// 학생수대로 double형 배열 선언
		    for(int j=0; j<converter.length; j++) {
		    	points[j] = Double.parseDouble(converter[j]); // string형태의 학생의 수와 점수를 double로 변환 ~ 
	        	if(j >0)
		    	sum = sum + points[j]; //총합구하기
		    }
	     
	        average = sum/points[0]; //평균 구하기
	        
	        for(int j=1; j<points.length; j++ ) {//평균을 넘는 학생 수 구하기
	        	if(points[j] > average) {
	        		count++;
	        	}
	        }
	        
	        percentage = (float) (count/points[0]*100);
	        answer = String.format("%.3f", percentage); //소수점 3자리수까지 무조건 표시해주는 함수!
	        bw.write(answer+"%\n");
	        
	        sum =0;
	        count = 0;
	   }
        bw.flush(); //출려쿠
	}
	

}
