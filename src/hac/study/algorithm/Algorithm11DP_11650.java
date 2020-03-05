package hac.study.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Array;
import java.util.*;

public class Algorithm11DP_11650 {
    public static void main(String[] args) throws IOException {
//        test1();

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int[][] arr = new int[n][2];

        for (int i = 0; i < n; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }


        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] x, int[] y) {
                if(x[1] == y[1]){
                    return Integer.compare(x[0], y[0]);
                }
                return Integer.compare(x[1], y[1]);
            }
        });


        for (int i = 0; i < n; i++) {
            System.out.println(arr[i][0] + " " + arr[i][1]);
        }


    }

    private static void test1() {

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(br.readLine());
            ArrayList<Integer> leftList = new ArrayList<>();
            ArrayList<Integer> rightList = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                String[] splitStr = br.readLine().split(" ");
                leftList.add(Integer.parseInt(splitStr[0]));
                rightList.add(Integer.parseInt(splitStr[1]));
            }

            Collections.sort(leftList);
            Collections.sort(rightList);

            for (int i = 0; i < n; i++) {
                System.out.println(leftList.get(i) + " " + rightList.get(i));
            }



        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
