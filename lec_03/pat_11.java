package lec_03;

public class pat_11 {
	public static void main(String[] args) {
		
		int n=5;
		int row=1;
		int tot_space=n-1;
		int tot_star=1;
		
		
		while(row<=n) {
			
			int cnt_space=0;
			while(cnt_space<tot_space) {
				System.out.print(" ");
				cnt_space++;
			}
			
			int cnt_star=0;
			while(cnt_star<tot_star) {
				
				if(cnt_star%2==0) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
				
				cnt_star++;
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			System.out.println();
			row++;
			tot_star=tot_star+2;
			tot_space--;
		}
	}

}
