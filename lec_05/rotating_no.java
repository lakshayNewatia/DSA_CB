package lec_05;

public class rotating_no {
	
	public static void main(String[] args) {
		int num=12345;
		int rot = 47;
		int digits=0;
		int backup = num;
		
		
		
		while(num>0) {
			num = num/10;
			digits++;
			
		}
		
//		System.out.println("no of digits : " + digits);
//		System.out.println("Actual rotations to be done: " + rot % digits);
		
		
		
		
		num= backup;
		int cnt=0;
		while(cnt < rot % digits) {
			
			int part_2 =num %  10;
			int part_1 = num / 10;
			
			
			int mult = (int)  Math.pow(10, digits - 1);
			
			num =  part_2*mult + part_1;
			
			
		    //System.out.println(num);
		    cnt++;
			
		}
		
		System.out.println(num);
			
			
		
		
//		System.out.println(part_1);
//		System.out.println(part_2);
		

		
	}

}
