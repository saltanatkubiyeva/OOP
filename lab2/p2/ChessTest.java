package p2;

public class ChessTest {
    public static void main(String[] args) {

        System.out.println("=== ROOK ===");
        Rook rook = new Rook(new Position(0, 0), "white");
        System.out.println(rook);
        System.out.println("Move to (0,5): " + rook.isLegalMove(new Position(0, 5))); // true
        System.out.println("Move to (3,3): " + rook.isLegalMove(new Position(3, 3))); // false

        System.out.println("\n=== KING ===");
        King king = new King(new Position(4, 4), "white");
        System.out.println(king);
        System.out.println("Move to (4,5): " + king.isLegalMove(new Position(4, 5))); // true
        System.out.println("Move to (4,6): " + king.isLegalMove(new Position(4, 6))); // false

        System.out.println("\n=== QUEEN ===");
        Queen queen = new Queen(new Position(3, 3), "white");
        System.out.println(queen);
        System.out.println("Move to (3,7): " + queen.isLegalMove(new Position(3, 7))); // true - rook
        System.out.println("Move to (6,6): " + queen.isLegalMove(new Position(6, 6))); // true - bishop
        System.out.println("Move to (5,4): " + queen.isLegalMove(new Position(5, 4))); // false

        System.out.println("\n=== BISHOP ===");
        Bishop bishop = new Bishop(new Position(2, 2), "black");
        System.out.println(bishop);
        System.out.println("Move to (5,5): " + bishop.isLegalMove(new Position(5, 5))); // true
        System.out.println("Move to (5,4): " + bishop.isLegalMove(new Position(5, 4))); // false

        System.out.println("\n=== KNIGHT ===");
        Knight knight = new Knight(new Position(3, 3), "black");
        System.out.println(knight);
        System.out.println("Move to (5,4): " + knight.isLegalMove(new Position(5, 4))); // true
        System.out.println("Move to (5,5): " + knight.isLegalMove(new Position(5, 5))); // false

        System.out.println("\n=== PAWN ===");
        Pawn pawn = new Pawn(new Position(1, 0), "white");
        System.out.println(pawn);
        System.out.println("Move to (2,0): " + pawn.isLegalMove(new Position(2, 0))); // true
        System.out.println("Move to (3,0): " + pawn.isLegalMove(new Position(3, 0))); // true - first move
        System.out.println("Move to (4,0): " + pawn.isLegalMove(new Position(4, 0))); // false
    }
}