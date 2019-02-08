import java.util.Scanner;
public class star_type {

	public static void main(String[] args) {
		int x;
        Scanner s = new Scanner(System.in);
        x = s.nextInt();
        for(int i = 1; i <= x; i++){
            for(int j =1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }

	}

}
