package delivery.app;

import delivery.model.Car;
import delivery.model.Engine;
import delivery.model.Truck;
import delivery.model.Vehicle;
import delivery.service.DeliveryService;

import java.util.List;
import java.util.ArrayList;

public class MainApp {
    public static void main(String[] args) {
        Engine e1 = new Engine("V6 Diesel", 280.0);
        Engine e2 = new Engine("Turbo Diesel", 350.0);

        Car c1 = new Car("Camry 70", 5000.0, e1, 4 );
        Car c2 = new Car("Hyundai Accent", 4000, e2, 4);
        Truck t1 = new Truck ("Gazelle next", 12000, new Engine("Diesel X", 400.0), 3500);

        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(c1);
        vehicles.add(c2);
        vehicles.add(t1);

        DeliveryService ds = new DeliveryService();

        ds.printAllVehicles(vehicles);
        ds.calculateAllDeliveries(vehicles);
        ds.calculateTotalCost(vehicles);

        System.out.println(" === Overloaded Methods ====");
        System.out.printf("Camry with 50.0 kg extra weight: %.2f KZT\n", c1.calculateDeliveryCost(60.0));
        System.out.printf("Hyundai with 70.0 kg extra weight: %.2f KZT\n", c2 .calculateDeliveryCost(70.0));
        System.out.printf("Gazelle (120km, fPrice: 1000): %.2f KZT\n", t1.calculateDeliveryCost(120.0, 1000.0));
    }
}
