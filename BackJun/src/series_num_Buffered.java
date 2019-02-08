import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
public class series_num_Buffered {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] num;
        String receiver = "";
        int x, mount;
        
        receiver = br.readLine();
        
        String[] converter; 
        
        converter = receiver.split(" ");
        
        mount = Integer.parseInt(converter[0]);
        x = Integer.parseInt(converter[1]);
        
        receiver = br.readLine();
       
        
        num = new int[mount];
        converter = receiver.split(" ");
        
        for(int i=0; i<mount; i++){
        	num[i] = Integer.parseInt(converter[i]);
        }
        for(int i=0; i < mount; i++) {
        	if(x > num[i]) {
        		bw.write(Integer.toString(num[i]) + " ");
        	}
   
        	
        }
        bw.flush();
        
 
       
 
	}

}
