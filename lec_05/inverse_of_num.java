//imp question
package lec_05;

public class inverse_of_num {
	
	public static void main(String[] args) {
		
		int num = 23145;
		int pos=0;
		int ans=0;
		
		while(num>0) {
			
			int digit = num % 10;
			pos++;
			num = num/10;
			System.out.println(digit +" -" + pos);
			
			ans = ans +  (int)( pos * Math.pow(10, digit-1)) ;
			
		}
		System.out.println(ans);
	}

}
