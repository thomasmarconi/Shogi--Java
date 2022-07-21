package Models;
import Models.Player;
public abstract class Piece{

  public int _x,_y; //position on the game board of the piece
  public Player _player;
  public PieceName _name;
  public boolean _onBoard;
  public boolean _isPromoted;
  public Direction _direction;


  Piece(int y, int x, Player player)
  {
    _y = y;
    _x = x;
    _player = player;
    _onBoard = true;
    _isPromoted = false;
    if( y < 6)
      _direction = Direction.SOUTH;
    else
      _direction = Direction.NORTH;

    //place piece on the game board by calling the gameBoard
  }

  public abstract boolean isValidPath(int endX, int endY);
  public abstract int[][] drawPath(int begX, int begY, int endX, int endY);
  public abstract void Promote();
  public abstract PieceName getName();
  public void Drop(){
    if(_direction == Direction.NORTH)
      _direction = Direction.SOUTH;
    else //_direction == Direction.SOUTH
      _direction = Direction.NORTH;
  }
  public enum PieceName{
    LANCE, KNIGHT, SILVER, GOLD, KING, BISHOP, ROOK, PAWN,
    PLANCE, PKNIGHT, PSILVER, PBISHOP, PROOK, PPAWN
  }
  public enum Direction{
    NORTH, SOUTH
  }
}
