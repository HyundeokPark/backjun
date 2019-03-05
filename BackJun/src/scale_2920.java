import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class scale_2920 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String scales = "";
		int[] scale;
		String[] modifier ;
		int count = 0;
		scales = br.readLine();
		modifier = scales.split(" ");
		scale = new int[modifier.length];
		
		for(int i =0; i<modifier.length; i++) {
			scale[i] = Integer.parseInt(modifier[i]);     		
		}
		
		
		
		for(int i=0; i<scale.length; i++) {
			if(scale[0] ==1 && scale[i] == i+1) {
				count = 2;
				//System.out.println(count);
			}	
			else if (scale[0] ==8 && scale[i] == 8-i){
				count = 1;
				//System.out.println(count);
			}
			else {
				count = 0;
				//System.out.println(count);
				break;
			}
		}
		
		if(count ==2) {
			bw.write("ascending");
		}
		else if(count ==1) {
			bw.write("descending");
		}
		else {
			bw.write("mixed");
		}
		bw.flush();
	}

}
