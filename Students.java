
public class Students {
	public void Records() {
		String s = "attention";
		String time = "Class starts at 9:00.";

		String kid = "Justin Tyme";
		int age = 14;
		
		System.out.println(kid.indexOf('t'));
		System.out.println(s.toUpperCase());
		
		if(time.startsWith("Class")) {
			System.out.println("Class time begins in the morning");
		}
		
		System.out.println(s.concat(time));
	}

}
