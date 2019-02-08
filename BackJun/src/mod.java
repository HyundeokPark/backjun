import java.util.Scanner;

public class mod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int x,y,z;
	        Scanner s = new Scanner(System.in);
	        x = s.nextInt();
	        y = s.nextInt();
	        z = s.nextInt();
	        
	        System.out.println( (x + y) % z);
	        System.out.println( (x % z  +  y % z) % z);
	        System.out.println( (x * y) % z);
	        System.out.println( (x % y  *  y % z) % z);
	}

}
