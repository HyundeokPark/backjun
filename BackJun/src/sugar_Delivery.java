import java.util.Scanner;

public class sugar_Delivery {

	public static void main(String[] args) {
		    int n = -1;
	        int num_5 = -1;
	        int num_3 = 0;
	        int i;
	        Scanner s = new Scanner(System.in);
	        n = s.nextInt();
	    if(n % 5 == 0)
	    {
	        num_5 = n / 5;
	        System.out.println(num_5);
	    }
	    else
	    {
	        for(i = n/5; i>=0; i--)
	        {
	            if( (n - 5 * i) % 3 == 0)
	            {
	                num_5 = i;
	                num_3 =( n - 5 * i) / 3;
	                break;
	            }
	        }
	        System.out.println(num_5+num_3);
	    }

	}

}
