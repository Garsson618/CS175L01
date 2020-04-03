
public class CounterTester {

	public static void main(String[] args) {
		Counter venue = new Counter();
		for (int i=0;i<10;i++)
			venue.click();
		for (int i=0;i<5;i++)
			venue.unclick();
		int click=venue.getValue();
		System.out.println("5");
		System.out.println(click);
		
		venue.reset();
		for (int i=0;i<3;i++)
			venue.click();
		for (int i=0;i<4;i++)
			venue.unclick();
		click=venue.getValue();
		System.out.println("-1");
		System.out.println(click);
		
		/*
		concertCounter.click();
		rValue=concertCounter.getValue();
		System.out.println(rValue);

		concertCounter.unclick();
		concertCounter.unclick();
		rValue=concertCounter.getValue();
		System.out.println("concertcounter =" + rValue);
		 */
	}

}
