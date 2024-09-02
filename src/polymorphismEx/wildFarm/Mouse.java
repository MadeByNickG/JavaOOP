package polymorphismEx.wildFarm;

public class Mouse extends Mammal {
    public Mouse(String animalName, String animalType, Double animalWeight,
                 Integer foodEaten, String animalLivingRegion) {
        super(animalName, animalType, animalWeight, foodEaten, animalLivingRegion);
    }

    @Override
    public String makeSound() {
        return "SQUEEEAAAK!";
    }

    @Override
    public void eat(Food food) {
        if (food instanceof Meat) {
            throw new IllegalArgumentException("Mice are not eating that type of food!");
        }
        this.foodEaten += food.quantity;
    }
}
