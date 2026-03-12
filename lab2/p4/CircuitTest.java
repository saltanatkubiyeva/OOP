package p4;

public class CircuitTest {
    public static void main(String[] args) {
        Circuit r1 = new Resistor(7.0);
        Circuit r2 = new Resistor(10.0);
        Circuit r3 = new Resistor(6.0);
        Circuit r4 = new Resistor(4.0);

        Circuit c1 = new Parallel(r1, r2);
        Circuit c2 = new Series(r3, r4);
        Circuit circuit = new Parallel(c1, c2);

        circuit.applyPotentialDiff(24.0);

        System.out.println("=== CIRCUIT RESULTS ===");
        System.out.printf("Total Resistance: %.2f Ω%n", circuit.getResistance());
        System.out.printf("Total Voltage:    %.2f V%n", circuit.getPotentialDiff());
        System.out.printf("Total Current:    %.2f A%n", circuit.getCurrent());
        System.out.printf("Total Power:      %.2f W%n", circuit.getPower());
    }
}
