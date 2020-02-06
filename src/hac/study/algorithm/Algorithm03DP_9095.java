package hac.study.algorithm;

import java.util.Scanner;

public class Algorithm03DP_9095 {
    public static void main(String[] args){
        // 1, 2, 3 더하기
//        정수 4를 1, 2, 3의 합으로 나타내는 방법은 총 7가지가 있다. 합을 나타낼 때는 수를 1개 이상 사용해야 한다.
//
//        1+1+1+1
//        1+1+2
//        1+2+1
//        2+1+1
//        2+2
//        1+3
//        3+1
//        정수 n이 주어졌을 때, n을 1, 2, 3의 합으로 나타내는 방법의 수를 구하는 프로그램을 작성하시오.
//
//        입력
//        첫째 줄에 테스트 케이스의 개수 T가 주어진다. 각 테스트 케이스는 한 줄로 이루어져 있고, 정수 n이 주어진다. n은 양수이며 11보다 작다.

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        int[] dp = new int[n + 1];
        int[] dp = new int[999999];

        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;

        for(int i = 0; i < n; i++){         //입력한 n 반복돌 횟수
            int inputNum = sc.nextInt();
//            System.out.println("aaaa ::" + i);
//            System.out.println("inputNum ::" + inputNum);
            for(int j = 4; j <= inputNum; j++){
//                System.out.println("bbbbb ::" + j);
                dp[j] = dp[j-1] + dp[j-2] + dp[j-3];
            }
            System.out.println(dp[inputNum]);
        }
    }
}
