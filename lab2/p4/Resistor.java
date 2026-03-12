package p4;

public class Resistor extends Circuit{
    private double resistance; // сопротивление
    private double potentialDifference; // напряжение

    public Resistor(double resistance) {
        this.resistance = resistance;
        this.potentialDifference = 0.0;
    }

    @Override
    public double getResistance() {
        return resistance;
    }

    @Override
    public double getPotentialDiff() {
        return potentialDifference;
    }

    @Override
    public void applyPotentialDiff(double V) { //задаем напряжение
        this.potentialDifference = V;
    }

    @Override
    public String toString() {
        return "Resistor | " + super.toString();
    }
}
