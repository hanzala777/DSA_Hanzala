package CodeVita;

public class Alexander {
    public static void main(String[] args) {
        System.out.println(minCombinations(3,23));
    }
    public static int minCombinations(int n1, int n2) {
        if(n1 == 0){
            return n2;
        }
        return minCombinations(n2%n1,n1);
    }
}
