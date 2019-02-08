import java.util.Scanner;
public class ten_word {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        String answer = "";
        
        String[] word = new String[sentence.length()];
        
        for(int i =0; i < sentence.length(); i++) {
        	word[i] = sentence.substring(i, i+1);
        }
        
        for(int i=0; i<sentence.length();i++){
            if( i!=0 && i% 10 == 0) {
            	System.out.println("");
            }
        	System.out.print(word[i]);
        	
        }
	}

}
