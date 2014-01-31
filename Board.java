public class Board {
	//static makes all board objects have the same board
	private static char[] board = {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' };
	//resets board
	public void reset() {
		for(int i = 0; i < 9; i++) {
			board[i] = ' ';
		}
	}
	/* Maps element to a 3x3 board */
	protected char getElement(int x, int y) {
		if(x ==1 && y == 1) {
			return board[0];
		} else if(x == 1 && y == 2) {
			return board[1];
		} else if(x == 1 && y == 3) {
			return board[2];
		} else if(x == 2 && y == 1) {
			return board[3];
		} else if(x == 2 && y == 2) {
			return board[4];
		} else if(x == 2 && y == 3) {
			return board[5];
		} else if(x == 3 && y == 1) {
			return board[6];
		} else if(x == 3 && y == 2) {
			return board[7];
		} else if(x == 3 && y == 3) {
			return board[8];
		} else {
			//originally threw an exception but we'd have to explain that to people, plus this method is only used in the package
			return '!';
		}
	}
	/* For filling in the board */
	public int changeElement(int x, int y, char s) {
		// if s is not equal to X or O
		if(!(s == 'X' || s == 'O')){
			return -1;
		}
		if(x ==1 && y == 1) {
			if(board[0] == ' ') {
				board[0] = s;
				return 0;
			} 
			System.out.println("Element not empty. Please try again");
			return -1;
		} else if(x == 1 && y == 2) {
			if(board[1] == ' ') {
				board[1] = s;
				return 0;
			} 
			System.out.println("Element not empty. Please try again");
			return -1;
		} else if(x == 1 && y == 3) {
			if(board[2] == ' ') {
				board[2] = s;
				return 0;
			} 
			System.out.println("Element not empty. Please try again");
			return -1;
		} else if(x == 2 && y == 1) {
			if(board[3] == ' ') {
				board[3] = s;
				return 0;
			} 
			System.out.println("Element not empty. Please try again");
			return -1;
		} else if(x == 2 && y == 2) {
			if(board[4] == ' ') {
				board[4] = s;
				return 0;
			} 
			System.out.println("Element not empty. Please try again");
			return -1;
		} else if(x == 2 && y == 3) {
			if(board[5] == ' ') {
				board[5] = s;
				return 0;
			} return -1;
		} else if(x == 3 && y == 1) {
			if(board[6] == ' ') {
				board[6] = s;
				return 0;
			} 
			System.out.println("Element not empty. Please try again");
			return -1;
		} else if(x == 3 && y == 2) {
			if(board[7] == ' ') {
				board[7] = s;
				return 0;
			} 
			System.out.println("Element not empty. Please try again");
			return -1;
		} else if(x == 3 && y == 3) {
			if(board[8] == ' ') {
				board[8] = s;
				return 0;
			} 
			System.out.println("Element not empty. Please try again");
			return -1;
		} else {
			System.out.println("Invalid coordinates. Please enter valid coordinates.");
			return -1;
		}
	}
	public void print() {
		System.out.println(" " + board[0] + " | " + board[1] + " | " + board[2]);
		System.out.println("---+---+---");
		System.out.println(" " + board[3] + " | " + board[4] + " | " + board[5]);
		System.out.println("---+---+---");
		System.out.println(" " + board[6] + " | " + board[7] + " | " + board[8] + "\n");
	}
}
