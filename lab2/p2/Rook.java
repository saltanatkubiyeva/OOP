package p2;

public class Rook extends Piece{

    public Rook (Position position, String color) {
        super(position, color);
    }

    @Override
    public boolean isLegalMove(Position b) {
        int rowDiff = Math.abs(getPosition().getRow() - b.getRow());
        int colDiff = Math.abs(getPosition().getCol() - b.getCol());

        return (rowDiff == 0 && colDiff > 0) || (colDiff == 0 && rowDiff > 0);
    }
}
