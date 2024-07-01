package lec_15;

public class rec_arr_02 {
	public static void main(String[] args) {
		
		int[] arr = {10,20,30,40};
//		print_rev(0,arr.length-1 ,arr);
		
		
		
		int[] arr2 = {5,10,5,10,10,5};
//		System.out.println(max(0,arr2.length-1 , arr2));
		System.out.println(FO(0 , 10 , arr2));
		
		}
		
	
	
	
	
public static void print_rev(int s, int e, int[] arr) {
		
		if(s>e) {
			return;
		}
		
		print_rev(s+1, e,arr);
		System.out.println(arr[s]);
		
		
	}

	
public static int max(int s, int e, int[] arr) {
	
	if(s>e) {
		return Integer.MIN_VALUE;
	}
	
	int sp = max(s+1 , e ,arr);
	
	return Math.max(arr[s], sp);
	
}


public static int min(int s, int e, int[] arr) {
	
	if(s>e) {
		return Integer.MAX_VALUE;
	}
	
	int sp = min(s+1 , e ,arr);
	
	return Math.min(arr[s], sp);
	
}


public static int FO(int s, int ali, int[] arr2) {
	
	if (s == arr2.length) {
		return -1;
	}
	
	int sp = FO(s + 1, ali, arr2);
	if (arr2[s] == ali) {
		return s;
	}
	
	return sp;
}


public static int LO(int s, int ali, int[] arr2) {
	
	if (s == arr2.length) {
		return -1;

	}
	
	int sp = LO(s + 1, ali, arr2);
	if (sp == -1 && arr2[s] == ali) {
		return s;
	}
	
	return sp;
}


}
