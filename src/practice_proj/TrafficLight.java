package practice_proj;

import java.util.Scanner;

public class TrafficLight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Enter the traffic light color : ");
        String lightColor = scanner.nextLine().toLowerCase(); 

        
        if (lightColor.equals("red")) {
            System.out.println("Stop");
        } else if (lightColor.equals("yellow")) {
            System.out.println("Ready");
        } else if (lightColor.equals("green")) {
            System.out.println("Go");
        } else {
            System.out.println("Invalid color entered. Please enter red, yellow, or green.");
        }

        scanner.close();
    }
}
