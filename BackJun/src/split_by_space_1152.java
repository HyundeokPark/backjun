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
int count = 0;
sentence = br.readLine(); //���ڿ� �б�


words = sentence.split(" "); // ������ �������� �ܾ �߶� words �迭�� ����

for(int i=0; i < words.length; i++) { //�� ������ �𸣳� ������ �νĵǾ� �迭�� ����Ǵ� ��찡 ���� ������ ����,�Է°��������� ������ ī��Ʈ ���� �ʴ´�! 
	
	
	if(words[i].equals(" ") || words[i].isEmpty()) {
		continue;
	}
	else {
		count++;
	}
}
bw.write(Integer.toString(count));


bw.flush(); //���
	}
	
}
