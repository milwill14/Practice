
public class Schedule {

	public static void main(String[] args) {
		
		Bell New4Object = new Bell();
		Bell New4Object2 = new Bell(5);
		Bell New4Object3 = new Bell(5,56);
		Bell New4Object4 = new Bell(5,12,14);
		
		System.out.printf("%s\n", New4Object.toMilitary());
		System.out.printf("%s\n", New4Object2.toMilitary());
		System.out.printf("%s\n", New4Object3.toMilitary());
		System.out.printf("%s\n", New4Object4.toMilitary());
		
	}

}
