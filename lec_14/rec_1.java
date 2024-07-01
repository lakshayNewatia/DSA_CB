package lec_14;

public class rec_1 {
	
	public static void main(String[] args) {
//		PD(5);
//		PI(5);
		PDI(5);
	}
	
	public static void PD(int n) {
		
		if(n==1) {
			System.out.println(1);
			return;
		}
		
		//1) BP: PD(n)
		//2) SP: PD(n-1)
		
		System.out.println(n);  //4)
		PD(n-1);  //3)
	}
	
	
	
	
	public static void PI(int n) {
		
//		if(n==1) {
//			System.out.println(1);
//			return;
//		}
		//or
		
		if(n==0) {
			return;
		}
		
		//BP :PI(n)
		//SP :PI(n-1)
		
		PI(n-1);
		System.out.println(n);
	}
	
	
	public static void PDI(int n) {
		
		//BP : PDI(n)
		//SP : PDI(n-1)
		
		if(n==0) {
			return;
		}
		
		System.out.println(n);
		PDI(n-1);
		System.out.println(n);
	}
	
	
	public static void PID(int s , int e) {
		
		if(s>e) {
			return;
		}
		
//		BP : PID(s,e)
//		SP : PID(s+1,e)

		System.out.println(s);
		PID(s+1,e);
		System.out.println(s);
		
		
	}
	
}
 

