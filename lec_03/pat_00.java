package lec_03;

public class pat_00 {
	public static void main(String[] args) {
		int total_star=5;  //no. of star in a row
		int crnt_star=0;   //current star
		while(crnt_star<total_star) {
			System.out.println("*");  //print in different line
			//System.out.print("*");   //print in same line
			crnt_star++;
		}
	}

}
