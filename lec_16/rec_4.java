package lec_16;

public class rec_4 {
	
	public static void main(String[] args) {
//		subseq("abc" , "");
		ClimbStairs(0 , "" , 4);
	}
	
	public static void subseq(String word , String team) {
		
//		BP : "abcd"
//		SP : "bcd"
		
		if(word.isEmpty()) {
			System.out.println(team);
			return;
		}
		
		
		String remain = word.substring(1);
		char ch = word.charAt(0);
		
		subseq(remain , team + ch);  //for including
		subseq(remain , team );      //for excluding
		
	}
	
	
	public static void ClimbStairs(int curr, String path, int dest) {
		
		if (curr == dest) { // +ve BC
			System.out.println(path);
			return;
		}
		
		if (curr > dest) { // -ve BC
			return;
		}

		ClimbStairs(curr + 1, path + 1, dest);
		ClimbStairs(curr + 2, path + 2, dest);

	}
	
	
	public static void GenParen(int op, int cl, String str) {
		
		if (op == 0 && cl == 0) {    //+ BC
			System.out.println(str);
			return;
		}
		
		if(op>cl) {
			return;
		}
		
		if (op > 0) {
			GenParen(op - 1, cl, str + "(");
		}
		
		if (cl > 0) {
			GenParen(op, cl - 1, str + ")");
		}
	}
	
	
	
	

}
