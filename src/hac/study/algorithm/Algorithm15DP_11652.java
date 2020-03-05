package hac.study.algorithm;

import java.beans.IntrospectionException;
import java.io.*;
import java.util.*;

public class Algorithm15DP_11652 {
    public static void main(String[] args) throws IOException {

        test1();
//        test2();






    }

    private static void test2() throws IOException {

        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Integer[] arr = new Integer[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        for (int i = 1; i < n; i++) {
            if (arr[i] == arr[i - 1]) {

            }
        }

//        Arrays.sort(arr, new Comparator<Integer>() {
//            @Override
//            public int compare(Integer s, Integer t) {
//                System.out.println("ssss :: " + s);
//                System.out.println("tttt :: " + t);
//
//
//                return Integer.compare(s, t);
//            }
//        });

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }




    }

    private static void test1() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int key = Integer.parseInt(br.readLine());
            if(map.containsKey(key)){
                map.put(key, map.get(key).intValue() + 1);
            }else{
                map.put(key,1);
            }
        }

        Collection<Integer> value = map.values();
        int max_value = Collections.max(value);

        if (!map.isEmpty()) {
            Map<Integer, Integer> emptyMap = new HashMap<>();
            for(Integer i  : map.keySet()) {
                if (map.get(i) == max_value) {
                    emptyMap.put(i, i);
                }
            }

            value = emptyMap.values();
            System.out.println(Collections.min(value));
        }
    }
}
