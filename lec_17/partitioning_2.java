package lec_17;
import java.util.*;

public class partitioning_2 {

	
	public static void main(String[] args) {
		ArrayList<String> AL = new ArrayList<>();
//		kaat("nitin" , "" , AL);
		kaat_correct("nitin" , "" , AL);
		
	}
	
	public static void kaat(String table, String bag , ArrayList<String> AL) {
		
//		table = abcd
		
		if(table.isEmpty()) {
			System.out.println(AL);
			System.out.println(bag);
			System.out.println("======");
			return; // without return is also ok..as when table==0 for loop will not run. therefore no error
		}
		
		for (int chakku = 1; chakku <= table.length(); chakku++) {
			
			String part = table.substring(0,chakku); //a
			
			if(isPalin(part)) { //for palindrome partitioning
				
			String remain = table.substring(chakku);// bcd
			
//			System.out.println(part+"--"+remain );
			
			//recursive call
			AL.add(part);
			kaat(remain, bag+"-"+part , AL);
			
		   }
		}
	}
	
	
    public static void kaat_correct(String table, String bag , ArrayList<String> AL) {
		
//		table = abcd
		
		if(table.isEmpty()) {
			System.out.println(AL);
			System.out.println(bag);
			System.out.println("======");
			return; // without return is also ok..as when table==0 for loop will not run. therefore no error
		}
		
		for (int chakku = 1; chakku <= table.length(); chakku++) {
			
			String part = table.substring(0,chakku); //a
			
			if(isPalin(part)) { //for palindrome partitioning
				
			String remain = table.substring(chakku);// bcd
			
//			System.out.println(part+"--"+remain );
			
			//recursive call
			
			AL.add(part); //prep! topi pehno.
			kaat_correct(remain, bag+"-"+part , AL);
			//undo the prep! last topi utaro.
			AL.remove(AL.size()-1);
			
		   }
		}
	}




	public static boolean isPalin(String str) {
		// TODO Auto-generated method stub
		int s =0;
		int e = str.length()-1;
		while(s<e) {
			if(str.charAt(s)!=str.charAt(e)) {
				return false;
			}
			s++;e--;
		}
		return true;
	}
	



	
	

}
