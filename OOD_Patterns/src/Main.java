import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Package Management System!");
        System.out.print("Enter the weight of the package: ");
        float weight = scanner.nextFloat();
        System.out.println("Select a shipping strategy:");
        System.out.println("1. Standard Shipping");
        System.out.println("2. Express Shipping");
        int strategy = scanner.nextInt();
        Package pkg = Package.init(weight, strategy);
        int action = 0;
        while (true) {
            System.out.println("Select an action");
            System.out.println("1. Change Shipping Strategy");
            System.out.println("2. Update Package State");
            System.out.println("3. Exit");
            action = scanner.nextInt();
            if (action == 1) {
                System.out.println("Select a new shipping strategy:");
                System.out.println("1. Standard Shipping");
                System.out.println("2. Express Shipping");
                Package.getInstance().changeStrategy(scanner.nextInt());
            } else if (action == 2) {
                System.out.println("Select the package state:");
                System.out.println("1. In Transit");
                System.out.println("2. Delivered");
                Package.getInstance().updateState(scanner.nextInt());
            } else {
                System.exit(0);
            }
        }
    }
}