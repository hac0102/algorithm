package hac.study.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Algorithm41DP_11653 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 2; i * i <= n; i++) {
            if(n % i == 0) {
                System.out.println(i);
                n /= i;
                i--;
            }
        }

        if(n > 1){
            System.out.println(n);
        }

    }
}
