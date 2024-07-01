package lec_09;


public class string_demo {
	public static void main(String[] args) {
		

		String str = "hello baaji kaha ho ? baaji";
		
		System.out.println(str);
		
		System.out.println(str.length());
		
		//System.out.println(str[i]);
		
		//char at an index
		System.out.println(str.charAt(0));
		
		//char at last index
		System.out.println(str.charAt(str.length()-1));
		
		
		System.out.println("===================");
		
		System.out.println(str.indexOf("Baaji")); //left to right
		
		System.out.println(str.lastIndexOf("Baaji")); //right to left
		
		System.out.println(str.startsWith("hEll")); //check prefix
		
		System.out.println(str.endsWith("aaji")); //check suffix
		
		System.out.println("===================");
		
		
		
		
		
		//substring with 1 arg 
		System.out.println(str.substring(1)); //1 se lekar end tak print
		
		//substring with 2 arg
		str="abcd";
		for(int s=0 ; s<str.length() ; s++) {
			for(int e=s+1 ; e<=str.length() ; e++) {
				System.out.println(str.substring(s,e));
			}
			
		}
		
		
		
		
	}
	
	
}
