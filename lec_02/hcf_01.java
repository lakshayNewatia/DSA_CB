//long division
package lec_02;

public class hcf_01 {
	public static void main(String[] args) {
		
		int dividend = 6;
		int divisor = 4;
		
		
		
		while(divisor>0){     //or rem>0
			
			int rem= dividend%divisor;
			dividend=divisor;
			divisor=rem;
			
			
		}
		
		System.out.println(dividend);
		
		
		
		
	}

}
