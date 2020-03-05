package hac.study.algorithm;

import java.util.Scanner;

public class Algorithm07DP_9465 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < T; i++) {
            int n = Integer.parseInt(sc.nextLine());
            long[][] saveArr = new long[3][n + 1];
            long[][] dp = new long[3][n + 1];
            for (int j = 0; j < 2; j++) {
                String[] inputValArr = sc.nextLine().split(" ");
                for (int k = 1; k <= n; k++) {
                    saveArr[j][k] = Integer.parseInt(inputValArr[k-1]);
                }
            }

            dp[0][0] = 0;
            dp[1][0] = 0;
            dp[0][1] = saveArr[0][1];
            dp[1][1] = saveArr[1][1];
//            dp[2][0] = 0;
            for (int m = 2; m <= n; m++) {
                dp[0][m] = Math.max(dp[1][m-1], dp[1][m-2]) + saveArr[0][m];
                dp[1][m] = Math.max(dp[0][m-1], dp[0][m-2]) + saveArr[1][m];
//                dp[2][m] = Math.max(dp[0][m-1], Math.max(dp[0][m-1], dp[1][m-2]));
            }

            System.out.println(Math.max(dp[0][n], Math.max(dp[1][n], dp[2][n])));

        }





//        Scanner sc = new Scanner(System.in);
//        int T = Integer.parseInt(sc.nextLine());
//
//        for (int i = 0; i < T; i++) {
//            int n = Integer.parseInt(sc.nextLine());
//            long[][] saveArr = new long[3][100000];
//            long[][] sum = new long[3][n + 1];
//            for (int j = 0; j < 2; j++) {
//                String[] inArr = sc.nextLine().split(" ");
//                for (int k = 1; k <= n; k++) {
//                    saveArr[j][k] = Integer.parseInt(inArr[k-1]);
//                }
//            }
//
//            sum[0][0] = 0;
//            sum[1][0] = 0;
//            sum[0][1] = saveArr[0][1];
//            sum[1][1] = saveArr[1][1];
//            for (int m = 2; m <= n; m++) {
////                sum[0][m] = Math.max(sum[m-1][0], Math.max(sum[m-1][1], sum[m-1][2]));
//                sum[0][m] = Math.max(sum[1][m-1], sum[1][m-2]) + saveArr[0][m];
//                sum[1][m] = Math.max(sum[0][m-1], sum[0][m-2]) + saveArr[1][m];
//
//
//            }
//            System.out.println(Math.max(sum[0][n], sum[1][n]));
//        }

    }
}
