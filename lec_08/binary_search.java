package lec_08;

public class binary_search {
	
	public static void main(String[] args) {
		int[] arr = { 5, 7, 11, 12, 15, 20, 31, 33, 35, 40, 45, 55, 58, 66, 71 };
//		System.out.println(bin_search(arr,12));
		
		System.out.println(agnostic_bn(arr,12));
	}
	
	
	public static int bin_search(int[] arr , int element) {
		
		int s = 0;
		int e = arr.length - 1;
		
		while (s<=e) {
			int mid = (s+e)/2;
			
			if(arr[mid]==element) {
				return mid;
			}else if(arr[mid]>element) {
				e = mid-1;
			}else {
				s = mid+1;
			}
			
		}
		return -1;
		
		
		
	}
	
	public static int agnostic_bn(int[] arr , int element) {
		
		int s= 0;
		int e= arr.length-1;
		
		
		
		boolean isAsc = arr[s]< arr[e];
		
		while(s <= e) {
			int mid= s+ (e-s)/2;
			if(arr[mid] == element) {
				return mid;
			}
			
			if(isAsc) {
				if(arr[mid]>element) {
					e = mid-1;
				}else {
					s = mid+1;
				}
			}else {
				if(arr[mid]>element) {
					s = mid+1;
				}else {
					e = mid-1;
				}
			}
		}
		
		
		return -1;
	}

}
