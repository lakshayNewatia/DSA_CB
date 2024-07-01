package lec_13;

public class str_demo2 {
	
	public static void main(String[] args) {
		
		//2 ways to create strings
		
		//literal way
		String str1 = "lakshay";
		String str3 = "lakshay";
		
		//new- keyword
		String str2 = new String("lakshay");
		String str4 = new String("lakshay");

//		System.out.println(str1==str2);//compares add
//		System.out.println(str1.equals(str2)); //compares content
		
		System.out.println(str1==str3); //true!!
		System.out.println(str4==str2); //false
		
	}

}
