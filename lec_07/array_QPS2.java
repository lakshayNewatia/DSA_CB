package lec_07;

public class array_QPS2 {
	
	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5};
//		System.out.println(find(arr,7));
		
		display(arr);
//		arr=rev_1(arr);
		
//		rev_2(arr , 0 , 5);
//		display(arr);
		
		rot_1(arr, 2);
//		rot_2(arr, 2);
		display(arr);
	}
	
	public static int find(int arr[] , int ele) {
		
		for(int idx=0 ; idx<arr.length ; idx++)
		if(arr[idx]==ele) {
			return idx;
		}
		return -1;
		
	}
	
	//on different add.
	public static int[] rev_1(int[] arr) { 
		
		int idx1=0;
		int idx2=arr.length-1;
		int[] rev_arr= new int[arr.length];  //created to solve the problem
		
		while(idx2>=0) {
			rev_arr[idx1] = arr[idx2];
			idx1++;
			idx2--;
		}
		return rev_arr;
		
	}
	
	//on same add.
	public static void rev_2(int[] arr , int l , int r) {
		
		while(l<r) {
			//swap
			int temp=arr[l];
			arr[l]=arr[r];
			arr[r]=temp;
			l++;
			r--;
			
		}
		
	}
	
	
	public static void rot_1(int[] arr , int rot) {
		
		rot= rot % arr.length;
		for(int i=0 ; i<rot ; i++) {
			
			//main code
			int temp = arr[arr.length-1];  //to store 50
			for(int idx=arr.length-2 ; idx>=0; idx--) {
				arr[idx+1]=arr[idx];
			}
			arr[0] = temp; //putting 50 on starting
		
		}
		
	}
	
	//more optimised
	public static void rot_2(int[]arr , int rot ) {
		
		rot= rot % arr.length;
		
		//full reverse
		rev_2(arr , 0 , arr.length-1);
		
		//part1 rev->  0 to rot-1
		rev_2(arr , 0 , rot-1);
		
//		part2 rev->  rot to length-1
		rev_2(arr , rot , arr.length-1);
		
		
	}
	
	
	
	
	
	
	
	public static void display(int[]arr) {
		for(int ele:arr) {
			System.out.print(ele+" ");
		}
		System.out.println(); //for next line
	}

}
