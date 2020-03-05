package hac.study.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Algorithm10DP_2751 {
    public static void main(String[] args) throws IOException {

//        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        ArrayList<Integer> intList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
//            intList.add(i, Integer.parseInt(sc.nextLine()));
            intList.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(intList);
        for (int i = 0; i < n; i++) {
            System.out.println(intList.get(i));
        }

    }
}
