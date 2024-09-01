package project_checkin_and_out;

import java.util.HashMap;
import java.util.Scanner;

public class CheckInCheckOutSystem {

    private static HashMap<String, Boolean> emp = new HashMap<>();

    public static void checkIn(String name) {
        if (emp.containsKey(name)) {
            if (emp.get(name)) {
                System.out.println(name + " has already checked in.");
            } else {
                emp.put(name, true);
                System.out.println(name + " checked in successfully.");
            }
        } else {
            emp.put(name, true);
            System.out.println(name + " checked in successfully.");
        }
    }

    public static void checkOut(String name) {
        if (emp.containsKey(name) && emp.get(name)) {
            emp.put(name, false);
            System.out.println(name + " checked out successfully.");
        } else {
            System.out.println(name + " has not checked in yet.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choice;

        do {
            System.out.println("\n--- Check-In/Check-Out System ---");
            System.out.println("1. Check In");
            System.out.println("2. Check Out");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.print("Enter Employee name to check in: ");
                    String checkInName = scanner.nextLine();
                    checkIn(checkInName);
                    break;
                case "2":
                    System.out.print("Enter Employee name to check out: ");
                    String checkOutName = scanner.nextLine();
                    checkOut(checkOutName);
                    break;
                case "3":
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (!choice.equals("3"));

        scanner.close();
    }
}
