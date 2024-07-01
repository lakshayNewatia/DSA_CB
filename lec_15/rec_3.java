package lec_15;

public class rec_3 {
	
	public static void main(String[] args) {
		

//		System.out.println(Fib(4));
		CT(3, "");
		
	}
	
	public static int Fib(int n) {
		if(n==0) {
			return 0;
		}
		if(n==1) {
			return 1;
		}
		
//		BP : Fib(n)
		int sp1 = Fib(n-1);
		int sp2 = Fib(n-2);
		return sp1+sp2;
	}
	
	
	public static void CT(int n, String str) {
		
		if(n==0) {
			System.out.println(str);
			return;
		}
		
		CT(n-1, str+"H");
		CT(n-1, str+"T");
		
	}
	
	
	

}
