package delivery.service;

import delivery.model.Vehicle;
import java.util.List;

public class DeliveryService {

    public void printAllVehicles (List<Vehicle> vehicles) {
        System.out.println("=== All Vehicles ===");
        for(Vehicle v: vehicles) {
            System.out.println(v.getVehicleInfo());
        }
        System.out.println();
    }

    public void calculateAllDeliveries(List<Vehicle> vehicles) {
        System.out.println("=== All Deliveries===");
        for(Vehicle v: vehicles) {
            double cost = v.calculateDeliveryCost();
            System.out.printf("%-20s -> %.2f KZT\n", v.getModel(), cost);
        }
        System.out.println();
    }
    public void calculateTotalCost (List<Vehicle> vehicles) {
        System.out.println("=== Total for today===");
        double total = 0;
        for(Vehicle v: vehicles) {
            total += v.calculateDeliveryCost();
        }
        System.out.printf("Total:  %.2f KZT", total);
        System.out.println();
    }


}
