package hac.study.algorithm;

import java.util.Scanner;

public class Algorithm09DP_11053 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        int[] dp = new int[n + 1] ;
        int[] inputArr = new int[n + 1];
//        String[] inputArr = sc.nextLine().split(" ");


        for (int i = 1; i <= n; i++) {
            inputArr[i] = sc.nextInt();
        }
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = 1;
            for (int j = 0; j <= i; j++) {
                if(inputArr[i] > inputArr[j]){
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }

        System.out.println(dp[n]);
    }
}
