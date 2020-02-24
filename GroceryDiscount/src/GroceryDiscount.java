import java.util.Scanner;
public class GroceryDiscount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);

		System.out.print("Please enter the cost of your groceries or '0' to quit: ");
		while (in.hasNextDouble())
		{
			Double cost = in.nextDouble();
			if (cost==0)
				break;
			else if (cost<10||cost>1000) 
			{
				System.out.println("Out of range");
				System.out.println();
			}
			else if (cost<=60)
			{
				String cost1 = String.format("%.2f", (cost*.08));
				System.out.println("You win a discount coupon of $" + cost1 + ". (8% of your purchase)");
				System.out.println();
			}
			else if (cost<=150)
			{
				String cost1 = String.format("%.2f", (cost*.1));
				System.out.println("You win a discount coupon of $" + cost1 + ". (10% of your purchase)");
				System.out.println();
			}
			else if (cost<=210)
			{
				String cost1 = String.format("%.2f", (cost*.12));
				System.out.println("You win a discount coupon of $" + cost1 + ". (12% of your purchase)");
				System.out.println();
			}
			else if (cost>210)
			{
				String cost1 = String.format("%.2f", (cost*.14));
				System.out.println("You win a discount coupon of $" + cost1 + ". (14% of your purchase)");
				System.out.println();
			}
			System.out.print("Please enter the cost of your groceries or '0' to quit: ");
		}
	}

}
