package hac.study.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Algorithm37DP_1373 {
    public static void main(String[] args) throws IOException {


//        test1();  //왜안되노


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder(br.readLine());





    }

    private static void test1() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb =  new StringBuilder(br.readLine());
        sb.reverse();

        System.out.println(convert(sb));

    }

    private static String convert(StringBuilder sb) {
        long sum = 0;
        for (int i = 0; i < sb.length(); i++) {
            int g = i == 0 ? 1 : (int) Math.pow(2, i);
            int v = Integer.parseInt(sb.substring(i, i+1));
            sum +=  v * g;
        }
        return toEight(sum);
    }

    private static String toEight(long sum) {
        StringBuilder returnStr = new StringBuilder();
        while(sum > 0){
            returnStr.append(sum % 8);
            sum = (sum / 8);
        }
        return returnStr.reverse().toString();
    }
}
