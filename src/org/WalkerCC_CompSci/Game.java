package org.WalkerCC_CompSci;


import java.util.Scanner;

public class Game {
    private GameBoard gameBoard;
    private Player player1;
    private Player player2;
    private boolean isComplete = false;

    public Game(){
        gameBoard = new GameBoard();
        player1 = new Player(Space.X, 1);
        player2 = new Player(Space.O, 2);
    }


    public void Play() {
        //Clean this up so that it handles repetition and ends the game when its over.

        Scanner myScan = new Scanner(System.in);
        gameBoard.Draw();

        while(true) {
            System.out.println("Player 1:  Enter a location number.");
            int location = myScan.nextInt();

            gameBoard.PlaceOnBoard(player1.getPiece(), location);
            boolean ifWon = CheckForWin();
            if (ifWon) {
                System.out.println("Player 1 Wins");
                gameBoard.Draw();
                return;
            }
            if (IsFilled()) {
                System.out.println("Draw:  All Spaces Filled");
                gameBoard.Draw();
                return;
            }
            gameBoard.Draw();

            System.out.println("Player 2:  Enter a location number.");
            location = myScan.nextInt();

            gameBoard.PlaceOnBoard(player2.getPiece(), location);
            ifWon = CheckForWin();
            if (ifWon) {
                System.out.println("Player 2 Wins");
                gameBoard.Draw();
                return;
            }
            if (IsFilled()) {
                System.out.println("Draw:  All Spaces Filled");
                gameBoard.Draw();
                return;
            }
            gameBoard.Draw();
        }




    }

    private boolean CheckForWin() {
        Space zero = this.gameBoard.spaces[0];
        Space one = this.gameBoard.spaces[1];
        Space two = this.gameBoard.spaces[2];
        Space three = this.gameBoard.spaces[3];
        Space four = this.gameBoard.spaces[4];
        Space five = this.gameBoard.spaces[5];
        Space six = this.gameBoard.spaces[6];
        Space seven = this.gameBoard.spaces[7];
        Space eight = this.gameBoard.spaces[8];

        //zero, one, two
        if(zero == one && one == two && zero != Space.EMPTY){
            return true;
        }

        //three, four, five
        if(three == four && four == five && three != Space.EMPTY){
            return true;
        }

        //six, seven, eight
        if(six == seven && seven == eight && six != Space.EMPTY){
            return true;
        }

        //zero, three, six
        if(zero == three && three == six && zero != Space.EMPTY){
            return true;
        }

        //one, four, seven
        if(one == four && four == seven && one != Space.EMPTY){
            return true;
        }

        //two, five, eight
        if(two == five && five == eight && two != Space.EMPTY){
            return true;
        }

        //zero, four, eight
        if(zero == four && four == eight && zero != Space.EMPTY){
            return true;
        }

        //two, four, six
        if(two == four && four == six && two != Space.EMPTY){
            return true;
        }
        return false;
    }

    private boolean IsFilled(){
        for(int i = 0; i < this.gameBoard.spaces.length; i++){
            if(this.gameBoard.spaces[i] == Space.EMPTY){
                return true;
            }
        }
        return false;
    }

}
