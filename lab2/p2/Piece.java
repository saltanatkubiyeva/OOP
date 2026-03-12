package p2;

public abstract class Piece {
    private Position position;
    private String color;

    public Piece(Position position, String color) {
        this.position = position;
        this.color = color;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public String getColor() {
        return color;
    }

    public abstract boolean isLegalMove(Position b);

    @Override
    public String toString() {
        return getClass().getSimpleName() + " [" + color + "] at" + position;
    }
}
