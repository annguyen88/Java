/**
  *TTT class.
  */
  
  import java.util.Scanner;
  
  public class TTT {
  	private String [][] tttBoard;
  	private String player1, player2;
  	
  	
  	/**
  	 *constrictor
  	 *pre: none
  	 *post: tttBoard has een initialized.
  	 *player1 is X and player2 is 0.
  	 */
  	 public TTT() {
  	 	player1 = "X";
  	 	player2 = "O";
  	 	tttBoard = new String[3][3];
  	 	for(int row = 0; row < tttBoard.length; row++) {
  	 		for (int col = 0; col < tttBoard[0].length; col++) {
  	 			tttBoard[row][col] = " ";
  	 		}
  	 	}
  	 }
  	 
  /**
   *plays a game of tic-tac-toe with two users, keeping track of player (X or O) turns.
   *player1 goes first.
   *pre: none
   *post: A game of tic tac ote has been played
   */
   public void play() {
   	String currPlayer = player1;
   	int movesMade = 0;
   		
   		do {
   			displayBoard();
   			makeMove(currPlayer);
   			movesMade += 1;
   			if (currPlayer == player1){
   				currPlayer = player2;
   			} else {
   				currPlayer = player1;
   			}
   		} while (movesMade <= 9 && winner() == " ");
   		displayBoard();
   		System.out.println("Winner is " + winner());
   }
	
	/**
	 *displays the board.
	 *pre: none
	 *post: the tictactoe board has been displayed/
	 */
	 private void displayBoard() {
	 	for(int row = 0; row < tttBoard.length; row++) {
	 		for (int col = 0; col < tttBoard[0].length; col++) {
	 			System.out.print("[" + tttBoard[row][col] + "]");
	 		}
	 		System.out.println();
	 		}
	 }
	 
	 /**
	  *prompt user for a move for until a valid move has been made.
	  *pre: none
	  *post: a mark had been made in an empty tictactoe
	  *board square
	  */
	  private void makeMove(String player) {
	  	Scanner input = new Scanner(System.in);
	  	boolean validMove = false;
	  	int row, col;
	  	
	  	do {
	  		System.out.print("Enter column number (0, 1, 2):) ");
	  		col = input.nextInt();
	  		System.out.print("Enter row number (0, 1, 2): ");
	  		row = input.nextInt();
	  		if ((row >= 0 && row < tttBoard.length && col >= 0 && col < tttBoard[0].length) && tttBoard[row][col].equals(" ")) {
	  				tttBoard[row][col] = player;
	  				validMove = true;
	  				} else {
	  					System.out.println("Invalid move.  Try again.");
	  				}
	  			} while (!validMove);
	  		}
	  		
	  		
	  		/**
	  		 *Determine winner. Return " " if no winner.
	  		 *pre: none
	  		 *post: X, 0 or " " has been returned as the winner.
	  		 */
	  		 
	  		private String winner() {
	  			
	  			/* test rows */
	  			for (int row = 0; row < tttBoard.length; row++) {
	  				if (tttBoard[row][0].equals(tttBoard[row][1]) &&
  						tttBoard[row][1].equals(tttBoard[row][2]) &&
  						!(tttBoard[row][0].equals(" "))) {
						return(tttBoard[row][0]);
  					}
  				}
  
  				/* test columns */
  				for (int col = 0; col < tttBoard[0].length; col++) {
  					if (tttBoard[0][col].equals(tttBoard[1][col]) &&
  						tttBoard[1][col].equals(tttBoard[2][col]) &&
  							!(tttBoard[0][col].equals(" "))) {
  								return(tttBoard[0][col]);
  							}
  						}
  						
  					/* test diagonals */
  					if (tttBoard[0][0].equals(tttBoard[1][1]) &&
  						tttBoard[1][1].equals(tttBoard[2][2]) &&
  						!(tttBoard[0][0].equals(" "))) {
  					return(tttBoard[0][0]);
  				}
  				
  				/* test other diagonals */
  				if (tttBoard[0][2].equals(tttBoard[1][1]) &&
					tttBoard[1][1].equals(tttBoard[2][0]) &&
					!(tttBoard[0][2].equals(" "))) {
					return(tttBoard[0][0]);
	  			}
	  			return(" ");
  			}
  			}