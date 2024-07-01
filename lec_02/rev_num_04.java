//take a no. n and print its seperate digits in reverse order.Also print the reversed digits as a new number

package lec_02;

public class rev_num_04 {
	
	public static void main(String[] args) {
		int num =12345 ;
		int ans=0;
		
		
		while(num>0) {
			int q= num/10;  //bacha part
			int rem=num%10;
			
			//System.out.println(q + "," + rem);
			
			System.out.print(rem);
			
			num=q; //---> q will be calc after rem.
			
			ans = ans* 10 + rem;
		}
		
		//System.out.println(ans);
		
	}

}
