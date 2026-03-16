package delivery.model;

public abstract class Vehicle {
    private String model;
    private double baseCost;
    private Engine engine;

    public Vehicle (String model, double baseCost, Engine engine) {
        this.model = model;
        this.baseCost = baseCost;
        this.engine = engine;
    }

    public abstract double calculateDeliveryCost();

    public String getModel() {
        return model;
    }

    public double getBaseCost() {
        return baseCost;
    }

    public Engine getEnginegine() {
        return engine;
    }

    public String getVehicleInfo() {
        return ("Model: " + getModel() + " | BaseCost: " + getBaseCost() +
                "\nEngine info : " + engine.getEngineInfo());
    }
}
