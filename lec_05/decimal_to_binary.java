package lec_05;

public class decimal_to_binary {
	public static void main(String[] args) {
		
		int num = 19;
		int mult = 1;
		int ans = 0;
		
		while(num>0) {
			int digit = num % 2;
			num = num/2;
			
			ans = ans + digit*mult;
			mult = mult*10;
			
			
		}
		System.out.println(ans);
		
	}

}
