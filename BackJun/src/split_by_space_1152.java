import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class split_by_space_1152 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
String[]  words;
String sentence = "";
String modifier;
sentence = br.readLine(); //���ڿ� �б�

//words = sentence.split("\\s+"); // 1���̻��� ������ ǥ���ϴ� ���Խ�!   �ܾ ���� word �迭�� ����
//words = sentence.split("\\s"); //1���� ���� ǥ���ϴ� ���Խ�

modifier = sentence.trim(); //���ڿ� �� ��,���� ������ �������ִ� �Լ� trim! ���ܤ�������
words = modifier.split(" "); //��,�� ������ �����ϰ� �߰��� �ִ� ������ �������� �ܾ �߶� words�迭�� ����!

bw.write(Integer.toString(words.length) + "\n"); // �迭�� ���� = �� �ܾ��� ����!�̹Ƿ� ���� ����
bw.flush(); //���
	}
	
}
