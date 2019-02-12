import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;


public class tell_average {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String receiver = "";
		String[] converter;
		double[] points;
		double max = 0;
		double sum = 0;
		double average = 0;
		int count=0;
		double percentage = 0;
		double answer = 0;
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
	        
	        percentage = count/points[0]*100;
	        answer = Math.round((percentage*1000))/1000.0;
	        if(answer%10==0 ) {
	        	bw.write(Double.toString(answer)+"00%\n" );
	        }
	        else
	        bw.write(Double.toString(answer) + "%\n");
	        /*bw.write("저장된 점수들은 \n");
	        for(int j = 1; j <points.length; j++) {
	        	bw.write( points[j] + " " );
	        }
	        bw.write("\n");
	        bw.write("총합은 "+Double.toString(sum) + "\n");
	        bw.write("평균은 "+Double.toString(average) + "\n");
	        bw.write("평균을 넘는 학생 수는 "+Double.toString(count) + "\n");
	        
	        bw.write(Double.toString(answer) + "\n");*/
	        sum =0;
	        count = 0;
	   }
        bw.flush(); //출려쿠
	}


}