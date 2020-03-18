package mentor_questions;

public class Largest_Smallest {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3,4,5,6,7,8,9,10,12,13,14,15,16,17,18,21,20};
		int max = a[0];
int min = a[0]-1;

			for (int j = 0;j<a.length;j++) {
	
				if (a[j]>max) {
					
					max=a[j];
				
	
			}else if(a[j]<min){
				a[j]=min;
				
			}
			}
				
		System.out.println(a[min]);
		System.out.println(max);
		
			
			
}
}
			
	

	
	


