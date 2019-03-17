import javax.swing.JOptionPane;

public class RaceCarRunner {
	public static void main(String[] args) {
		/* Do the following things without changing the RaceCar class */
		
		// 1. Create a RaceCar and place it in 5th position
		RaceCar RC = new RaceCar("Chevy", 1 );
		// 2. Print the RaceCar's position in the race
		int position = RC.getPositionInRace();
				System.out.println("Your car is in position " + position);
		
		
		// 3. Crash the RaceCar
		RC.crash();
		// 4. If the car is damaged. Bring it in for a pit stop.
		
		// 5. Help the car move into first place.
		System.out.println("Your car passed those three cars and is in position " + position + " again!");
	}
}
