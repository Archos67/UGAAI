import java.util.Scanner;
/*
 * Represents player, mostly filters input
 */
public class Player {
	private char XO;
	public Player(char XO) {
		//XO is the parameter, this.XO is the global variable
		if(XO =='X') this.XO = 'X'; 
		else if(XO == 'O') this.XO = 'O';
		else {
			//another case of not throwing an exception
			System.out.println("Please choose X or O");
		}
	}
	/* Internal method to choose Row */
	private int chooseRow() {
		int row;
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.print("Enter row (1-3): ");
			try{
				row = scan.nextInt();
				if(row > 0 && row < 4) {
					return row;
				} else {
					System.out.println("Invalid input");
					scan.reset();
				}
			}
			catch(Exception e) {
				System.out.println("Invalid input");
				scan.reset();
			}
		}
	}
	/* Internal method similar to chooseRow */
	private int chooseCol() {
		int col;
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.print("Enter column (1-3): ");
			try{
				col = scan.nextInt();
				if(col > 0 && col < 4) {
					return col;
				} else {
					System.out.println("Invalid input");
					scan.reset();
				}
			}
			catch(Exception e) {
				System.out.println("Invalid input");
				scan.reset();
			}
		}
	}
	public void choose() {
		int row, col;
		Board board = new Board();
		do {
			row = this.chooseRow();
			col = this.chooseCol();

		} while(board.changeElement(row, col, XO) != 0);
	}
	public boolean hasWon() {
		Board board = new Board();
		boolean hasWon = true;
		//check down
		for(int i = 1; i < 4; i++) {
			for(int j = 1; j < 4; j++) {
				if(!(XO == board.getElement(i, j))) {
					hasWon = false;
				}
			}
			if(hasWon) {
				return true;
			} hasWon = true;
		}
		//check across
		for(int i = 1; i < 4; i++) {
			for(int j = 1; j < 4; j++) {
				if(!(XO == board.getElement(j, i))) {
					hasWon = false;
				}
			}
			if(hasWon) {
				return true;
			} hasWon = true;
		}
		//check diagonals
		for(int i = 1; i < 4; i++) {
			if(!(XO == board.getElement(i, i))) {
				hasWon = false;
			}
		} if(hasWon) {
			return true;
		} hasWon = true;
		for(int i = 1; i < 4; i++) {
			for(int j = 3; j > 0; j--) {
				if(!(XO == board.getElement(i,j))) {
					hasWon = false;
				}
			}
		}
		if(hasWon) {
			return true;
		} return false;

	}
}
