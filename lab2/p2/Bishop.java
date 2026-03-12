package p2;

public class Bishop extends Piece{
    public Bishop(Position position, String color) {
        super(position, color);
    }

    @Override
    public boolean isLegalMove(Position b) {
        int rowDiff = Math.abs(getPosition().getRow() - b.getRow());
        int colDiff = Math.abs(getPosition().getCol() - b.getCol());

       return rowDiff == colDiff && rowDiff < 0;
    }
}
