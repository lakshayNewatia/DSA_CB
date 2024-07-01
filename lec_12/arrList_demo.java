package lec_12;
import java.util.ArrayList;


public class arrList_demo {
	

	public static void main(String[] args) {
		
	    int[] arr = new int[5];
		ArrayList<Integer> AL = new ArrayList<Integer>();
		
		System.out.println(AL);
		
		AL.add(10);
		System.out.println(AL);
		AL.add(20);
		AL.add(30);
		AL.add(40); // size wale index par!!
		System.out.println(AL);
		
		//size?
		System.out.println(arr.length);
		System.out.println(AL.size());
		
//		indexing?!
		arr[0]=9;
		System.out.println(AL.get(0));
		System.out.println(AL.get(AL.size()-1));
		
		AL.set(0, 33);
		AL.set(AL.size()-1,90);
		System.out.println(AL);
		
		
		AL.add(AL.size(),12);
		System.out.println(AL);
		int ali = AL.remove(3);
		System.out.println(ali + " = "+AL);
	}

}
