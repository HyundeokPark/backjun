import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class new_average {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String receiver = "";
		String[] converter;
		double[] points;
		double max = 0;
		double result = 0;
		int numOfsubject = Integer.parseInt(br.readLine());
		points = new double[numOfsubject];
		
		
        receiver = br.readLine();
        converter = receiver.split(" ");
        for(int i=0; i<numOfsubject; i++) {
        	points[i] = Double.parseDouble(converter[i]); // string������ ������ double�� ��ȯ ~ 
            if(max < points[i]) {//�ִ밪 ã��
            	max = points[i];
            }
        }
        for(int i=0; i<numOfsubject; i++) { //�־��� ���Ĵ�� ���� ��ȯ
        	points[i] = points[i]/max*100;
        }
        for(int i=0; i<numOfsubject; i++) {//���� ���ϱ�
        	result = result + points[i];
        }
        bw.write(Double.toString(result/numOfsubject));//��ճ��� ~ 
        bw.flush(); //�����
	}

}
