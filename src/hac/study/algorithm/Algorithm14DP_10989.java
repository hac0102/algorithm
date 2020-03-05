package hac.study.algorithm;

import java.io.*;
import java.util.Arrays;

// 틀림 넘어감
public class Algorithm14DP_10989 {
    public static void main(String[] args) throws IOException {

        //딴사람이 한거
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++){
            sb.append(arr[i] + "\n");
        }
        System.out.println(sb);
    }

}
