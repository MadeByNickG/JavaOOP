package interfacesAndAbstractionEx.telephony;

import java.util.Arrays;
import java.util.Scanner;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> phoneNumbers = Arrays.stream(scanner.nextLine().split(" ")).toList();
        List<String> internetSites = Arrays.stream(scanner.nextLine().split(" ")).toList();

        Smartphone smartphone = new Smartphone(phoneNumbers, internetSites);
        System.out.println(smartphone.call());
        System.out.println(smartphone.browse());
    }
}
