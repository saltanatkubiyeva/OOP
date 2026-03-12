package p2;

    public class Queen extends Piece {

        public Queen(Position position, String color) {
            super(position, color);
        }

        @Override
        public boolean isLegalMove(Position b) {

            int rowDiff = Math.abs(getPosition().getRow() - b.getRow());
            int colDiff = Math.abs(getPosition().getCol() - b.getCol());

            boolean rookMove = (rowDiff == 0 && colDiff > 0) || (colDiff == 0 && rowDiff > 0);

            boolean bishopMove = rowDiff == colDiff && rowDiff > 0;

            return rookMove || bishopMove;
        }
    }
