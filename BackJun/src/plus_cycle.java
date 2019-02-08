import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;


public class plus_cycle {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String read_nums;
		String[] converter;
		int[] num;
		int count=0;
		
		read_nums = br.readLine();
		
		if(read_nums.length() < 2) {
			read_nums = "0"+read_nums;
		}
		
		converter = read_nums.split("");
		
		num = new int[converter.length];
		
		for(int i=0; i < converter.length; i++) {
			num[i] = Integer.parseInt(converter[i]);
		}
		
		do {
			int temp = 0;
			temp = num[0];
		    num[0] = num[1];
		    //bw.write("¹Ù²ï num[0] : " + Integer.toString(num[0])+"\n");
		    //bw.flush();
		    
		    num[1] = temp + num[1];
		    if(num[1] > 9) {
		    	num[1] = num[1] % 10;
		    }
		    //bw.write("¹Ù²ï num[1] : " + Integer.toString(num[1])+"\n");
		    //bw.flush();
		    
		    //bw.write("¹Ù²ï ¼ö :  "+Integer.toString(num[0]*10+num[1])+"\n");	
			//bw.write("¿ø·¡ ¼ö :  "+read_nums + "\n");	
		    
		    count++;
		   //bw.write("Áõ°¡µÈ count : " + Integer.toString(count)+"\n");
		   //bw.flush();
		    }while(num[0]*10+num[1] != Integer.parseInt(read_nums));
		
	           	
			  /*bw.write("¹Ù²ï ¼ö :  "+Integer.toString(num[0]*10+num[1])+"\n");	
			  bw.write("¿ø·¡ ¼ö :  "+read_nums + "\n");	  */   
		 
			  bw.write(Integer.toString(count));
			  bw.flush();
		
		
	}

}
