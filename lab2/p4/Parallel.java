package p4;

public class Parallel extends Circuit{
    private Circuit c1;
    private Circuit c2;
    private double potentialDifference;

    public Parallel(Circuit c1, Circuit c2) {
        this.c1 = c1;
        this.c2 = c2;
        this.potentialDifference = 0.0;
    }

    @Override
    public double getResistance() {
        return ((c1.getResistance() * c2.getResistance()) /
                (c1.getResistance() + c2.getResistance()));
    }

    @Override
    public double getPotentialDiff() {
        return potentialDifference;
    }

    @Override
    public void applyPotentialDiff(double V) {
        this.potentialDifference = V;
        c1.applyPotentialDiff(V);
        c2.applyPotentialDiff(V);
    }

    @Override
    public String toString() {
        return "Parallel | " + super.toString();
    }

}
