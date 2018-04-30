import java.util.Random;
public class Statistics {
	//This class shows the score of a class final exam
	public static void main(String[] args) {
		Random rand = new Random();
		int freq[]=new int[101];
		
		for(int roll=1;roll<50;roll++) {
			++freq[1+rand.nextInt(100)];
		}
		
		System.out.println("Grade\tFrequency");
		
		for(int face=1;face<freq.length;face++) {
			System.out.println(face+"\t"+freq[face]);
		}
	}
}
