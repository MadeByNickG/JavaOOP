package polymorphismEx.wildFarm;

import java.text.DecimalFormat;

public class Cat extends Feline {
    String breed;

    public Cat(String animalName, String animalType, Double animalWeight, Integer foodEaten,
               String livingRegion, String breed) {
        super(animalName, animalType, animalWeight, foodEaten, livingRegion);
        this.breed = breed;
    }


    @Override
    public String makeSound() {
        return "Meowwww";
    }

    @Override
    public void eat(Food food) {
        this.foodEaten += food.quantity;
    }

    @Override
    public String toString() {
        DecimalFormat formatter = new DecimalFormat("##.#");
        return String.format("%s[%s, %s, %s, %s, %d]", this.animalType, this.animalName, this.breed,
                formatter.format(this.animalWeight), this.livingRegion, this.foodEaten);
    }
}
