package hac.study.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Algorithm30DP_10430 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int oprer1 = (a + b) % c;
        int oprer2 = (a % c + b % c) % c;
        int oprer3 = (a * b) % c;
        int oprer4 = (a % c * b % c) % c;

        System.out.println(oprer1);
        System.out.println(oprer2);
        System.out.println(oprer3);
        System.out.println(oprer4);
    }
}
