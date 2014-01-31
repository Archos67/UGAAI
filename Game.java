import java.util.Scanner;
/* Contains main method for game */
public class Game {
	private static Board board = new Board();
	private static Game game = new Game();
	public static void main(String[] args) {
		board.reset(); //ensures board is full of spaces
		Player x = new Player('X');
		Player o = new Player('O');
		boolean hasNotQuit = true;
		/* Game Loop */
		while(hasNotQuit) {
			board.print();
			//considered using random to decide order, but I wanted everything as simple as possible
			System.out.println("- Player X's turn -");
			x.choose();
			if(x.hasWon()) {
				System.out.println("xxx X wins! xxx");
				hasNotQuit = game.playAgain();
			} 
			board.print();
			if(hasNotQuit) {
				System.out.println("- Player O's turn - ");
				o.choose();
				if(o.hasWon()) {
					System.out.println("ooo O wins! ooo");
					hasNotQuit= game.playAgain();
				}
			}
		} System.out.println("Goodbye!");
	}
	/* Method to avoid repeating code after a player wins */
	private boolean playAgain() {
		Scanner scan = new Scanner(System.in);
		String s = new String();
		while(true) {
			System.out.println("Play again? (y/n)");
			s = scan.nextLine();
			if(s.equalsIgnoreCase("y")) {
				board.reset();
				return true;
			} else if(s.equalsIgnoreCase("n")) {
				return false;
			} else {
				scan.reset();
				System.out.println("Invalid input.\n Play again? (y/n)");
			}
		}
	}
}
