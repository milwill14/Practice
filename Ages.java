
public class Ages {

	public static void main(String[] args) {
		int age[] = { 21, 16, 23, 5, 76, 8 };
		int sum = 0;

		for (int counter = 0; counter < age.length; counter++) {
			sum += age[counter];
		}
		System.out.println("The sum of the students ages are" + sum);

	}

}
