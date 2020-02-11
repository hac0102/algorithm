package hac.study.algorithm;

import java.util.Scanner;

public class Algorithm06DP_2193 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        int[][] dp = new int[n + 1][99999];
        int[] dp = new int[n+1];

        dp[0] = 1;
        dp[1] = 1;


        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i-2] + dp[i-1];
        }

        System.out.println(dp[n-1]);

        arr2();
    }

    private static void arr2() {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[][] dp = new long[n+1][9999];

        dp[0][0] = 1;
        dp[0][1] = 1;
        dp[1][0] = 1;

        for (int i = 2; i <= n; i++ ) {

            dp[i][0] = dp[i-1][0] + dp[i-1][1];
            dp[i][1] = dp[i-1][1];

        }

        long sum = 0;
        for(int i = 0; i < 2; i++){
            sum += dp[n][i];
        }
        System.out.println(sum);

    }


}
