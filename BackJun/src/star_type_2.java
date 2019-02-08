import java.util.Scanner;
public class star_type_2 {

	public static void main(String[] args) {
		 int x;
		 int i,j,w;
	        Scanner s = new Scanner(System.in);
	        x = s.nextInt();
	        
	       for( i=x; i>0; i--){    
	           for( j=1; j<i; j++){   	  
	               System.out.print(" ");
	           }
	           for( w=j; w<=x; w++) {        	 
	        	   System.out.print("*");
	           }
	           System.out.println("");
	       }
	}

}
