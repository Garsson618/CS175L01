
public class RoachSimulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RoachPopulation bugs = new RoachPopulation(10);
		System.out.println("The Initial Roach population is " + bugs.getRoaches());
		bugs.breed();
		System.out.println("The Roach population after cycle 1 breeding is " + bugs.getRoaches());
		bugs.spray(50);
		System.out.println("The Roach population after cycle 1 50 percent spraying is " + bugs.getRoaches());
		bugs.breed();
		System.out.println("The Roach population after cycle 2 breeding is " + bugs.getRoaches());
		bugs.spray(60);
		System.out.println("The Roach population after cycle 2 60 percent spraying is " + bugs.getRoaches());
		bugs.breed();
		System.out.println("The Roach population after cycle 3 breeding is " + bugs.getRoaches());
		bugs.spray(70);
		System.out.println("The Roach population after cycle 3 70 percent spraying is " + bugs.getRoaches());
		bugs.breed();
		System.out.println("The Roach population after cycle 4 breeding is " + bugs.getRoaches());
		bugs.spray(80);
		System.out.println("The Roach population after cycle 4 80 percent spraying is " + bugs.getRoaches());
		
		
	}

}
