package mentor_questions;

public class Duplicate_number {

	public static void main(String[] args) {
		int[] list = { 1, 1, 3, 4, 5, 5, 6, 7, 8, 8, 9, 9 };
		for (int i = 0; i < list.length; i++) {//i is intialised with 0 because index starts from 0;i will runs till the arraylength)
			for (int j = i + 1; j < list.length; j++) {//j loop is intilaised with i+1 this index starts from 1 it will compare with all elements in array ; 
				if (list[i] == list[j]) {//it will compare 1st list and 2nd list  either they are equal or not and i should not be equals to the j ;
					System.out.println(list[i]);

				
			}
		}
	}
	}
}
