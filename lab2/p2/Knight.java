package p2;

public class Knight extends Piece {

    public Knight(Position position, String color) {
        super(position, color);
    }

    @Override
    public boolean isLegalMove(Position b) {

        int rowDiff = Math.abs(getPosition().getRow() - b.getRow());
        int colDiff = Math.abs(getPosition().getCol() - b.getCol());

        return (rowDiff == 1 && colDiff == 2) || (rowDiff == 2 && colDiff == 1);
    }
}