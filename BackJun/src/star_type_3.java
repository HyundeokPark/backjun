import java.util.Scanner;
public class star_type_3 {

	public static void main(String[] args) {
		 int x;
	        Scanner s = new Scanner(System.in);
	        x = s.nextInt();
	        
	        for(int i=x; i>0; i--){
	            for(int j=i; j>0; j--){
	                System.out.print("*");
	            }
	            System.out.println("");
	        }

	}

}
