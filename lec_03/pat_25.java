package lec_03;

public class pat_25 {
	public static void main(String[] args) {
		int n=5;
		int row=1;
		int tot_star=1;
		int tot_space=n-1;
		int ntp=1;
		
		
		while(row<=n) {
			
			
			int cnt_space=0;
			while(cnt_space<tot_space) {
				System.out.print("\t");   //tabular space-> for indentation
				cnt_space++;
			}
			
			
			
			
			
			
			int cnt_star=0;
			while(cnt_star<tot_star) {
				
				System.out.print(ntp+ "\t");
				cnt_star++;
				ntp++;
			}
			
			
			
			
			
			
			
			
			System.out.println();
			row++;
			
			tot_star=tot_star+2;
			tot_space--;
	}

	}


}
