import java.util.Scanner;

public class outPut_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  Scanner sc = new Scanner(System.in);

	        while (sc.hasNextLine()) {

	            String input_text = sc.nextLine();

	            if (!(input_text.isEmpty() | input_text.length() > 100)){

	                System.out.println(input_text);
	            }
	        }
	    }
    }

	

