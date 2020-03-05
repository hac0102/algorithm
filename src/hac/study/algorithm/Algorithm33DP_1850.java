package hac.study.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.StringTokenizer;

public class Algorithm33DP_1850 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        long x = Long.parseLong(st.nextToken());
        long y = Long.parseLong(st.nextToken());
        long gcd = gcd(x, y);

        for (int i = 0; i < gcd; i++) {
            sb.append("1");
        }

        System.out.println(sb);
    }

    private static long gcd(long x, long y) {
        if (y == 0) {
            return x;
        }else{
            return gcd(y, x % y);
        }
    }
}
