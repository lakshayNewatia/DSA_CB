package lec_05;

public class fucn_demo {
	public static void main(String[] args) {
		fun_1();
		add(20 , 30);
		System.out.println(sum(2 , 5));
		
	}
	
	
	
	
	public static void fun_1() {
		System.out.println("helooooooooo");
	}
	
	
	//this fucn is directly printing the sum
	public static void add(int num1 ,int num2) {
		System.out.println(num1 + num2);
	}
	
	
	//this is returning the sum , which we are printing in main func.
	public static int sum(int num1 ,int num2) {
		return num1 + num2;
	}
	

}
