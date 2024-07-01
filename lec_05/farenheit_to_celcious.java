package lec_05;

public class farenheit_to_celcious {
	
	public static void main(String[] args) {
		
		int min_f = 0;
		int max_f = 100;
		int step = 20;
		
		
		while(min_f <= max_f) {
			
			//int c =  5/9 * (min_f-32);   //will give 0 for every value
			
			int c =  (int)((5.0)/9 * (min_f-32));  //m1
			//int c = 5 * (min_f-32)/9;            //m2
			
			System.out.println( min_f+"    "+c );
			
			min_f  = min_f + step;
		}
	}

}
