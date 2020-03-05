package hac.study.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Algorithm31DP_2609 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int x = Integer.parseInt(st.nextToken());
        int y =  Integer.parseInt(st.nextToken());

        int gcd = gcd(x, y);
        int lcm = x * y / gcd;
        System.out.println(gcd);
        System.out.println(lcm);

    }

    private static int gcd(int x, int y) {
        if(y == 0){
            return x;
        }else{
            return gcd(y, x % y);
        }
    }
}
