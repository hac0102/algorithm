package hac.study.algorithm;

import java.io.IOException;
import java.util.Scanner;

public class Algorithm43DP_1676 {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        for (int i=5; i<=n; i*=5) {
            ans += n/i;
        }
        System.out.println(ans);

    }
}
