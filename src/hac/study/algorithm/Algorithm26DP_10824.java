package hac.study.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Algorithm26DP_10824 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        String sum1 = str[0] + str[1];
        String sum2 = str[2] + str[3];
        System.out.println(Long.parseLong(sum1) + Long.parseLong(sum2));


    }
}
