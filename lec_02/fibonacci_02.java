//print nth fibonacci number

package lec_02;

public class fibonacci_02 {
	public static void main(String[] args) {
		
		int num = 4;
		
		//initialise a and b
		int a=0;
		int b=1;
		
		
		int cnt=0;
		while(cnt<num) {     //if cnt <= num, cant print the soln.
			int c= a+b;
			a=b;
			b=c;
			cnt++;
		}
		
		
		
		System.out.println(a);   //will print (n)th no.
		System.out.println(b);   //will print (n+1)th no.
		
		//also c=b
		
		
		
		
		
		
		
	}

}
