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
	        
	        percentage = (float) (count/points[0]*100);
	        answer = String.format("%.3f", percentage); //�Ҽ��� 3�ڸ������� ������ ǥ�����ִ� �Լ�!
	        bw.write(answer+"%\n");
	        
	        sum =0;
	        count = 0;
	   }
        bw.flush(); //�����
	}
	

}
