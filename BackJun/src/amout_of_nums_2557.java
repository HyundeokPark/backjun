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
		for(int i=0; i<10; i++) { //0~9 ���ڸ� ī�����ϴ� ���ڵ��� �迭, �ʱⰪ�� 0���� �ʱ�ȭ!
			count[i] = 0;
		}
		
		
		for(int i=0; i<3; i++) { //3���� ���ڸ� �о nums �迭�� ����!, 
			sentence = br.readLine();
			multiplyed = multiplyed * Integer.parseInt(sentence);
		}
		
		modifier = Integer.toString(multiplyed).split(""); //���ڸ��� ��� modifier�迭�� ���� ~ 
		
		for(int i=0; i<modifier.length; i++) { //�� �ڸ������� 0 ~ 9 �� Ȯ���ϰ� ī����!
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
		
		for(int i =0; i<count.length; i++) { //count�� �迭�� ��� ���� write�� �Է�
			bw.write(Integer.toString(count[i])+"\n");
		}
		bw.flush();//���� ���
	}

}
