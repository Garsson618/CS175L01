import java.util.Scanner;
public class CarCostCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter Cost of regular car: ");
		double costReg = in.nextDouble();
		System.out.print("Enter Miles per gallon of regular car: ");
		double mpgReg = in.nextDouble();
		System.out.print("Enter Cost of hybrid car: ");
		double costHybrid = in.nextDouble();
		System.out.print("Enter Miles per gallon of hybrid car: ");
		double mpgHybrid = in.nextDouble();
		System.out.print("Enter miles traveled in a year: ");
		double milesPerYear = in.nextDouble();
		System.out.print("Enter cost per gallon of gas: ");
		double costGas = in.nextDouble();
		double Reg = costGas*(milesPerYear/mpgReg);
		double Hybrid = costGas*(milesPerYear/mpgHybrid);
		System.out.println("Cost to own after year 1 for regular car: " + (costReg+Reg) + " for hybrid car: " + (costHybrid+Hybrid));
		System.out.println("Cost to own after year 2 for regular car: " + (costReg+2*Reg) + " for hybrid car: " + (costHybrid+2*Hybrid));
		System.out.println("Cost to own after year 3 for regular car: " + (costReg+3*Reg) + " for hybrid car: " + (costHybrid+3*Hybrid));
		System.out.println("Cost to own after year 4 for regular car: " + (costReg+4*Reg) + " for hybrid car: " + (costHybrid+4*Hybrid));
		System.out.println("Cost to own after year 5 for regular car: " + (costReg+5*Reg) + " for hybrid car: " + (costHybrid+5*Hybrid));
		double Reg5 = costReg+5*Reg;
		double Hybrid5 = costHybrid+5*Hybrid;
		
		if (Reg5 > Hybrid5)
			System.out.println("The hybrid car pays back after 5 years");
		else
			System.out.println("The regular car pays back after 5 years");
		
	}

}
