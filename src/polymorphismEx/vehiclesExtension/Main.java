package polymorphismEx.vehiclesExtension;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Vehicle car = getVehicle();
        Vehicle truck = getVehicle();
        Vehicle bus = getVehicle();

        Map<String, Vehicle> vehicles = new LinkedHashMap<>();
        vehicles.put("Car", car);
        vehicles.put("Truck", truck);
        vehicles.put("Bus", bus);

        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < count; i++) {
            String[] tokens = scanner.nextLine().split(" ");
            String command = tokens[0];
            String vehicleType = tokens[1];
            Vehicle vehicle = vehicles.get(vehicleType);
            try {
                switch (command) {
                    case "Drive" -> {
                        double distance = Double.parseDouble(tokens[2]);
                        if (vehicle instanceof Bus) {
                            ((Bus) vehicle).setEmpty(false);
                        }
                        System.out.println(vehicles.get(vehicleType).drive(distance));
                    }
                    case "Refuel" -> {
                        double liters = Double.parseDouble(tokens[2]);
                        vehicles.get(vehicleType).refuel(liters);
                    }
                    case "DriveEmpty" -> {
                        ((Bus) vehicle).setEmpty(true);
                        double distance = Double.parseDouble(tokens[2]);
                        System.out.println(vehicles.get(vehicleType).drive(distance));
                    }
                    default -> throw new IllegalArgumentException("No such command!");
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        vehicles.values().forEach(System.out::println);
    }

    private static Vehicle getVehicle() {
        Scanner scanner = new Scanner(System.in);
        String[] tokens = scanner.nextLine().split("\\s+");
        String vehicleType = tokens[0];
        double fuelQuantity = Double.parseDouble(tokens[1]);
        double fuelConsumption = Double.parseDouble(tokens[2]);
        double tankCapacity = Double.parseDouble(tokens[3]);
        return switch (vehicleType) {
            case "Car" -> new Car(fuelQuantity, fuelConsumption, tankCapacity);
            case "Truck" -> new Truck(fuelQuantity, fuelConsumption, tankCapacity);
            case "Bus" -> new Bus(fuelQuantity, fuelConsumption, tankCapacity);
            default -> throw new IllegalArgumentException("No such vehicle!");
        };
    }
}
