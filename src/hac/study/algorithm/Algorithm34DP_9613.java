package hac.study.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Algorithm34DP_9613 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            long sum = 0;
            String[] lineStr = br.readLine().split(" ");
            int cnt = Integer.parseInt(lineStr[0]);
            for (int j = 1; j <= cnt; j++) {
                for (int k = j + 1; k <= cnt; k++ ) {
                    sum += gcd(Integer.parseInt(lineStr[j]), Integer.parseInt(lineStr[k]));
                }
            }
            System.out.println(sum);
        }
    }

    private static long gcd(int x, int y) {
        if (y == 0) {
            return x;
        }else{
            return gcd(y, x%y);
        }
    }
}
