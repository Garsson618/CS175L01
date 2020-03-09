import java.util.Scanner;
public class heatIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		System.out.println("                              NOAA's National Weather Service");
		System.out.println("                                         Heat Index");
		System.out.println();
		System.out.println("Relative Humidity (%)                  Temperature(°F)");
		System.out.println("_______________________________________________________________________________________");
		System.out.print("|     ");
		for(int T = 80; T <= 110; T=T+2)
			System.out.printf("%5d",T);
		System.out.println("|");
		System.out.println("|    _________________________________________________________________________________|");
		for (int RH = 40; RH <= 100;RH=RH+5)
		{
			if (RH!=100)
				System.out.print("| "+RH+" |");
			if (RH==100)
				System.out.print("|"+RH+" |");
			int count = 0;
			for(int T = 80; T <= 110-count; T=T+2)
			{
				double HI1 = -42.379 + 2.04901523*T + 10.14333127*RH - .22475541*T*RH - .00683783*T*T - .05481717*RH*RH + .00122874*T*T*RH + .00085282*T*RH*RH - .00000199*T*T*RH*RH;
				long HI=Math.round(HI1);
				if (HI<=137) {
					if (RH==95&&T==92) 
						System.out.print("     ");
					else
						System.out.printf("%5d",HI);
				}
				else if (HI>137)
					System.out.print("     ");
			}
			System.out.println("|");
		}
		System.out.println("|____|________________________________________________________________________________|");
		System.out.println();


		String advisory;
		int end = 1;
		while (end!=0)
		{
			System.out.print("Enter  temperature or 0 to end: ");
			int iTemp = in.nextInt();
			if (iTemp == 0)
				break;
			System.out.print("Enter relative humidity: ");
			int iHumid = in.nextInt();
			long iTHI =  (long) (-42.379 + 2.04901523*iTemp + 10.14333127*iHumid - .22475541*iTemp*iHumid - .00683783*iTemp*iTemp - .05481717*iHumid*iHumid + .00122874*iTemp*iTemp*iHumid + .00085282*iTemp*iHumid*iHumid - .00000199*iTemp*iTemp*iHumid*iHumid);       
			long THI = Math.round(iTHI);
			if (THI<=90)
				advisory = "Caution";
			else if (THI<105)
				advisory = "Extreme Caution";
			else if (THI<126)
				advisory = "Danger";
			else
				advisory = "Extreme Caution";
			System.out.println("The THI for a temperature of "+iTemp+" and  relative humidity of "+iHumid+" is: "+THI+"   Advisory: "+advisory);
			System.out.println();
		}
	}
}
