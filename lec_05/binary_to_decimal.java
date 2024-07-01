package lec_05;

public class binary_to_decimal {
	public static void main(String[] args) {
		
		int num = 1101;
		int mult = 1;
		int ans = 0;
		
		while(num>0) {
			int digit = num % 10;
			num = num/10;
			
			ans = ans + digit*mult;
			mult = mult *2;
			
			
		}
		System.out.println(ans);
		
	}

}
