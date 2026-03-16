package delivery.model;

public class Truck extends Vehicle {
    private int maxLoad;

    public Truck(String model, double baseCost, Engine engine, int maxLoad) {
        super(model, baseCost, engine);
        this.maxLoad = maxLoad;
    }

    public int getMaxLoad() {
        return maxLoad;
    }

    @Override
    public double calculateDeliveryCost() {
        return getBaseCost() * 1.5;
    }

    public double calculateDeliveryCost(double distance, double fuelPrice) {
        double extraCost = (getMaxLoad() / 1000.0 ) * 0.5;
        double fuelCost = (distance / 100.0 ) * extraCost * fuelPrice;

        return calculateDeliveryCost() + fuelCost;
    }

    @Override
    public String getVehicleInfo() {
        return "Truck :" + super.getVehicleInfo()  + " | Max Load: " + getMaxLoad();
    }
}
