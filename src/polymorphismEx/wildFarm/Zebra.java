package polymorphismEx.wildFarm;

public class Zebra extends Mammal {
    public Zebra(String animalName, String animalType, Double animalWeight,
                 Integer foodEaten, String livingRegion) {
        super(animalName, animalType, animalWeight, foodEaten, livingRegion);
    }

    @Override
    public String makeSound() {
        return "Zs";
    }

    @Override
    public void eat(Food food) {
        if (food instanceof Meat) {
            throw new IllegalArgumentException("Zebras are not eating that type of food!");
        }
        this.foodEaten += food.quantity;
    }
}
