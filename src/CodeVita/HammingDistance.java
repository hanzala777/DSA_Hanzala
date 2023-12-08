package CodeVita;
import java.util.Scanner;
public class HammingDistance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();

        for (int t = 0; t < T; t++) {
            String binaryString = scanner.next();
            int A = scanner.nextInt();
            int B = scanner.nextInt();

            solveTask(binaryString, A, B);
        }
    }

    private static void solveTask(String binaryString, int A, int B) {
        if (!isValidBinaryString(binaryString)) {
            System.out.println("INVALID");
            return;
        }

        int count01 = countSubstringOccurrences(binaryString, "01");
        int count10 = countSubstringOccurrences(binaryString, "10");

        int costOriginal = count01 * A + count10 * B;

        String transformedString = transformString(binaryString);

        int hammingDistance = calculateHammingDistance(binaryString, transformedString);

        System.out.println(hammingDistance);
    }

    private static boolean isValidBinaryString(String str) {
        return str.matches("[01]+");
    }

    private static int countSubstringOccurrences(String str, String substring) {
        int count = 0;
        int index = 0;

        while ((index = str.indexOf(substring, index)) != -1) {
            count++;
            index += substring.length() - 1;
        }

        return count;
    }

    private static String transformString(String str) {
        return str.replaceAll("01", "10");
    }

    private static int calculateHammingDistance(String str1, String str2) {
        int hammingDistance = 0;

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                hammingDistance++;
            }
        }

        return hammingDistance;
    }
}
