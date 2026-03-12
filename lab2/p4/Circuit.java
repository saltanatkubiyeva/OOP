package p4;


public abstract class Circuit {
    public abstract double getResistance(); // сопротивление R
    public abstract double getPotentialDiff(); // напряжение V
    public abstract void applyPotentialDiff(double v);

    public double getPower () { // мощность P = V² / R
        return (getPotentialDiff() * getPotentialDiff() / getResistance() );
    }

    public double getCurrent() { // ток I = V / R
        return getPotentialDiff() / getResistance();
    }

    @Override
    public String toString() {
        return "R=" + getResistance() + "Ω | V=" + getPotentialDiff() + "V";
    }
}
