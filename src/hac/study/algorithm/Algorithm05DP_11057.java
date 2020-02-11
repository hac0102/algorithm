package hac.study.algorithm;

import java.util.Scanner;

public class Algorithm05DP_11057 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] dp = new int[n+1][10];
        long sum = 0;

        for (int i = 0; i < 10; i++) {
            dp[1][i] = 1;
        }

        for (int i = 2; i <= n; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k <= j; k++) {
                    dp[i][j] += dp[i-1][k] % 10007;
                }
            }
        }

        for (int i = 0; i < 10; i++) {
            sum += dp[n][i];
        }

        System.out.println(sum);
    }
}
