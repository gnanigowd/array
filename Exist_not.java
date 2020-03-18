package mentor_questions;

public class Exist_not {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int num = 8;
		int add = 0;
		for (int i = 0; i < a.length; i++) {

		if (num == a[i]) {
			
			System.out.println(num + "is exist");
			
		} else {
			add = add + 1;
			
		}
		if (add == a.length) {
			System.out.println("Not existed");
		}
		}
	}
}


