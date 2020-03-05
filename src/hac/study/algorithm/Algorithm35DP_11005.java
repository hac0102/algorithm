package hac.study.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Algorithm35DP_11005 {

    static LinkedList<Long> list = new LinkedList<>();

    public static void main(String[] args) throws IOException {

//        test1();    //내가한거 개김



        BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder   sb = new StringBuilder();


        int num  = Integer.parseInt(st.nextToken());
        int punc = Integer.parseInt(st.nextToken());


        while(num > 0) {
            int remain = num % punc;
            if(remain < 10) sb.append(remain);
            else sb.append((char) (remain + 55));
            num = (num / punc);
        }

        System.out.println(sb.reverse());

    }

    private static void test1() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long x = Long.parseLong(st.nextToken());
        long y = Long.parseLong(st.nextToken());
        String[] arr = new String[36];

        for (int i = 0; i < 10; i++) {
            arr[i] = String.valueOf(i);
        }

        for (int i = 10; i < arr.length; i++) {
            arr[i] = String.valueOf((char) ('A' + (i-10)));
        }

        samSibYook(x, y);
        Collections.reverse(list);

        for (long i = 0; i < list.size(); i++) {
            System.out.print(arr[Math.toIntExact(list.get((int) i))]);
        }

    }

    private static long samSibYook(long x, long y) {
        if (x < y) {
            list.add(x);
            return x;
        }else {
            list.add(x%y);
            return samSibYook(x / y, y);
        }
    }
}
