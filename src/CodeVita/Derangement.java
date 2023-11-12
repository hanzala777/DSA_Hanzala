package CodeVita;

public class Derangement {
    static int mod = 10^9+7;
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            System.out.println("n = " + i + ": " + derangement(i));
        }
    }

    public static long derangement(int n) {
        if (n == 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        } else {
            return (n - 1)%mod * (derangement(n - 1)%mod + derangement(n - 2)%mod);
        }
    }
}
//        n = 1: 0
//        n = 2: 1
//        n = 3: 2
//        n = 4: 9
//        n = 5: 44
//        n = 6: 265
//        n = 7: 1854
//        n = 8: 14833
//        n = 9: 133496
//        n = 10: 1334961
//        n = 11: 14684570
//        n = 12: 176214841
//        n = 13: 2290792932
//        n = 14: 32071101049
//        n = 15: 481066515734
//        n = 16: 7697064251745
//        n = 17: 130850092279664
//        n = 18: 2355301661033953
//        n = 19: 44750731559645106
//        n = 20: 895014631192902121
