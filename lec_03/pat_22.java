package lec_03;

public class pat_22 {

	public static void main(String[] args) {
		
		int n=5;
		int row=1;
		int tot_star=5;
		int tot_space=-1;
		
		
		while(row<=n) {
			
			int cnt_star1=0;
			while(cnt_star1<tot_star) {
				System.out.print("* ");
				cnt_star1++;
			}
			
			int cnt_space=0;
			while(cnt_space<tot_space) {
				System.out.print("  ");
				cnt_space++;
			}
			
			
			int cnt_star2=0;
			if(cnt_star2==n-1) {
				tot_star--;
			}
			
			while(cnt_star2<tot_star) {
				
				
				
				System.out.print("* ");
				cnt_star2++;
				
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			System.out.println();
			row++;
			tot_star--;
			tot_space=tot_space+2;
			
		}
	}


	

}
