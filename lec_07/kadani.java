package lec_07;

public class kadani {
	public static void main(String[] args) {
		int[] arr= {10, 20, 30, -40, 50 ,-71 ,40 ,20};
		kadaani(arr);
		
	}
	
	
	public static void kadaani(int[] arr) {
		
		int sum=0;
		int ans=0;
		
		for(int i=0 ; i<arr.length ; i++) {
			sum=sum+ arr[i];
			
			if(sum<0) {
				sum=0;
			}
			ans= Math.max(ans, sum);
			
		}
		System.out.println(ans);	
			
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
