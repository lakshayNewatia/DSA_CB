package lec_12;

import java.util.ArrayList;

public class AL_QPS {
	
	public static void main(String[] args) {
		
		int[] arr1 = {5,7,10,10,10,20,30,30,50,60,60,80};
		int[] arr2 = {10,10,15,20,30,30,30,60,70,80,80,90};
		
		//System.out.println(intersection(arr1,arr2));


		int[] one = { 9, 8, 7, 5 };
		int[] two = {9, 6, 7 };
		System.out.println(add(one,two));
	}
	
	
	public static ArrayList<Integer> intersection(int[]arr1 , int[]arr2){
		
		int idx1 = 0; 
		int idx2 = 0;
		
		ArrayList<Integer> AL = new ArrayList<>();
		
		while (idx1 < arr1.length && idx2 < arr2.length) {
			
			if (arr1[idx1] < arr2[idx2]) {
				idx1++;
				
			} else if (arr2[idx2] < arr1[idx1]) {
				idx2++;
				
			} else {    //arr1[idx1]== arr2[idx2]
				AL.add(arr1[idx1]);
				idx1++;
				idx2++;
			}
		}
		return AL;
	
	}

	
	public static ArrayList<Integer> add(int[]one , int[]two){
		
		int idx1 = one.length - 1;
		int idx2 = two.length - 1;
		int carry = 0;
		
		ArrayList<Integer> AL = new ArrayList<>();
		
		while(idx1>=0 || idx2>=0) {
//			int sum = one[idx1]+ two[idx2]+ carry;  //index out of bound
			int sum = carry;
			if (idx1 >= 0) {
				sum = sum + one[idx1];
			}
			if (idx2 >= 0) {
				sum = sum + two[idx2];
			}
			
			carry = sum/10;
			int digit = sum%10;
			
			AL.add(0,digit);
			
			idx1--;
			idx2--;
			
		}
		if(carry>0) {
			AL.add(0,carry);
		}
		
		return AL;
		
	}
}
