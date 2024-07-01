package lec_17;

public class partitioning_1 {
	
	public static void main(String[] args) {
		kaat("nitin" , "");
		
	}
	
	public static void kaat(String table, String bag) {
		
//		table = abcd
		
		if(table.isEmpty()) {
			System.out.println(bag);
			return; // without return is also ok..as when table==0 for loop will not run. therefore no error
		}
		
		for (int chakku = 1; chakku <= table.length(); chakku++) {
			
			String part = table.substring(0,chakku); //a
			
			if(isPalin(part)) { //for palindrome partitioning
				
			String remain = table.substring(chakku);// bcd
			
//			System.out.println(part+"--"+remain );
			
			//recursive call
			kaat(remain, bag+"-"+part);
			
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
