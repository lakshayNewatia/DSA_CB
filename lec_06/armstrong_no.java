package lec_06;

public class armstrong_no {
	
	
	public static void main(String[] args) {
		
		printAllArmstrong(1000);
		
	}
	
	
	public static void printAllArmstrong(int n) {
		for (int num = 1; num <= n; num++) {
			if (isArm(num)) {
				System.out.println(num);
			}
		}
	}

	public static boolean isArm(int num) {
		
		int backup=num;
		int sum=0;
		while(num>0) {
			int r=num%10;
			sum= sum + (int)Math.pow(r, numOfDigits(num));
			num=num/10;
			
		}
		
		num=backup;
		if(sum==num) {
			return true;
		}else {
			return false;
		}
		
	}

	public static int numOfDigits(int num) {
		
		int digits=0;
		while(num>0) {
			num=num/10;
			digits++;
		}
		
		return digits;
		
		
		
	
	
	
	
}
}
