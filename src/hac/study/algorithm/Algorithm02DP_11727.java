package hac.study.algorithm;

import java.util.Scanner;

public class Algorithm02DP_11727 {
    public static void main(String[] args) {
        // 11726 문제에서 2 x 2 케이스 추가됨
        //- 마지막에 항상 세로타일(2x1) 1개, 가로타일(1x2, 2 x 2)가 올 수 있음
        //
        //    세로타일이 왔을 경우 세로 타일의 길이를 제외하면 n-1,  2 x 1
        //
        //    가로타일이 왔을 경우 가로 타일의 길이를 제외하면 n-2, 1 x 2/ 2 x 2


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dp = new int[n + 1];

        for(int i = 0; i <= n; i++){
            if(i == 0){
                dp[i] = 1;
            }else if(i == 1){
                dp[i] = 1;
            }else{
                dp[i] = (dp[i - 1] + (dp[i - 2] * 2)) % 10007;
            }
        }
        System.out.println(dp[n]);


    }
}
