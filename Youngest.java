
public class Youngest {

	public static void main(String[] args) {
		int cap[] = {15,21,17,19,20,19};
		System.out.println(cap[4]);
		System.out.println("The youngest student is = " + getMinValue(cap));
		
		// Counts the amount of class one can take.
		int counter = 0;
		while (counter < 7) {
			System.out.println(counter);
			counter++;
		}
	}
	
	public static int getMinValue(int[] cap) {
		int minValue = cap[0];
		for(int i=1;i<cap.length;i++) {
			if(cap[i] < minValue) {
				minValue = cap[i];
			}
		}
		return minValue;
	}
}
