import java.util.Scanner;

// Created by Milen Williams
// This program informs users of their grades

public class Innegrate1 {

	private static Scanner input;

	public static void main(String[] args) {
		
		String greet = "Hello user!";
		
		System.out.println(greet);
		
		input = new Scanner(System.in); 
		
		System.out.println("Enter your name: ");
		String line = input.nextLine();
		
		// This tells them what they entered
		System.out.println("Hello " + line);
		
		System.out.println("Type Start to Begin");
		String text = input.nextLine();
		
		switch (text) {
		case "start":
			System.out.println("Proceed with program");
			break;
			
		case "Start":
			System.out.println("Proceed with program");
		default:
			System.out.println("Error");
		}
		
		System.out.println("Please enter your score");
		double grade = input.nextDouble();
		
		if(grade < 60) {
			System.out.println("You failed.");
		}
		else {
			System.out.println("Congratulations! You passed.");
			}
		Problems problemsample = new Problems();
		
		problemsample.sampleProblem();
		
		Students studentRecords = new Students();
		studentRecords.Records();
		
		}
	
}
