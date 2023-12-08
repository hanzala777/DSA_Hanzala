package CodeVita;
import java.util.Scanner;

public class MaximizeGems {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[][] idRating = new int[n][2];

        for (int i = 0; i < n; i++) {
            String[] input = scanner.next().split(":");
            idRating[i][0] = Integer.parseInt(input[0]);
            idRating[i][1] = Integer.parseInt(input[1]);
        }

        int result = maximizeGems(idRating, n);
        System.out.println(result);
    }

    private static int maximizeGems(int[][] idRating, int n) {
        int maxGems = 0;
        for (int i = 0; i < n; i++) {
            if (idRating[i][1] > 0) {
                maxGems += idRating[i][1];
            }
        }
        return maxGems;
    }
}
