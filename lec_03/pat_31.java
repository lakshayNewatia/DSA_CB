package lec_03;

public class pat_31 {

	public static void main(String[] args) {
		
		int n=5;
		int row=1;
		int total_star=n;
		
		
		
		while(row<=n) {
			
			
			
			
			
			int cnt_star=0;
			
			int ntp=5;
			while(cnt_star<total_star) {
				
				if(row+cnt_star==n) {
					System.out.print("*"+"\t");
				}else {
					System.out.print(ntp+"\t");
				}
				
				
				cnt_star++;
				ntp--;
			}
			
			
			
			
			
			
			
			
			System.out.println();
			row++;
			
			
		}
	}



}
