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
	    numOfcase = Integer.parseInt(receiver);//testcase �� �Է¹ޱ�
	    
	   for(int i=0; i<numOfcase; i++) {
		    receiver = br.readLine();   	
	    	converter = receiver.split(" ");//���� �� �����ؼ� �ڸ���
		    points = new double[converter.length];// �л������ double�� �迭 ����
		    for(int j=0; j<converter.length; j++) {
		    	points[j] = Double.parseDouble(converter[j]); // string������ �л��� ���� ������ double�� ��ȯ ~ 
	        	if(j >0)
		    	sum = sum + points[j]; //���ձ��ϱ�
		    }
	     
	        average = sum/points[0]; //��� ���ϱ�
	        
	        for(int j=1; j<points.length; j++ ) {//����� �Ѵ� �л� �� ���ϱ�
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
	        /*bw.write("����� �������� \n");
	        for(int j = 1; j <points.length; j++) {
	        	bw.write( points[j] + " " );
	        }
	        bw.write("\n");
	        bw.write("������ "+Double.toString(sum) + "\n");
	        bw.write("����� "+Double.toString(average) + "\n");
	        bw.write("����� �Ѵ� �л� ���� "+Double.toString(count) + "\n");
	        
	        bw.write(Double.toString(answer) + "\n");*/
	        sum =0;
	        count = 0;
	   }
        bw.flush(); //�����
	}


}