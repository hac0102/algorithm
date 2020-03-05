package hac.study.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Algorithm40DP_6588 {
    public static boolean[] primeNum;

    public static void main(String[] args) throws IOException {
        //담에 풉시더
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int startNum = Integer.parseInt(st.nextToken());
        int endNum = Integer.parseInt(st.nextToken());

        primeNum = new boolean[endNum+1];
        getPrimeNum();

    }

    public static void getPrimeNum() {
        primeNum[1] = true;

        for(int i= 2; i < primeNum.length; i++) {
            for(int j = 2; i*j < primeNum.length; j++) {
                primeNum[i*j] = true;
            }
        }
    }
}
