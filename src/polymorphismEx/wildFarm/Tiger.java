package polymorphismEx.wildFarm;

public class Tiger extends Feline {
    public Tiger(String animalName, String animalType, Double animalWeight,
                 Integer foodEaten, String livingRegion) {
        super(animalName, animalType, animalWeight, foodEaten, livingRegion);
    }

    @Override
    public String makeSound() {
        return "ROAAR!!!";
    }

    @Override
    public void eat(Food food) {
        if (food instanceof Vegetable) {
            throw new IllegalArgumentException("Tigers are not eating that type of food!");
        }
        this.foodEaten += food.quantity;
    }
}
