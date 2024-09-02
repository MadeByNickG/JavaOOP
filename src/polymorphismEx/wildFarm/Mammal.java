package polymorphismEx.wildFarm;

import java.text.DecimalFormat;

public abstract class Mammal extends Animal {
    String livingRegion;

    public Mammal(String animalName, String animalType, Double animalWeight,
                  Integer foodEaten, String livingRegion) {
        super(animalName, animalType, animalWeight, foodEaten);
        this.livingRegion = livingRegion;
    }

    @Override
    public String toString() {
        DecimalFormat formatter = new DecimalFormat("##.#");
        return String.format("%s[%s, %s, %s, %d]", this.animalType, this.animalName,
                formatter.format(this.animalWeight), this.livingRegion, this.foodEaten);
    }
}
