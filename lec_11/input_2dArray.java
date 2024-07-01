package lec_11;
import java.util.*;

public class input_2dArray {
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int R= scn.nextInt();
		int C= scn.nextInt();
		
		int mat[][] = new int[R][C];
		
        for(int r = 0 ; r<mat.length ; r++) {
			
			for(int c =0 ; c < mat[0].length ; c++) {
				
				mat[r][c] = scn.nextInt();
				
			}
		}
        
        //display
        for(int[]row:mat) {
			for(int ele:row) {
				System.out.print(ele+" ");
			}
			System.out.println();
		}
        
        
        
		
	}

}
