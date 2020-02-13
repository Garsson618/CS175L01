import java.util.Scanner;
import java.lang.Number;
public class CarCostCalculationv2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter information for the regular car: ");
		String Reg1 = in.nextLine();
		String nameReg = Reg1.substring(0,14);
		String costRegStr = Reg1.substring(15,20);
		double costReg = Double.parseDouble(costRegStr);
		String mpgRegStr = Reg1.substring(21,23);
		double mpgReg = Double.parseDouble(mpgRegStr);
		
		System.out.print("Enter information for the hyrbrid car: ");
		String Hybrid1 = in.nextLine();
		String nameHybrid = Hybrid1.substring(0,12);
		String costHybridStr = Hybrid1.substring(13,18);
		double costHybrid = Double.parseDouble(costHybridStr);
		String mpgHybridStr = Hybrid1.substring(19,21);
		double mpgHybrid = Double.parseDouble(mpgHybridStr);
	
		System.out.print("Enter miles traveled in a year: ");
		double milesPerYear = in.nextDouble();
		System.out.print("Enter cost per gallon of gas: ");
		double costGas = in.nextDouble();
		double Reg = costGas*(milesPerYear/mpgReg);
		double Hybrid = costGas*(milesPerYear/mpgHybrid);
		System.out.println("Cost to own "+nameReg+" after year 1 for regular car: " + (costReg+Reg) + " for "+nameHybrid+": " + (costHybrid+Hybrid));
		System.out.println("Cost to own "+nameReg+" after year 2 for regular car: " + (costReg+2*Reg) + " for "+nameHybrid+": " + (costHybrid+2*Hybrid));
		System.out.println("Cost to own "+nameReg+" after year 3 for regular car: " + (costReg+3*Reg) + " for "+nameHybrid+": " + (costHybrid+3*Hybrid));
		System.out.println("Cost to own "+nameReg+" after year 4 for regular car: " + (costReg+4*Reg) + " for "+nameHybrid+": " + (costHybrid+4*Hybrid));
		System.out.println("Cost to own "+nameReg+" after year 5 for regular car: " + (costReg+5*Reg) + " for "+nameHybrid+": " + (costHybrid+5*Hybrid));
		double Reg5 = costReg+5*Reg;
		double Hybrid5 = costHybrid+5*Hybrid;
		
		if (Reg5 > Hybrid5)
			System.out.println("The "+nameHybrid+" pays back after 5 years");
		else
			System.out.println("The "+nameReg+" pays back after 5 years");
		
	}

}
