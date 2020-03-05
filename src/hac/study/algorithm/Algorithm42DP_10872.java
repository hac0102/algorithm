package hac.study.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class Algorithm42DP_10872 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        System.out.println(factorial(n));

    }

    private static long factorial(int n) {
        if (n == 0){
            return 1;
        }else{
            return n * factorial(n-1);
        }

    }

}
