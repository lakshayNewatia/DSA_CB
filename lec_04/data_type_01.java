package lec_04;

public class data_type_01 {
	
	public static void main(String[] args) {
		
		byte a=127;    //implicit typecasting
		//byte a=128;   //will give error
		
		//byte a = (byte)128;  // explicit t.c
		System.out.println(a);
		
		short b=10;
		System.out.println(b);
		
		int c=10;
		System.out.println(c);
		
		//long d= (long)10000000000;
		long d= 100000000000000000l;
		System.out.println(d);
		
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		
		
	}

}
