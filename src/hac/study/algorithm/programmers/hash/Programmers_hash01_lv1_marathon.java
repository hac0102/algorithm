package hac.study.algorithm.programmers.hash;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Programmers_hash01_lv1_marathon {
    public static void main(String[] args) {
        //참여선수
        String[] participant = {"leo", "kiki", "eden"};
        //완주선수
        String[] comppletion = {"eden", "kiki"};

        sol(participant, comppletion);
    }

    private static String sol(String[] participant, String[] completion) {
        String answer = "";
        Arrays.sort(participant);
        Arrays.sort(completion);

        Map<String, Integer> map = new HashMap<>();

        for (String p : participant) {
            if(map.containsKey(p)){
                map.put(p, map.get(p) + 1);
            }else{
                map.put(p, 1);
            }
        }

        for (String c : completion) {
            map.put(c, map.get(c) - 1);
        }

        for(Map.Entry<String, Integer> m : map.entrySet()){
            if(m.getValue() == 1){
                answer = m.getKey();
            }
        }

        return answer;

    }
}
