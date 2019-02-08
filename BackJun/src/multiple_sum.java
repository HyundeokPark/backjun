import java.util.Scanner;

public class multiple_sum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Scanner sc2 = new Scanner(System.in);
        int sum = 0;      
        int mount = sc.nextInt();
        String num = sc.next();
        
        //String[] nums = num.split("");
       
        
        for(int i = 0; i<mount; i++) {
            
        	sum = sum +Integer.parseInt(num.substring(i, i + 1));
       
        }
        
        System.out.println(sum);
	}

}
