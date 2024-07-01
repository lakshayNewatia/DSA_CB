package lec_03;

public class pat_32 {
	public static void main(String[] args) {

		int n=5;
		int row=1;
		int tot_star=1;
		int ntp=1;
		int srn=1;
		
		
		while(row<=2*n-1) {
			
			ntp=srn;
			int cnt_star=0;
			while(cnt_star<tot_star) {
				if(cnt_star % 2 != 0) {
					System.out.print("*"+"\t");
				}else {
					System.out.print(ntp+"\t");
				}
				
				cnt_star++;
			}
			
			
			
			System.out.println();
			row++;
			ntp++;
			
			if(row<=n) {
				tot_star=tot_star+2;
				srn++;
			}else {
				tot_star=tot_star-2;
				srn--;
			}
			
			
		}
		
		
	
	}

}
