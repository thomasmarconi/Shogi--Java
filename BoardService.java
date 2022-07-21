import Models.*;
public class BoardService{

    private static BoardService boardService = null;
    Piece[][] board = new Piece[9][9];
    Player player1,player2;

    BoardService(){
        player1 = new Player();
        player2 = new Player();
        board[0][0] = new Lance(0,0,player2);
        board[0][1] = new Knight(0,1,player2);
        board[0][2] = new Silver(0,2,player2);
        board[0][3] = new Gold(0,3,player2);
        board[0][4] = new King(0,4,player2);
        board[0][5] = new Gold(0,5,player2);
        board[0][6] = new Silver(0,6,player2);
        board[0][7] = new Knight(0,7,player2);
        board[0][8] = new Lance(0,8,player2);
        board[1][7] = new Bishop(1,1,player2);
        board[1][1] = new Rook(1,7,player2);
        board[2][0] = new Pawn(2,0,player2);
        board[2][1] = new Pawn(2,1,player2);
        board[2][2] = new Pawn(2,2,player2);
        board[2][3] = new Pawn(2,3,player2);
        board[2][4] = new Pawn(2,4,player2);
        board[2][5] = new Pawn(2,5,player2);
        board[2][6] = new Pawn(2,6,player2);
        board[2][7] = new Pawn(2,7,player2);
        board[2][8] = new Pawn(2,8,player2);

        board[8][0] = new Lance(8,0,player1);
        board[8][1] = new Knight(8,1,player1);
        board[8][2] = new Silver(8,2,player1);
        board[8][3] = new Gold(8,3,player1);
        board[8][4] = new King(8,4,player1);
        board[8][5] = new Gold(8,5,player1);
        board[8][6] = new Silver(8,6,player1);
        board[8][7] = new Knight(8,7,player1);
        board[8][8] = new Lance(8,8,player1);
        board[7][1] = new Bishop(7,1,player1);
        board[7][7] = new Rook(7,7,player1);
        board[6][0] = new Pawn(6,0,player1);
        board[6][1] = new Pawn(6,1,player1);
        board[6][2] = new Pawn(6,2,player1);
        board[6][3] = new Pawn(6,3,player1);
        board[6][4] = new Pawn(6,4,player1);
        board[6][5] = new Pawn(6,5,player1);
        board[6][6] = new Pawn(6,6,player1);
        board[6][7] = new Pawn(6,7,player1);
        board[6][8] = new Pawn(6,8,player1);
    }

    public boolean runGame(){
        while(!isGameFinished())
        {
            player1.takeTurn();
            if(!isGameFinished())
                player2.takeTurn();
        }
    }

    public boolean isGameFinished(){
        //checks if someone has checkMate
    }

}