import java.util.Scanner;
public class HousePainting {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter the width of the house: ");
		double houseWidth = in.nextDouble();
		System.out.print("Enter the length of the house: ");
		double houseLength = in.nextDouble();
		System.out.print("Enter the height of the house: ");
		double houseHeight = in.nextDouble();
		System.out.print("Enter the length of the windows: ");
		double windowLength = in.nextDouble();
		System.out.print("Enter the width of the windows: ");
		double windowWidth = in.nextDouble();
		System.out.print("Enter the number of windows: ");
		double windowCount = in.nextDouble();
		double windowSqft = windowLength*windowWidth*windowCount;
		System.out.print("Enter the length of the doors: ");
		double doorLength = in.nextDouble();
		System.out.print("Enter the width of the doors: ");
		double doorWidth = in.nextDouble();
		System.out.print("Enter the number of doors: ");
		double doorCount = in.nextDouble();
		double doorSqft = doorLength*doorWidth*doorCount;
		double houseSqftNormal = 2*(houseLength*houseWidth);
		double houseSqftPeak = 2*(houseLength*houseWidth + 0.5*houseLength*(houseHeight-houseWidth));
		double houseSqftBoth = houseSqftNormal+houseSqftPeak;
		double houseSqftTotal = houseSqftBoth-windowSqft-doorSqft;
		System.out.print("Enter the price per square foot: ");
		double priceSqft = in.nextDouble();
		double totalPrice = houseSqftTotal*priceSqft;
		System.out.println("The price to paint this house is: $" + totalPrice + "0");
		
	}

}
