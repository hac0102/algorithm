package hac.study.algorithm.programmers.sort;

import java.util.Arrays;

public class Programmers_sort01_lv1_k {
    public static void main(String[] args) {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {
                {2,5,3},
                {4,4,1},
                {1,7,3},
        };

        int[] result = sol(array, commands);

        System.out.println(result);
        for(int i = 0; i < result.length; i++){
            System.out.println(result[i]);
        }
    }

    private static int[] sol(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for (int i = 0; i < commands.length; i++) {
            int startIdx = commands[i][0];
            int endIdx = commands[i][1];
            int findIdx = commands[i][2];
            answer[i] = sort(array, startIdx, endIdx, findIdx);
        }
        return answer;
    }

    private static int sort(int[] arr, int s, int e, int f){
        int[] tmpArr = Arrays.copyOfRange(arr, s-1, e);
        Arrays.sort(tmpArr);
        return tmpArr[f - 1];
    }

}
