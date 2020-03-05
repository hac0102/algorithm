package hac.study.algorithm;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Algorithm17DP_10828 {
    private static int pop = -1;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] stackArr = new int[n];

        for (int i = 0; i < n; i++) {
            String[] lineStr = br.readLine().split(" ");
            stack1(stackArr, lineStr);
        }


    }

    private static void stack1(int[] stackArr, String[] lineStr) {
        String oper = lineStr[0];
        int value;



        if(lineStr.length > 1){
            value = Integer.parseInt(lineStr[1]);

            if ("push".equals(oper)) {
                pop++;
                System.out.println("111  pop :; " + pop);
                stackArr[pop] = value;
            }

        } else {

            if ("top".equals(oper)) {
                if(pop == -1){
                    System.out.println(-1);
                    return;
                }else{
                    System.out.println(stackArr[pop]);
                    return;
                }
            }

            if("empty".equals(oper)){
                System.out.println(pop == -1 ? 1 : 0);
                return;
            }

            if("size".equals(oper)){
                System.out.println("pop ::; " + pop);
                System.out.println(pop == -1 ? 0 : pop + 1);
                return;
            }

            if("pop".equals(oper)) {
                if (pop < 0) {
                    System.out.println(-1);
                    return;
                }
                System.out.println(stackArr[pop]);
                pop--;
            }
        }
    }
}

