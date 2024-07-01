package lec_09;

public class string_QPS {
	
	public static void main(String[] args) {
		
//		String str = "aaaaaa";
//		System.out.println(isPalin(str)) ;
//		palinSS(str);
//		palinSS_3(str);
		
		String sen = "the sky is blue";
		extract_word(sen);
		}
		
	
	
	public static boolean isPalin(String str) {
		int startindex = 0;
		int endindex = str.length() - 1;
		while (startindex < endindex) {
			if (str.charAt(startindex) != str.charAt(endindex)) {
				return false;
			}
			startindex++;
			endindex--;
		}
		return true;
	}
	
	
	
	public static void palinSS(String str) {
		for (int s = 0; s < str.length(); s++) {
			for (int e = s + 1; e <= str.length(); e++) {
				
				String ss = str.substring(s, e);
				
				if (isPalin(ss)) { //using palin func to check if ss is palin or not
					System.out.println(ss);
				}
			}
		}
	}
	
	
	//this will only create odd strings.
	public static void palinSS_2(String str) {
		
		for(int axis=0 ; axis< str.length() ; axis++) {
			
			for(int rad = 0 ; (axis-rad >= 0)&&(axis+rad < str.length()) ; rad++) {
				
				int L_idx= axis-rad;
				int R_idx= axis+rad;
				
				char L = str.charAt(L_idx);
				char R = str.charAt(R_idx);
				
				if(L==R) {
					System.out.println(str.substring(L_idx , R_idx+1));
				}else {
					break;
				}
			}
		}
		
	}
	
public static void palinSS_3(String str) {
		
		for(double axis=0.5 ; axis< str.length() ; axis++) {
			
			for(double rad = 0.5 ; (axis-rad >= 0)&&(axis+rad < str.length()) ; rad++) {
				
				int L_idx= (int) (axis-rad);
				int R_idx= (int)(axis+rad);
				
				char L = str.charAt(L_idx);
				char R = str.charAt(R_idx);
				
				if(L==R) {
					System.out.println(str.substring(L_idx , R_idx+1));
				}else {
					break;
				}
			}
		}
		
	}



public static void extract_word(String sen) {
	
	while(true) {
	
		//extract logic
		int last_space = sen.lastIndexOf(" ");
		//System.out.println(last_space);
		
		String word = sen.substring(last_space+1);
		System.out.println(word);
		
		if(last_space==-1) {
			break;
		}
		
		sen = sen.substring(0,last_space);
	
	}
	
	
	
	
	
	
	
}
	
}


		
		

	
		
	

	
	
	
		



