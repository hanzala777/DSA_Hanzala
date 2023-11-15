package CodeVita;

import java.util.Scanner;
public class WaterCistern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert the values for Radius, Height, and Starting point distance (comma-separated):");
        String[] bugInput = scanner.nextLine().split(",");
        int radius = Integer.parseInt(bugInput[0]);
        int height = Integer.parseInt(bugInput[1]);
        int startingPoint = Integer.parseInt(bugInput[2]);

        System.out.println("Insert the values for surface or degree (comma-separated):");
        String[] selectSurfaceInput = scanner.nextLine().split(",");
        int surface = Integer.parseInt(selectSurfaceInput[0]);
        int degree = Integer.parseInt(selectSurfaceInput[1]);

        double sum = 0;

        sum += distance(surface, degree, radius, startingPoint);

        System.out.printf(String.valueOf((int)(sum)));
    }

    private static double distance(int select, int degreeDistance, int radius, int startingPoint) {
        double shortestDistance = 0.0;

        if (select > 0) {
            shortestDistance = (2 * Math.PI * radius * degreeDistance) / 360;
        } else if (select < 0) {
            shortestDistance = (startingPoint + radius + Math.abs(select));
        }

        return shortestDistance;
    }
}
