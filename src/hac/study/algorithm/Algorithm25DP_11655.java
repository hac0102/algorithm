package hac.study.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Algorithm25DP_11655 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        char[] arr = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            arr[i] = (encodeStr(str.charAt(i)));
        }

        System.out.println(arr);
    }

    private static char encodeStr(char c) {
        if (c >= 'a' && c <= 'm') {
            return (char) (c + 13);
        }

        if (c > 'm' && c <= 'z') {
            return (char) ((c + 13) - 26);
        }

        if (c >= 'A' && c <= 'M') {
            return (char) (c + 13);
        }

        if (c > 'M' && c <= 'Z') {
            return (char) ((c + 13) - 26);
        }

        return c;
    }
}
