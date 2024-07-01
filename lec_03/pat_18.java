package lec_03;

public class pat_18 {
	public static void main(String[] args) {
		
		int n=7;
		int row=1;
		int tot_star=1;
		int tot_space=3;
		
		while(row<=n) {
			
			int cnt_space=0;
			while(cnt_space<tot_space) {
				System.out.print(" ");
				cnt_space++;
			}
			
			
			int cnt_star=0;
			while(cnt_star<tot_star) {
				System.out.print("*");
				cnt_star++;
			}
			
			
			
			
			
			System.out.println();
			row++;
			
			if(row<=4) {
				tot_space--;
				tot_star=tot_star+2;
			}else {
				tot_space++;
				tot_star=tot_star-2;
			}
			
		}
	}

}
