import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Set;


public class Boj1157_StudyingWord {
	//HashMap ���
	

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
//////////////////// �ּ�ó���� �ð��ʰ��� �κ�/////////////////////////////////////////////////////////////////
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
//		//singleWord�� �����ϴ� counts�迭!
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
		
		
		//������ �Է�
		inputData = br.readLine();
		
		
		//�Է¹��� �����͸� ��� �빮�ڷ� ġȯ, �ѱ��ھ� ������ �迭�� ����
		intoWord = inputData.toUpperCase().split("");
		
		
		//Ű�� : ���ڹ迭�� , ���� : ����  �ߺ��� ���� Ű���� ī��Ʈ �����ؼ� �ٽ� ���Ӱ� put!
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
