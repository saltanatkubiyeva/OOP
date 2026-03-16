package delivery.model;

public class Car extends Vehicle {
    private int numberOfSeats;

    public Car(String model, double baseCost, Engine engine, int numberOfSeats) {
        super(model, baseCost, engine);
        this.numberOfSeats = numberOfSeats;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    @Override
    public double calculateDeliveryCost() {
        return getBaseCost() * 1.05;
    }

    public double calculateDeliveryCost(double extraWeight) {
        return calculateDeliveryCost() + (extraWeight * 500.0);
    }

    @Override
    public String getVehicleInfo() {
        return "Car " + super.getVehicleInfo() + " | Seats: " + getNumberOfSeats();
    }
}
