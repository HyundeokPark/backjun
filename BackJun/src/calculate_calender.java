import java.util.Scanner;
public class calculate_calender {

	public static void main(String[] args) {
		int month, date, day;
		int number_of_days = 0;
		Scanner s = new Scanner(System.in);
		month = s.nextInt();
		date = s.nextInt();
		String result ="";
		
		for(int i = 1; i<month; i++) {
			if(i == 4 ||i ==  6||i == 9||i == 11  ) {
			 number_of_days = number_of_days + 30; 
			}
			else if(i==2) {
				number_of_days = number_of_days + 28;
			}
			else
				number_of_days = number_of_days + 31; 
		}
		number_of_days = number_of_days + date;
		day = number_of_days % 7;
		
		if(day == 0) {
			result = "SUN";
		}
		else if(day ==1) {
			result = "MON";
		}
		else if(day ==2) {
			result ="TUE";
		}
		else if(day ==3) {
			result ="WED";
		}
		else if(day ==4) {
			result ="THU";
		}
		else if(day ==5) {
			result ="FRI";
		}
		else if(day ==6) {
			result ="SAT";
		}
		System.out.println(result);
	}

}
