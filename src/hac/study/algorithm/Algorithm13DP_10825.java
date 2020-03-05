package hac.study.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Algorithm13DP_10825 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String[][] arr = new String[n][4];

        for (int i = 0; i < n; i++) {
            String[] test = sc.nextLine().split(" ");
//            arr[i][0] = sc.next();
//            arr[i][1] = sc.next();
//            arr[i][2] = sc.next();
            arr[i][0] = test[0];
            arr[i][1] = test[1];
            arr[i][2] = test[2];
            arr[i][3] = test[3];
        }

        Arrays.sort(arr, new Comparator<String[]>() {
            @Override
            public int compare(String[] s, String[] t) {
                //국어점수 감소  내림차순
                //국어점수 같으면 영어 점수 증가
                //국어점수 == 국어점수 && 영어점수 == 영어점수,  수학점수 내림차순
                //모든점수 같으면 국 == 국 && 영 == 영 && 수 == 수, 이름 오름차순
//                if(Integer.parseInt(t[1]) == Integer.parseInt(s[1])) {
//                    if(Integer.parseInt(t[2]) == Integer.parseInt(s[2])){
//                        if(Integer.parseInt(t[3]) == Integer.parseInt(s[3])){
//                            return s[0].compareTo(t[0]);
//                        }
//                        return Integer.compare(Integer.parseInt(t[3]),  Integer.parseInt(s[3]));
//                    }
//                    return Integer.compare(Integer.parseInt(s[2]), Integer.parseInt(t[2]));
//                }
//                return Integer.compare(Integer.parseInt(t[1]), Integer.parseInt(s[1]));
                System.out.println("tttt ::" + t[1] + "    :: " + s[1] );


                return Integer.compare(Integer.parseInt(s[1]), Integer.parseInt(t[1]));
            }
        });

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i][0]);
        }


    }
}
