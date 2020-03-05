package hac.study.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Algorithm27DP_11656 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inStr = br.readLine();
        String[] arr = new String[inStr.length()];

        for (int i = 0; i < inStr.length(); i++) {
            arr[i] = inStr.substring(0 + i, inStr.length());
        }

        Arrays.sort(arr);

        for (String s : arr) {
            System.out.println(s);
        }
    }
}
