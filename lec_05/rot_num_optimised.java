package lec_05;

public class rot_num_optimised {
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
		
			
			
			int part_2 =num %  (int)  Math.pow(10, rot % digits);
			int part_1 = num / (int)  Math.pow(10, rot%digits);
			
			
			int mult = (int)  Math.pow(10, digits - (rot%digits));
			
			num =  part_2*mult + part_1;
			
			
		System.out.println(num);
		
		
//		System.out.println(part_1);
//		System.out.println(part_2);
		

		
	
		
		
		
		
	}
	

}
