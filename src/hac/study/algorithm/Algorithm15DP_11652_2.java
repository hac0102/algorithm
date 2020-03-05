package hac.study.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Algorithm15DP_11652_2 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        Map<Long, Long> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            long key = Long.parseLong(br.readLine());
            if(map.containsKey(key)){
                map.put(key, map.get(key).longValue() + 1);
            }else{
                map.put(key,(long)1);
            }
        }

        Collection<Long> value = map.values();
        long max_value = Collections.max(value);

        if (!map.isEmpty()) {
            Map<Long, Long> emptyMap = new HashMap<>();
            for(Long i  : map.keySet()) {
                if (map.get(i) == max_value) {
                    emptyMap.put(i, i);
                }
            }

            value = emptyMap.values();
            System.out.println(Collections.min(value));
        }

    }

}
