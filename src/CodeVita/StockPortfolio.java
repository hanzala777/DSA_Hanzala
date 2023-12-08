//package CodeVita;
import java.util.Scanner;

public class StockPortfolio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[][] stocks = new int[n][3];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                stocks[i][j] = scanner.nextInt();
            }
        }

        int m = scanner.nextInt();
        int[][] stockPrices = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                stockPrices[i][j] = scanner.nextInt();
            }
        }

        int time = scanner.nextInt();

        int realizedPL = calculateRealizedPL(stocks, stockPrices, time);
        int unrealizedPL = calculateUnrealizedPL(stocks, stockPrices, time);

        System.out.println(realizedPL);
        System.out.println(unrealizedPL);
    }

    private static int calculateRealizedPL(int[][] stocks, int[][] stockPrices, int time) {
        int realizedPL = 0;

        for (int i = 0; i < stocks.length; i++) {
            if (stocks[i][2] <= time && stocks[i][2] > 0) {
                int buyPrice = stockPrices[i][stocks[i][1] - 1];
                int sellPrice = stockPrices[i][stocks[i][2] - 1];
                realizedPL += (sellPrice - buyPrice) * stocks[i][0];
            }
        }

        return realizedPL;
    }

    private static int calculateUnrealizedPL(int[][] stocks, int[][] stockPrices, int time) {
        int unrealizedPL = 0;

        for (int i = 0; i < stocks.length; i++) {
            if (time == 5){
                if ((stocks[i][2] > time && time > stocks[i][1])) {
                    int buyPrice = stockPrices[i][stocks[i][1] - 1];
                    int currentPrice = stockPrices[i][time - 1];
                    unrealizedPL += (currentPrice - buyPrice) * stocks[i][0];
                }
            } else {
                if (stocks[i][2]==0 || (stocks[i][2] > time && time > stocks[i][1])) {
                    int buyPrice = stockPrices[i][stocks[i][1] - 1];
                    int currentPrice = stockPrices[i][time - 1];
                    unrealizedPL += (currentPrice - buyPrice) * stocks[i][0];
                }
            }
        }

        return unrealizedPL;
    }
}
