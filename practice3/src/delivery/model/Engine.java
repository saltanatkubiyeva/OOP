package delivery.model;

public class Engine {
    private String type;
    private double horsePower;

    public Engine(String type, double horsePower) {
        this.type = type;
        this.horsePower = horsePower;
    }

    public String getType() {
        return type;
    }

    public double getHorsePower() {
        return horsePower;
    }

    public String getEngineInfo() {
        return("Engine type: " + type + " | HP : " + horsePower);
    }
}
