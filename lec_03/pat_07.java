package lec_03;

public class pat_07 {
	public static void main(String[] args) {
		
		int n=5;
		int row=1;
		int tot_star=n;
		
		while(row<=n) {
			
			int cnt_star=0;
			while(cnt_star<tot_star) {
				
				if(cnt_star==0 || cnt_star==n-1 || row==1 ||row==n) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
				
				cnt_star++;
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			System.out.println();
			row++;
		}
		
	}

}
