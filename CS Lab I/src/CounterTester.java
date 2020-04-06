
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

		Counter anotherVenue = new Counter();
		anotherVenue.clickMany(10);
		anotherVenue.unclickMany(5);
		click=anotherVenue.getValue();
		System.out.println("5");
		System.out.println(click);
		anotherVenue.reset();
		anotherVenue.clickMany(3);
		anotherVenue.unclickMany(4);
		click=anotherVenue.getValue();
		System.out.println("-1");
		System.out.println(click);
		
	}

}
