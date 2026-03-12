package p2;

public class King extends Piece{
    public King (Position position, String color) {
        super(position, color);
    }

    @Override
    public boolean isLegalMove(Position b) {
        int rowDiff = Math.abs(getPosition().getRow() - b.getRow());
        int colDiff = Math.abs(getPosition().getCol()) - b.getCol();

        return rowDiff <=1 && colDiff <= 1 && !(rowDiff == 0 && colDiff == 0);
    }
}

