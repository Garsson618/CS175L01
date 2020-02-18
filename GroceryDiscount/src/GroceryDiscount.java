import java.util.Scanner;
public class GroceryDiscount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		Boolean run = true;
		while (run == true)
		{
		System.out.print("Please enter the cost of your groceries or '0' to quit: ");
		Double cost = in.nextDouble();
		if (cost==0)
			run = false;
		else if (cost<10) 
		{
			System.out.println("You are not eligable for a coupon at this time.");
			System.out.println();
		}
		else if (cost<=60)
		{
			String cost1 = String.format("%.2f", (cost*.08));
			System.out.println("You win a discount coupon of $" + cost1 +". (8% of your purchase)");
			System.out.println();
		}
		else if (cost<=150)
		{
			String cost1 = String.format("%.2f", (cost*.1));
			System.out.println("You win a discount coupon of $" + cost1 +". (10% of your purchase)");
			System.out.println();
		}
		else if (cost<=210)
		{
			String cost1 = String.format("%.2f", (cost*.12));
			System.out.println("You win a discount coupon of $" + cost1 +". (12% of your purchase)");
			System.out.println();
		}
		else if (cost>210)
		{
			String cost1 = String.format("%.2f", (cost*.14));
			System.out.println("You win a discount coupon of $" + cost1 +". (14% of your purchase)");
			System.out.println();
		}
		
		}
	}

}
