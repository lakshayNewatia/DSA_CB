package lec_14;

public class rec_arr_01 {
	
	public static void main(String[] args) {
		
		int[] arr = {10,20,30,40};
//		print_arr1(0,arr.length-1, arr);
//		print_arr2(0,arr.length-1, arr);
		print_arr3(0, arr.length-1, arr);
		
	}
	
	
	public static void print_arr1(int s , int e, int[]arr) {

		//BP : (s,e)
		//SP : (s,e-1)
		
		if(e<s) {
			return;
		}
		
		print_arr1(s , e-1, arr); //10,20,30		
		System.out.println(arr[e]);
	}
	
	public static void print_arr2(int s , int e, int[]arr) {
		
		//BP : (s,e)
		//SP : (s+1,e)
		
		if(s>e) {
			return;
		}
		
		System.out.println(arr[s]);
		print_arr2(s+1 , e , arr);
		
	}
		
	public static void print_arr3(int s, int e, int[] arr) {
		
		if(s>e) {
			return;
		}
		
		int mid = (s+e)/2;
		
		print_arr3(s,mid-1, arr);
		System.out.println(arr[mid]);
		print_arr3(mid+1, e, arr);
	}
	
	

}
