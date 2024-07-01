package lec_03;

public class pat_24 {
	
	public static void main(String[] args) {
		int n=5;
		int row=1;
		int tot_star=1;
		int tot_space=n-1;
		int ntp=1;
		
		
		while(row<=n) {
			
			
			int cnt_space=0;
			while(cnt_space<tot_space) {
				System.out.print(" ");
				cnt_space++;
			}
			
			
			
			
			
			
			int cnt_star=0;
			while(cnt_star<tot_star) {
				
				System.out.print(ntp);
				cnt_star++;
			}
			
			
			
			
			
			
			
			
			System.out.println();
			row++;
			ntp++;
			tot_star=tot_star+2;
			tot_space--;
			
	}

	}


}
