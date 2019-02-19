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
sentence = br.readLine(); //문자열 읽기

//words = sentence.split("\\s+"); // 1개이상의 공백을 표현하는 정규식!   단어를 끊어 word 배열에 저장
//words = sentence.split("\\s"); //1개의 공백 표현하는 정규식

modifier = sentence.trim(); //문자열 맨 앞,뒤의 공백을 제거해주는 함수 trim! 갸꿀ㅋㅋㅋㅋ
words = modifier.split(" "); //앞,뒤 공백을 제거하고 중간에 있는 공백을 기준으로 단어를 잘라 words배열에 저장!

bw.write(Integer.toString(words.length) + "\n"); // 배열의 길이 = 곧 단어의 갯수!이므로 길이 적기
bw.flush(); //출력
	}
	
}
