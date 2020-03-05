package hac.study.algorithm;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Algorithm12DP_10814 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String[][] arr = new String[n][2];


        for (int i = 0; i < n; i++) {
            arr[i][0] = sc.next();
            arr[i][1] = sc.next();
        }

        Arrays.sort(arr, new Comparator<String[]>() {
            @Override
            public int compare(String[] t1, String[] t2) {
                return Integer.compare(Integer.parseInt(t1[0]),Integer.parseInt(t2[0]));
            }
        });


        for (int i = 0; i < n; i++) {
            System.out.println(arr[i][0] + " " + arr[i][1]);
        }

    }
}
