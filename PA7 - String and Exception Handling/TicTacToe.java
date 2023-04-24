package PA7;

public class TicTacToe {
	
	private char[][] M;
	private char turn;
	
	public TicTacToe(final int d) {
		M = new char[d][d];
		for(int r = 0; r < d; r++) {
			for(int c = 0; c < d; c++) {
				M[r][c] = '\0';
			}
		}
		turn = 'X';
	}
	
	private final boolean checkWin(final int r, final int c) {
//		Checks Row
		int rcLength = M.length; //RowColumnLength
		for(int testCol = 0; testCol < rcLength; testCol++) {
			if(M[r][testCol] != turn) {
				break;
			} else if (testCol == rcLength - 1) {
				return true;
			}
		}
//		Checks Column
		for(int testRow = 0; testRow < rcLength; testRow++) {
			if(M[testRow][c] != turn) {
				break;
			} else if (testRow == rcLength - 1) {
				return true;
			}
		}
//		Checks Major Diagonal
		if(r == c) {
			for(int i = 0; i < rcLength; i++) {
				if(M[i][i] != turn) {
					break;
				} else if (i == rcLength - 1) {
					return true; 
				}
			}
		}
//		Checks Minor Diagonal
		if(r + c == rcLength - 1) {
			for(int i = 0; i < rcLength; i++) {
				if(M[i][rcLength - 1 - i] != turn) {
					break;
				} else if (i == rcLength - 1) {
					return true; 
				}
			}
		}
		return false;
	}
	
	private final void printBoard() {
		int rcLength = M.length; //RowColumnLength
		StringBuilder sb;
		for(int r = 0; r < rcLength; r++) {
			sb = new StringBuilder("[");
			for(int c = 0; c < rcLength; c++) {
				if(M[r][c] == '\0') {
					sb.append(r * rcLength + c);
				} else {
					sb.append(M[r][c]);
				}
				if(c != rcLength - 1) {
					sb.append(", ");
				} else {
					sb.append("]");
				}
			}
			System.out.println(sb.toString());
		}
	}
	
	public final void play(final int[] choiceSequence) {
		System.out.println("*** Game Starts ***");
		printBoard();
		int choiceLength = choiceSequence.length;
		for(int i = 0; i < choiceLength; i++) {
			int choice = choiceSequence[i];
			System.out.println("\n*** Turn for " + turn + ": chooses " + choiceSequence[i] + " ***");
			int maxChoice = M.length * M.length - 1;
			if(choice > maxChoice || choice < 0) {
				System.out.println("Invalid Choice. Must choose a number between 0 to " + maxChoice);
				continue;
			} else {
				int row = choice / M.length;
				int column = choice % M.length;
				if(M[row][column] != '\0') {
					System.out.println("Invalid Choice. " + choice + " is already taken.");
					continue;
				} else {
					M[row][column] = turn;
					printBoard();
					if(checkWin(row, column)) {
						System.out.println("\nCongrats " + turn + ", you have won!");
						return;
					} else {
						turn = (turn == 'X') ? 'Y': 'X';
					}
				}
			}
		}
		System.out.println("\nIt's a Draw!");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
