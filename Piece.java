public abstract class Piece{
    protected boolean alive;
    protected boolean isWhite;

    public Piece(boolean isW){
	isWhite=isW;//if isW is true then the thing is white.
	alive=true;
    }
    // public abstract void move();
    
}
