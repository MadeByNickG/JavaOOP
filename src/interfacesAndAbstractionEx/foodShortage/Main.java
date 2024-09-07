package interfacesAndAbstractionEx.foodShortage;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfPeople = Integer.parseInt(scanner.nextLine());

        Map<String, Buyer> persons = new HashMap<>();

        for (int i = 0; i < numberOfPeople; i++) {
            String[] tokens = scanner.nextLine().split(" ");
            int numberOfTokens = tokens.length;
            String name = tokens[0];
            int age = Integer.parseInt(tokens[1]);
            switch (numberOfTokens) {
                case 3:
                    String group = tokens[2];
                    Rebel rebel = new Rebel(name, age, group);
                    persons.putIfAbsent(name, rebel);
                    break;
                case 4:
                    String id = tokens[2];
                    String birthDate = tokens[3];
                    Citizen citizen = new Citizen(name, age, id, birthDate);
                    persons.putIfAbsent(name, citizen);
                    break;
            }
        }

        String name = scanner.nextLine();

        while (!name.equals("End")) {
            if (persons.containsKey(name)){
                persons.get(name).buyFood();
            }
            name = scanner.nextLine();
        }

        int food = 0;
        for (Buyer person : persons.values()) {
            food += person.getFood();
        }

        System.out.println(food);
    }
}

