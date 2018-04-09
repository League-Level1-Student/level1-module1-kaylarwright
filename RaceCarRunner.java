

public class RaceCarRunner {
	public static void main(String[] args) {
		/* Do the following things without changing the RaceCar class */
		
		// 1. Create a RaceCar and place it in 5th position
	RaceCar speedy = new RaceCar("speedy", 5);
		// 3. Get the RaceCar to print its position in the race.
	int p = speedy.getPositionInRace();
	System.out.println(p);

		// 4. Crash the RaceCar
	speedy.crash();
		
		// 5. If the car is damaged. Bring it in for a pit stop.
	speedy.pit();

		// 6. Help the car move into first place.
	for (int i = 1; i < 8; i++) {
		speedy.overtake();
	}

	}
}
