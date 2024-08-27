package interfacesAndAbstractionEx.collectionHierarchy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        AddCollection addCollection = new AddCollection();
        AddRemoveCollection addRemoveCollection = new AddRemoveCollection();
        MyListImpl myList = new MyListImpl();

        String[] input = scanner.nextLine().split(" ");
        int countRemove = Integer.parseInt(scanner.nextLine());

        printAdd(input, addCollection);
        printAdd(input, addRemoveCollection);
        printAdd(input, myList);

        printRemove(countRemove, addRemoveCollection);
        printRemove(countRemove, myList);
    }

    private static void printRemove(int countRemove, AddRemovable collection) {
        for (int i = 0; i < countRemove; i++) {
            System.out.printf(collection.remove() + " ");
        }
        System.out.println();
    }


    private static void printAdd(String[] input, Addable collection) {
        for (String item : input) {
            System.out.printf(collection.add(item) + " ");
        }
        System.out.println();
    }
}
