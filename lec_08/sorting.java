package lec_08;


public class sorting {
	
	public static void main(String[] args) {
		
		
		int []arr = {88 , 66 , 55 , 44, 22 };
		bubble(arr);
		//insertion(arr);
//		selection(arr);
//		
		display(arr);
		
	}
	
	
	
	
	public static void bubble(int[] arr) {
		//how may times??
		for(int cnt=0 ; cnt<arr.length ; cnt++) {
		
		//bubble and swapping logic
			for(int idx=0 ; idx<arr.length-cnt-1 ; idx++) {
			
				if(arr[idx+1]<arr[idx]) {
					int temp = arr[idx];
					arr[idx]=arr[idx+1];
					arr[idx+1] = temp;
				}
			
			}
	    }
   }
	
	
	public static void selection(int[] arr) {
		
		for (int cnt = 0; cnt< arr.length-1; cnt++) {
			
			int last= arr.length-cnt-1;
			int max_idx = last;
			for (int idx = 0; idx < last; idx++) {
				if (arr[idx] > arr[max_idx]) {
					max_idx = idx;
				}
			}
			
			//swap!!
			//max and last
			int temp = arr[max_idx];
			arr[max_idx] = arr[last];
			arr[last] = temp;
			
		}
	}
	
	
	public static void insertion(int[] arr) {
		
		for(int cnt=0 ; cnt<arr.length-1 ; cnt++) {
		
		
			//logic for 1 element
			int idx= cnt;
			int ele= arr[idx+1];
			
			while(idx>=0 && arr[idx] > ele) {
				arr[idx+1] = arr[idx];
				idx--;
			}
			
			arr[idx+1] = ele;
		}
	}
	
	
	
	
	
	public static void display(int[]arr) {
		for(int ele:arr) {
			System.out.print(ele+" ");
		}
		System.out.println(); //for next line
	}

}
