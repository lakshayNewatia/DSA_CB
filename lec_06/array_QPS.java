package lec_06;

public class array_QPS {
	public static void main(String[] args) {
		
		int[] arr = { 10, 11, 3, 10, 99, -2 };
		revPrint(arr);
		System.out.println(max(arr));
		
//		for(int elements:arr) {
//			System.out.print(elements+" ");  //---->this shows elements are not actually reversed
//		}
		
	}

	public static void revPrint(int[] arr) {
		
		for(int idx= arr.length-1 ; idx>=0 ; idx--) {
			System.out.print(arr[idx]+" ");
		}

//		System.out.println();
	}
	
	
	public static int max(int[] arr) {
//		int jeb = arr[1];
		int jeb = Integer.MIN_VALUE;
		for(int aam : arr) {
			if(aam >jeb) {
				jeb = aam;
			}
		}
		return jeb;
			
			
	}

	}












