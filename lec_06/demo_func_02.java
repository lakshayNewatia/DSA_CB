package lec_06;

public class demo_func_02 {
	
	static int worldwide=99;  //global variable
	
	
	
	
	public static void main(String[] args) {
	
		//System.out.println(worldwide);
		int a = 1;
		int b = 20;
		System.out.println(a + " : " + b);
		swap(a, b);
		System.out.println(a + " : " + b);
//		System.out.println(worldwide);
	}

	public static void swap(int a, int b) {
		worldwide++;
		System.out.println(a + " : " + b);
		int c = a;
		a = b;
		b = c;
		System.out.println(a + " : " + b);
		
		
	}

}
