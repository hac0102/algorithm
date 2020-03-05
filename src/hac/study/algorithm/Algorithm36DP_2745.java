package hac.study.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Algorithm36DP_2745 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        sb.append(st.nextToken());
        sb.reverse();

        char[] cArr = sb.toString().toCharArray();
        int punc = Integer.parseInt(st.nextToken());
        long sum = 0;

        for (int i = 0; i < cArr.length; i++) {
            long g = i == 0 ? 1 : (long) Math.pow(punc, i);
            if (cArr[i] >= '0' && cArr[i] <= '9') {
                sum += Integer.parseInt(String.valueOf(cArr[i])) * g;
            }else{
                sum += (cArr[i] - 55) * g;
            }
        }
        System.out.println(sum);
    }
}



//        int punc = Integer.parseInt(st.nextToken());
//        int sum = 0;
//        for (int i = 0; i < sb.length(); i++) {
//            int v = sb.charAt(i) - 55 > 10 ? sb.charAt(i) - 55 : Integer.parseInt(String.valueOf(sb.charAt(i)));
//            int g = i == 0 ? 1 : (int) Math.pow(punc, i);
//            sum += v * g;
//        }