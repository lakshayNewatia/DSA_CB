package lec_11;

public class wrapper_class {
	
	public static void main(String[] args) {
		
		int i = 10;
		System.out.println(i);
		Integer I = 1000;
		System.out.println(I);
		
//		i= null;  //invalid
		I= null;
		System.out.println(I);
		
//		I = i; // autobxing!!// stack to heap!!
//		System.out.println(I);
//		
		i = I;// unboxing!! => heap to stack
	}

}


