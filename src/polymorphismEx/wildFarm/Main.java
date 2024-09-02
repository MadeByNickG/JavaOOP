package polymorphismEx.wildFarm;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        while (!input[0].equals("End")) {
            Animal animal = null;
            try {
                animal = getAnimal(input);
                System.out.println(animal.makeSound());

                input = scanner.nextLine().split(" ");

                Food food = getFood(input);
                animal.eat(food);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

            System.out.println(animal);

            input = scanner.nextLine().split(" ");
        }
    }


    private static Food getFood(String[] input) {
        String foodType = input[0];
        int quantity = Integer.parseInt(input[1]);

        return switch (foodType) {
            case "Vegetable" -> new Vegetable(quantity);
            case "Meet" -> new Meat(quantity);
            default -> throw new IllegalArgumentException("Unexpected food: " + foodType);
        };
    }


    private static Animal getAnimal(String[] input) {
        String animalType = input[0];
        String animalName = input[1];
        Double animalWeight = Double.parseDouble(input[2]);
        String animalLivingRegion = input[3];
        Integer foodEaten = 0;

        return switch (animalType) {
            case ("Mouse") -> new Mouse(animalName, animalType, animalWeight, foodEaten, animalLivingRegion);
            case ("Cat") -> {
                String catBreed = input[4];
                yield new Cat(animalName, animalType, animalWeight, foodEaten, animalLivingRegion, catBreed);
            }
            case ("Tiger") -> new Tiger(animalName, animalType, animalWeight, foodEaten, animalLivingRegion);
            case ("Zebra") -> new Zebra(animalName, animalType, animalWeight, foodEaten, animalLivingRegion);
            default -> throw new IllegalArgumentException("No such command!");
        };
    }
}
