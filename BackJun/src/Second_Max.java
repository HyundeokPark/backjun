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
        String numbers = br.readLine();//세 수 읽기
        String[] number = numbers.split(" "); // 세수를 띄어쓰기로 구분해 배열에 각각 저장
        int[] num = new int[number.length]; // int형을 담기위해 배열 선언
        for(int i=0; i < number.length; i++) {//int형으로 형변환 후 각각 저장
        	num[i] = Integer.parseInt(number[i]);
        }
        
        
        for(int i=0; i < num.length; i++) { // max보다 num[i]가 높으면 max의 값을 scnd_max에 대입, num[i] 값을 max에 대입한다. 
        	if(max <= num[i] ) {
        		scnd_max = max;
        		max = num[i];
        	}
        	else if(max >= num[i] && scnd_max <= num[i]) {//num[i]값이 max보다 작으면서, scnd_max보다 클경우 num[i]의 값을 scnd_max에 대입
        		scnd_max = num[i];
        	}
       
        }
        
        bw.write(Integer.toString(scnd_max));
        bw.flush();
	}

}
