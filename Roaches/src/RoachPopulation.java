
public class RoachPopulation 
{
	private double pop;
	
	public RoachPopulation(double population) 
	{
		pop = population;
	}

	public void breed()
	{
		pop = pop*2;
	}

	public void spray(double q)
	{
		pop = pop-(pop*(q/100));
	}

	public int getRoaches()
	{
		pop=Math.round(pop);
		return (int) pop;
	}
}
