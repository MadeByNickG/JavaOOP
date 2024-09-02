package polymorphismEx.vehiclesExtension;

import java.text.DecimalFormat;

public abstract class Vehicle {
    private double fuelQuantity;
    private double fuelConsumption;
    private final double tankCapacity;

    public Vehicle(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        this.fuelQuantity = fuelQuantity;
        this.setFuelConsumption(fuelConsumption);
        this.tankCapacity = tankCapacity;
    }

    @Override
    public String toString() {
        return String.format("%s: %.2f", this.getClass().getSimpleName(),
                this.fuelQuantity);
    }

    public String drive(double distance) {
        double fuelNeeded = distance * this.fuelConsumption;
        if (fuelNeeded > this.fuelQuantity) {
            return this.getClass().getSimpleName() + " needs refueling";
        }
        this.fuelQuantity -= fuelNeeded;

        DecimalFormat formatter = new DecimalFormat("##.##");
        return String.format("%s travelled %s km", this.getClass().getSimpleName(),
                formatter.format(distance));
    }

    public void refuel(double liters) {
        if (liters <= 0) {
            throw new IllegalArgumentException("Fuel must be a positive number");
        }

        if ((this.fuelQuantity + liters) > this.tankCapacity) {
            throw new IllegalArgumentException("Cannot fit fuel in tank");
        }

        this.fuelQuantity += liters;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }
}
