package polymorphismEx.vehiclesExtension;

public class Car extends Vehicle {
    private static final double AC_ADDITIONAL_CONSUMPTION = 0.9;


    public Car(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        super(fuelQuantity, fuelConsumption, tankCapacity);

    }

    @Override
    public void setFuelConsumption(double fuelConsumption) {
        super.setFuelConsumption(fuelConsumption + AC_ADDITIONAL_CONSUMPTION);
    }
}
