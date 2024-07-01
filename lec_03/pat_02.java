//Q2
package lec_03;

public class pat_02 {
	public static void main(String[] args) {
		int n=5;
		int row=1;
		int total_star=1;
		while(row<=n) {
			
			int cnt_star=0;
			while(cnt_star<total_star) {
				System.out.print("*");
				cnt_star++;
			}
			
			
			total_star++;
			
			
			
			
			
			
			
			
			System.out.println();
			row++;
		}
	}

}
