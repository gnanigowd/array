package mentor_questions;

public class Multiple_duplicates {

	public static void main(String[] args) {
		int list[] = {2,2,2,3,3,4,4,4,5,6,6,6,7,8,9,1};
		for (int i = 0; i<list.length;i++) {
			for (int j =i+2;j<list.length;j++) {
				if ((list[i]==list[j]) && (i!=j)){
					System.out.println(list[j]);
				}
			}
		}

	}

}
