package lec_09;
import java.util.*;

public class input_string {
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		
		//for reading a word
		String str1 = scn.next();
		String str2 = scn.next();
		System.out.println(str1+" "+str2);
		
		
		//for reading a sentence
		String sent = scn.nextLine();
		System.out.println(sent);
		
	}

}
