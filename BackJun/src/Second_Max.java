import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
public class Second_Max {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int max = 0;
        int scnd_max = 0;
        String numbers = br.readLine();//�� �� �б�
        String[] number = numbers.split(" "); // ������ ����� ������ �迭�� ���� ����
        int[] num = new int[number.length]; // int���� ������� �迭 ����
        for(int i=0; i < number.length; i++) {//int������ ����ȯ �� ���� ����
        	num[i] = Integer.parseInt(number[i]);
        }
        
        
        for(int i=0; i < num.length; i++) { // max���� num[i]�� ������ max�� ���� scnd_max�� ����, num[i] ���� max�� �����Ѵ�. 
        	if(max <= num[i] ) {
        		scnd_max = max;
        		max = num[i];
        	}
        	else if(max >= num[i] && scnd_max <= num[i]) {//num[i]���� max���� �����鼭, scnd_max���� Ŭ��� num[i]�� ���� scnd_max�� ����
        		scnd_max = num[i];
        	}
       
        }
        
        bw.write(Integer.toString(scnd_max));
        bw.flush();
	}

}
