package lec_07;

public class subarrays {
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4 ,5};
//		print_subArr(arr);
		sum1(arr);
			
	}
	
	
	
	
		public static void  sum1(int[] arr) {
			for(int i=0 ; i<arr.length ; i++) {
				
				for(int j=i ; j<arr.length ; j++) {
					
					int sum=0;
					for(int k=i ; k<=j ; k++) {
						
						System.out.print(arr[k]+" ");
						sum = sum + arr[k];
						
					}
					
					System.out.print("---->"+sum);
					System.out.println();
				}
			}
			
		}
		
		
		public static void  sum2(int[] arr) {
			for(int i=0 ; i<arr.length ; i++) {
				
				int ans=0;
				for(int j=i ; j<arr.length ; j++) {
					
					ans= ans+arr[j];
					System.out.println(ans);
				}
					
			}
			
		}
		
		
		
		
		
		public static void  print_subArr(int[] arr) {
			for(int i=0 ; i<arr.length ; i++) {
				
				for(int j=i ; j<arr.length ; j++) {
					
					
					for(int k=i ; k<=j ; k++) {
						
						System.out.print(arr[k]+" ");
						
					}
					
					System.out.println();
				}
			}
			
		}
	

}
