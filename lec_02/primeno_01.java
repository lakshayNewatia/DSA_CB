package lec_02;

import java.util.Scanner;

public class primeno_01 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter number n :");
		int num = scn.nextInt();

		int divisor = 1;
		int numofFac = 0;

		while (divisor <= num) {
			int rem = num % divisor;
//			 System.out.println(divisor+ "-" + rem);

			if (rem == 0) {
				System.out.println(divisor);
				numofFac++;
			}
			divisor = divisor + 1;

		}
		System.out.println("No of factors =" + numofFac);

		if (numofFac == 2) {
			System.out.println("prime");
		} else {
			System.out.println("non prime");
		}

	}

}
