package CodeVita;

import java.util.Scanner;
public class BeetleDistance {

    public static double calculateDistance(double x1, double y1, double z1, double x2, double y2, double z2) {
        return Math.ceil(Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2) + Math.pow(z2 - z1, 2)));
    }

    public static double beetleDistanceTravelled(int N, double[] points) {
        double totalDistance = 0.0;
        for (int i = 0; i < N - 1; i++) {
            double x1 = points[3 * i];
            double y1 = points[3 * i + 1];
            double z1 = points[3 * i + 2];

            double x2 = points[3 * (i + 1)];
            double y2 = points[3 * (i + 1) + 1];
            double z2 = points[3 * (i + 1) + 2];

            if(z1 == z2 && (y1 == y2 || x1 == x2 ) && z2 != 0){

                //check if the x axis of next co-ordinate is same
                if(x1 != x2){
                    totalDistance = (2 * 3.14 * (Math.abs(x1 - x2))) / 6.0f;
                }

                //check if the y axis of next co-ordinate is same
                else{
                    totalDistance = (2 * 3.14 * (Math.abs(y1 - y2))) / 6.0f;
                }
            }
            else {
                // Different face, use straight line distance
                totalDistance += calculateDistance(x1, y1, z1, x2, y2, z2);
            }
        }
        return totalDistance;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        int N = scanner.nextInt();
        double[] points = new double[3 * N];
        for (int i = 0; i < 3 * N; i++) {
            points[i] = scanner.nextDouble();
        }

        // Output
        double result = beetleDistanceTravelled(N, points);
        System.out.printf("%.2f\n", result);
    }
}
