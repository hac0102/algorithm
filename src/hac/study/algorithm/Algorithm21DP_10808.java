package hac.study.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Algorithm21DP_10808 {
    public static void main(String[] args) throws IOException {
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        String[] alpha = {"a", "b", "c", "d", "e", "f", "g"
                , "h", "i", "j", "k", "l", "m", "n", "o", "p"
                , "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"
        };
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inStr = br.readLine();

        for (int i = 0; i < alpha.length; i++) {
            map.put(alpha[i], 0);
        }

        for (int i = 0; i < inStr.length(); i++) {
            String key = String.valueOf(inStr.charAt(i));
            map.put(key, map.get(key) + 1);
        }

        for (Map.Entry<String, Integer> o : map.entrySet()) {
            System.out.print(o.getValue() + " ");
        }

    }
}
