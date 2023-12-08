package CodeVita;

public class CivilWar {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//        int[] powers = new int[N];
        int N = 3;
        int[] powers = {3,10,-8};

//        for (int i = 0; i < N; i++) {
//            powers[i] = sc.nextInt();
//        }

        long teamIronMan = 0;  // Power of Iron Man's team
        long teamCaptain = 0;  // Power of Captain America's team
        boolean ironManTurn = true;  // Indicates whose turn it is to choose

        int left = 0;  // Left pointer
        int right = N - 1;  // Right pointer

        while (left <= right) {
            if (ironManTurn) {
                if (powers[left] > powers[right]) {
                    teamIronMan += powers[left];
                    left++;
                } else {
                    teamIronMan += powers[right];
                    right--;
                }
            } else {
                if (powers[left] > powers[right]) {
                    teamCaptain += powers[left];
                    left++;
                } else {
                    teamCaptain += powers[right];
                    right--;
                }
            }

            ironManTurn = !ironManTurn;  // Toggle turn
        }

        long teamDifference = Math.abs(teamIronMan - teamCaptain);
        System.out.println(teamDifference);
        //sc.close();
    }
}
