package lec_01;

public class odd_even03 {
	public static void main(String[] args) {

		int num = 45;
		int rem = num % 2;
		System.out.println(rem);

		if (rem == 0) {
			System.out.println("even");
		} else {
			System.out.println("odd");
		}
	}

}
