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
		String test_case = ""; //�׽�Ʈ ���̽� ���� 
		String result =""; // ������ ����� ���ٴ����� �޴� ����
		String[] results ;
		//int[] points;
		int count = 0;
		int sum =0;
		
		test_case = br.readLine(); //�׽�Ʈ ���̽� ���� �Է�
		for(int i=0; i<Integer.parseInt(test_case); i++) {
			result = br.readLine(); //OX������ ����� ���� ������ �Է¹���
			results = result.split(""); // �ѱ��ھ� ���� �迭�� ����
			for(int j=0; j<results.length; j++) {
	         
				if(results[j].equals("O")) {
					count++; //����� O�̸� ī��Ʈ�� ���Ѵ�!...
					sum = sum + count;				       	
			       // bw.write("���� result[" + j+ "]�� �� : " +results[j] + " ���� count�� ��: " + Integer.toString(count) + " ���� sum�� �� : " + Integer.toString(sum) + "\n");
				}
				else if(results[j].equals("X")) {
					count = 0;
					sum = sum + count;
					 //bw.write("���� result[" + j+ "]�� �� : " +results[j] + " ���� count�� ��: " + Integer.toString(count) + " ���� sum�� �� : " + Integer.toString(sum) + "\n");
				}
			}
			bw.write(Integer.toString(sum) + "\n");
			sum=0;
			count=0;
		}
		bw.flush();
	}

}
