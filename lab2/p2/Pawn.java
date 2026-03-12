package p2;

public class Pawn extends Piece {
    public Pawn(Position position, String color) {
        super(position, color);
    }

    @Override
    public boolean isLegalMove(Position b) {
        int rowDiff = b.getRow() - getPosition().getRow();
        int colDiff= Math.abs(getPosition().getCol() - b.getCol());

        if(getColor().equals("white")) {
            if (colDiff == 0 && rowDiff == 1) return true;
            if (colDiff == 0 && rowDiff == 2 && getPosition().getRow() == 1) return true;
        } else {
            if (colDiff == 0 && rowDiff == -1) return true;
            if (colDiff == 0 && rowDiff == -2 && getPosition().getRow() == 6) return true;
        }

        return false;
    }
}
