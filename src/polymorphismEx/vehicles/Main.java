package polymorphismEx.vehicles;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] tokens = scanner.nextLine().split(" ");

        double fuelQuantity = Double.parseDouble(tokens[1]);
        double fuelConsumption = Double.parseDouble(tokens[2]);
        Vehicle car = new Car(fuelQuantity, fuelConsumption);

        tokens = scanner.nextLine().split(" ");
        fuelQuantity = Double.parseDouble(tokens[1]);
        fuelConsumption = Double.parseDouble(tokens[2]);
        Vehicle truck = new Truck(fuelQuantity, fuelConsumption);

        Map<String, Vehicle> vehicles = new LinkedHashMap<>();
        vehicles.put("Car", car);
        vehicles.put("Truck", truck);

        int count = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < count; i++) {
            tokens = scanner.nextLine().split(" ");
            String command = tokens[0];
            String vehicleType = tokens[1];

            switch (command) {
                case "Drive":
                    double distance = Double.parseDouble(tokens[2]);
                    System.out.println(vehicles.get(vehicleType).drive(distance));
                    break;
                case "Refuel":
                    double liters = Double.parseDouble(tokens[2]);
                    vehicles.get(vehicleType).refuel(liters);
                    break;
            }
        }

        vehicles.values().forEach(System.out::println);
    }
}
