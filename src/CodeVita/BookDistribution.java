package CodeVita;

public class BookDistribution {
    public static void main(String[] args) {
        System.out.println(distributeBooks(20));
    }
    static int mod = 1000000007;
    public static int distributeBooks(int n) {
        int[] a = new int[n+1];
        a[0] = 1;
        a[1] = 0;
        a[2] = 1;
        for(int i=3; i<=n; i++){
            a[i] = (int) ((i - 1L) % mod * ((a[i - 1] + a[i - 2]) % mod) % mod);
        }
        return a[n];
    }
}
