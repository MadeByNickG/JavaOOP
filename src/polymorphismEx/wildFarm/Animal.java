package polymorphismEx.wildFarm;

public abstract class Animal {
    String animalName;
    String animalType;
    Double animalWeight;
    Integer foodEaten;

    public Animal(String animalName, String animalType, Double animalWeight, Integer foodEaten) {
        this.animalName = animalName;
        this.animalType = animalType;
        this.animalWeight = animalWeight;
        this.foodEaten = foodEaten;
    }

    public abstract String makeSound();

    public abstract void eat(Food food);
}
