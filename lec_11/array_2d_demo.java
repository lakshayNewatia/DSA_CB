package lec_11;

public class array_2d_demo {
	public static void main(String[] args) {
		
		int mat [][] = new int[5][3];
		
		System.out.println(mat);
		System.out.println(mat.length); //row no.
		
		System.out.println(mat[0]);
		System.out.println(mat[1]);
		System.out.println(mat[2]);
		System.out.println(mat[3]);
		System.out.println(mat[4]);
		//System.out.println(mat[5]); //out of bound
		
		
		//mat[0]=10; //matlab kuch bhi??
		
		
		System.out.println(mat[0].length); //colm no.
		
		//assigning values
		mat[0][0]=10;
		mat[0][1]=20;
		mat[0][2]=30;
		
		
		//enhanced loop for printing
		for(int[]row:mat) {
			for(int ele:row) {
				System.out.print(ele+" ");
			}
			System.out.println();
		}
		
		
		//normal loop for printing
		for(int r = 0 ; r<mat.length ; r++) {
			
			for(int c =0 ; c < mat[0].length ; c++) {
				
				System.out.print(mat[r][c]+" ");
				
			}
			System.out.println();
		}
		
		
	}

}
