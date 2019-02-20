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
sentence = br.readLine(); //문자열 읽기


words = sentence.split(" "); // 공백을 기준으로 단어를 잘라서 words 배열에 저장

for(int i=0; i < words.length; i++) { //왜 인지는 모르나 공백이 인식되어 배열에 저장되는 경우가 있음 공백의 경우와,입력값없을때는 갯수를 카운트 하지 않는다! 
	
	
	if(words[i].equals(" ") || words[i].isEmpty()) {
		continue;
	}
	else {
		count++;
	}
}
bw.write(Integer.toString(count));


bw.flush(); //출력
	}
	
}
