import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
public class series_num {

	public static void main(String[] args)  {
	Scanner sc = new Scanner(System.in);
	int x, mount;
	String result = "";
	
	mount = sc.nextInt();
	
	int[] nums = new int[mount];
	
	x = sc.nextInt();
	
	for(int i=0; i <mount; i++ ) {
		nums[i] = sc.nextInt();
	}
	
    for(int i=0; i < mount; i++) {
    	if(nums[i] < x)
    	result = result + Integer.toString(nums[i]) + " ";
    }
    System.out.println(result);
    }
}
