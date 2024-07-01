package lec_01;
import java.util.Scanner;

public class HW_Q2 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter number :");
		int num = scn.nextInt();
		
		int sum=0;
		int i=1;
		while( i <= num) {
			sum = sum +i;
			i++;
			
		}
		System.out.println(sum);
	}

}
