package scenario_based;

public class SnakesAndLadders {
	
	// UC 1: Game Starts With Position 0.
	static final int START_POS = 0;
	static final int WINNING_POS = 100;

	public static void main(String[] args) {
		System.out.println("...Snakes And Ladders Game...");
		String[] option = { "No Play", "Ladder", "Snake" };
		int player1Pos = START_POS;
		int player2Pos = START_POS;
		boolean player1Turn = true;
		int diceRoll = 0;
		while (player1Pos < WINNING_POS && player2Pos < WINNING_POS) {

			String currPlayer = player1Turn ? "Player 1" : "Player 2";

			// UC 2: The Player rolls the die.
			int dice = (int) (Math.random() * 6) + 1;
			diceRoll++;
			
			int pos;
			if (currPlayer.equals("Player 1")) {
				pos = player1Pos;
			} else {
				pos = player2Pos;
			}

			// UC 3: The player checks for option.
			int choiceIndex = (int) (Math.random() * option.length);
			switch (option[choiceIndex]) {
			case "No Play":
				break;
			case "Ladder":
				// UC 5: Player Gets the exact value to reach the winning position.
				if (pos + dice <= WINNING_POS) {
					pos = pos + dice;
				}
				break;
			case "Snake":
				pos = pos - dice;
				if (pos < 0) {
					pos = 0;
				}
				break;
			}
			
			if (currPlayer.equals("Player 1")) {
				player1Pos = pos;
			} else {
				player2Pos = pos;
			}

			// UC 7: If Player gets the ladder then they plays again.
			if (choiceIndex != 1) {
				player1Turn = !player1Turn;
			}

			// UC 6: The no. of times dice rolls and the position after every die roll.
			System.out.println("Player: " + currPlayer + " rolls a dice and gets " + dice);
			System.out.println("Position: " + pos);
			System.out.println("No. Of time dice roll: " + diceRoll);

			// UC 4: Repeat till the Player reaches the winning position 100.
			if (pos == WINNING_POS) {
				System.out.println(currPlayer + " Wins the Game");
				break;
			}
		}
	}
}
