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
		//�׽�Ʈ���̽� �� �Է�
		testNum = Integer.parseInt(br.readLine()); 
		answer = new String[testNum];
		
		//�׽�Ʈ���̽� ����ŭ �ݺ�
		for(int w=0; w< testNum; w++) {
			
			//�ݺ�Ƚ���� ���ڿ��� ������ ����
			converter = br.readLine().split(" ");
			
			//�ݺ�Ƚ��
			repeatCount = Integer.parseInt(converter[0]);
			
			//���ڿ��� �����ϳ��ϳ��� �ɰ��� �迭�� ����
			singleWord = converter[1].split("");
			
			//�ݺ�Ƚ����ŭ ���Ϲ��� �ݺ��ϱ�
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
