package lec_13;

public class string_dhoka {
	
	public static void main(String[] args) {
		
		String str = "";
		int n=100000; //10^5
		StringBuilder sb = new StringBuilder();
		
		long start= System.currentTimeMillis();
		
		for(int i=0; i<n ; i++) {
//			str= str+i;  //0(n)
			sb.append(i); //0(1)
//			int a= 2+i;  //0(1)
		}
		
		long end= System.currentTimeMillis();
		
		System.out.println((end-start)/1000.0);
		String ans = sb.toString();
		System.out.println(ans);
		
		
		
		
	}

}
