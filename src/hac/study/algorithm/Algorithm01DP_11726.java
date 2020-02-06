package hac.study.algorithm;

import java.util.Scanner;

public class Algorithm01DP_11726 {
    public static void main(String[] args) {
        //다이내믹프로그래밍
//        2×n 크기의 직사각형을 1×2, 2×1 타일로 채우는 방법의 수를 구하는 프로그램을 작성하시오.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n + 1];

        arr[1] = 1;
        if(n >= 2){
            arr[2] = 2;
        }

        for (int i = 3; i <= n; i++) {
            arr[i] = (arr[i-1] + arr[i-2]) % 10007;
        }
    }

}
