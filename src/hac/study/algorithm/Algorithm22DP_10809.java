package hac.study.algorithm;

import java.io.IOException;
import java.util.Scanner;

public class Algorithm22DP_10809 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String inStr = sc.nextLine();

        for (char c = 'a'; c <= 'z'; c++) {
            System.out.print(inStr.indexOf(c) + " ");
        }
    }
}
