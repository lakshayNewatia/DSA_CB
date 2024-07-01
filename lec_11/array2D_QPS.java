package lec_11;

public class array2D_QPS {
	
	public static void main(String[] args) {
		
		int[][] arr = { 
				{ 11, 12, 13, 14 }, 
				{ 21, 22, 23, 24 }, 
				{ 31, 32, 33, 34 }, 
				{ 41, 42, 43, 44 } }	;
		
		wave(arr);
//		spiral_anti(arr);
//		System.out.println(find(arr , 43));
	}
	
	
	
	
	public static void wave(int [][]arr) {
		
		for (int c = 0; c < arr[0].length; c++) {
			
			if (c % 2 == 0) {
				
				for (int r = 0; r < arr.length; r++) {
					System.out.print(arr[r][c]+" ");
				}
				
			} else {
				
				for (int r = arr.length - 1; r >= 0; r--) {
					System.out.print(arr[r][c]+" ");
				}
			}
			System.out.println();
		}
	}
	
	
	
	public static void spiral_anti(int[][] arr) {
		
		int min_r=0;
		int max_r=arr.length-1;
		int min_c=0;
		int max_c=arr[0].length-1;
		
		int cnt=0;
		int tot_ele= arr.length*arr[0].length;
		
		while((min_r<=max_r) && (min_c<=max_c)){
		
		
		    //1.
			for(int r=min_r ; r <= max_r && cnt<tot_ele ; r++) {
				System.out.print(arr[r][min_c]+" ");
				cnt++;
			}
			System.out.println();
			
			
			//2.
			for(int c= min_c+1 ; c<= max_c && cnt<tot_ele ; c++) {
				System.out.print(arr[max_r][c]+" ");
				cnt++;
			}
			System.out.println();
			
			
			//3.
			for(int r= max_r-1 ; r >= min_r && cnt<tot_ele; r--) {
				System.out.print(arr[r][max_c]+" ");
				cnt++;
			}
			System.out.println();
			
			
			//4.
			for(int c= max_c-1 ; c> min_c && cnt<tot_ele; c--) {
				System.out.print(arr[min_r][c]+" ");
				cnt++;
			}
			System.out.println();
			
			
			
			
			
			min_c++;
			min_r++;
			max_c--;
			max_r--;
		
		
		}

	}
	
	
	
	public static boolean find(int [][]arr , int ele) {
		
		int r = 0;
		int c = arr[0].length - 1;
		 
		while(c>=0 && r<arr.length) {
			
			if(arr[r][c] == ele) {
				return true;
				
			}else if(ele < arr[r][c]) {
				c--;
				
			}else {
				r++;
			}
		}
		
		return false;
		
		
		
	}
 	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
