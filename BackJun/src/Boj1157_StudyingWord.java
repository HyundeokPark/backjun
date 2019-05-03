import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Set;


public class Boj1157_StudyingWord {
	//HashMap 통과
	

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
//////////////////// 주석처리는 시간초과된 부분/////////////////////////////////////////////////////////////////
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		String[] singleWord;
//		String single="";
//		int count = 1;
//		int max =-1;
		//String answer = "";
//		char answer='a';
//		
//		//singleWord = br.readLine().split("");
//		singleWord = br.readLine().split("");
//		//singleWord와 대응하는 counts배열!
//		counts = new int[singleWord.length];
//		//counts = new int[single.length()];
//		
//		for(int i=0; i<singleWord.length; i++) {
//			for(int j=i+1; j<singleWord.length; j++) {
//				if(singleWord[i].equalsIgnoreCase(singleWord[j])) {
//					count++;
//				}
//			}
//			
//			i += count;
//			
//			if(max < count) {
//				max = count;
//				bw.write(singleWord[i]);
//			}
//			else if(max == count) {
//				
//			}
//			count = 0;
//			
//		}
//		
//		bw.write(answer);
//		bw.flush();
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] intoWord;
		String inputData="";
		int count = 1;
		int max =-1;
		String answer ="";
		
		
		//데이터 입력
		inputData = br.readLine();
		
		
		//입력받은 데이터를 모두 대문자로 치환, 한글자씩 나누어 배열에 저장
		intoWord = inputData.toUpperCase().split("");
		
		
		//키값 : 문자배열값 , 값값 : 갯수  중복시 동일 키값에 카운트 증가해서 다시 새롭게 put!
		for(int i=0; i<intoWord.length; i++) {
			if(!map.containsKey(intoWord[i])) {
				map.put(intoWord[i], count);
			}
			else {
				String key = intoWord[i];
				count = map.get(key);
				count++;
				map.put(key, count);
			}
			count=0;
		}
		
		Set<String> keyset = map.keySet();
		
		for(String k : keyset) {
			if(max < map.get(k)) {
				max = map.get(k);
				answer = k;
			}
			else if(max ==  map.get(k)) {
				answer = "?";
				}
		}
		
		System.out.println(answer);
	}
}
