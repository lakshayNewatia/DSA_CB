package lec_03;

public class pat_33 {
	public static void main(String[] args) {

		int n=10;
		int row=1;
		int tot_star=1;
		int tot_space=n-1;
		int ntp=10;
		int srn=10;
		
		
		while(row<=n) {
			
			
			int cnt_space=0;
			while(cnt_space<tot_space) {
				System.out.print("\t");
				cnt_space++;
			}
			
			
			
			
			
			
			int cnt_star=0;
			ntp=srn;   
			while(cnt_star<tot_star) {
				
				if(ntp == 10) {
					ntp=0;
				}
				
				
				System.out.print(ntp+"\t");
				
				if( cnt_star< tot_star/2) {
					ntp++;
				}else {
					ntp--;
				}
				
				cnt_star++;
				
			}
			
			
			
			
			
			
			
			
			System.out.println();
			row++;
			srn--;
			tot_star=tot_star+2;
			tot_space--;
	}

	
	}

}
