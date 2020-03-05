package hac.study.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Algorithm38DP_1979 {
    public static void main(String[] args) throws IOException {
        //소수 1과 자기자신의 수로만 나누어 떨어지는 수
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int cnt = 0;

        for (int i = 0; i < n; i++ ) {
            int inNum = sc.nextInt();
            int emptyCnt = 0;
            for (int j = 1; j <= inNum; j++) {
                if(inNum == 1){
                    break;
                }

                if(inNum % j == 0){
                    emptyCnt++;
                }

            }
            if (emptyCnt == 2) {
                cnt++;
            }
        }

        System.out.println(cnt);


    }
}
