package polymorphismEx.vehiclesExtension;

public class Bus extends Vehicle {
    private boolean isEmpty;
    private static final double AC_ADDITIONAL_CONSUMPTION = 1.4;

    public Bus(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        super(fuelQuantity, fuelConsumption, tankCapacity);
        this.isEmpty = true;
    }

    public void setEmpty(boolean empty) {
        if (this.isEmpty == empty) {
            return;
        }

        if (!this.isEmpty && empty) {
            super.setFuelConsumption(getFuelConsumption() - AC_ADDITIONAL_CONSUMPTION);
        }

        if (this.isEmpty && !empty) {
            super.setFuelConsumption(getFuelConsumption() + AC_ADDITIONAL_CONSUMPTION);
        }

        this.isEmpty = empty;
    }
}
