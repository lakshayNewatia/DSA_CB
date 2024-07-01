package lec_03;

public class pat_08 {
	public static void main(String[] args) {
		int n=5;
		int row=1;
		int tot_star=n;

		
		while(row<=n) {
			
			int cnt_star=0;
			while(cnt_star<tot_star) {
				
				if(row-cnt_star==1 || row + cnt_star==n) {      //cnt_star signifies column.
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
