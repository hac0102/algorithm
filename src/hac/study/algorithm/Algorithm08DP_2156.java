package hac.study.algorithm;

import java.util.Scanner;

public class Algorithm08DP_2156 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        long[] dp = new long[T + 1];
        long[] inputArr = new long[T + 1];

        for (int i = 0; i < T; i++) {
            inputArr[i] = sc.nextInt();
        }

        dp[0] = inputArr[0];
        dp[1] = dp[0] + inputArr[1];
        dp[2] = Math.max(dp[1], Math.max(inputArr[0] + inputArr[2], inputArr[1] + inputArr[2]));
        for (int i = 3; i <= T; i++) {
            dp[i] = Math.max(dp[i-3] + inputArr[i-1] + inputArr[i], dp[i-2] +inputArr[i]);
            dp[i] = Math.max(dp[i-1], dp[i]);
        }
        System.out.println(dp[T]);
    }
}
