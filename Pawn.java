package Models;
public class Pawn extends Piece{

    Pawn(int x, int y, Player player){
        super(x,y,player);
        _name = PieceName.PAWN;
    }
    public boolean isValidPath(int endX, int endY){
        int begX = _x;
        int begY = _y;
        if(_direction == Direction.NORTH)
        {
            if (_isPromoted == false) {
                int xDiff = begX - endX;
                int yDiff = begY - endY;

                if(xDiff == 0 && yDiff == 1)
                    return true;
                else
                    return false;
            }
            else{   //is promoted (Gold moveset)
                int xDiff = begX - endX;
                int yDiff = begY - endY;
                if(xDiff == 1 && yDiff == 1)
                    return true;
                else if(xDiff == 0 && yDiff == 1)
                    return true;
                else if(xDiff == -1 && yDiff == 1)
                    return true;
                else if(xDiff == 1 && yDiff == 0)
                    return true;
                else if(xDiff == -1 && yDiff == 0)
                    return true;
                else if(xDiff == 0 && yDiff == -1)
                    return true;
                else
                    return false;
            }
        }
        else{ //_direction == Direction.SOUTH
            if (_isPromoted == false) {
                int xDiff = begX - endX;
                int yDiff = begY - endY;

                if(xDiff == 0 && yDiff == -1)
                    return true;
                else
                    return false;
            }
            else{   //is promoted (Gold moveset)
                int xDiff = begX - endX;
                int yDiff = begY - endY;
                if(xDiff == 0 && yDiff == 1)
                    return true;
                else if(xDiff == 1 && yDiff == 0)
                    return true;
                else if(xDiff == -1 && yDiff == 0)
                    return true;
                else if(xDiff == 1 && yDiff == -1)
                    return true;
                else if(xDiff == 0 && yDiff == -1)
                    return true;
                else if(xDiff == -1 && yDiff == -1)
                    return true;
                else
                    return false;
            }
        }


    }
    public int[][] drawPath(int begX, int begY, int endX, int endY){

    }


    public void Promote(){
        _name = PieceName.PPAWN;
        _isPromoted = true;
    }
    public PieceName getName(){
        return _name;
    }
}