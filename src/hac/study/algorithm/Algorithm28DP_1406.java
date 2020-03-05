package hac.study.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Stack;
import java.util.StringTokenizer;

public class Algorithm28DP_1406 {
    static int cursor = 0;
    public static void main(String[] args) throws IOException {
//       test1();
        test2();



    }

    private static void test2() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int n = Integer.parseInt(br.readLine());
        Stack<String> left = new Stack<>();
        Stack<String> right = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            left.push(s.substring(i, i + 1));
        }

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String c = st.nextToken();

            switch(c){
                case "L" :
                    if(!left.isEmpty()){
                        right.push(left.pop());
                    }
                    break;
                case "D" :
                    if(!right.isEmpty()){
                        left.push(right.pop());
                    }
                    break;
                case "B" :
                    if(!left.isEmpty()){
                        left.pop();
                    }
                    break;
                case "P" :
                    left.push(st.nextToken());
                    break;
            }
        }

        while(!left.isEmpty()) right.push(left.pop());
        while(!right.isEmpty()) System.out.print(right.pop());
    }




    private static void editor(Stack<String> stack, String[] splitStr) {
        String cmd = splitStr[0];

        if(splitStr.length > 1){
            String val = splitStr[1];
            stack.add(cursor, val);
            cursor++;
        }else{
            if("L".equals(cmd)){
                if(cursor == 0){
                    return;
                }
                cursor--;
            }

            if("D".equals(cmd)){
                if(cursor == stack.size() ){
                    return;
                }
                cursor++;
            }

            if("B".equals(cmd)){
                if(cursor == 0){
                    return;
                }
                stack.remove(cursor - 1);
                cursor--;
            }
        }
    }

    private static void test1() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inStr = br.readLine();
        int n = Integer.parseInt(br.readLine());

        LinkedList<String> list = new LinkedList<>();
        for (int i = 0; i < inStr.length(); i++) {
            list.add(String.valueOf(inStr.charAt(i)));
        }

        for (int i = 0; i < n; i++) {
            String[] splitStr = br.readLine().split(" ");
            edit(list, splitStr);
        }

        System.out.println(list);
    }

    private static void edit(LinkedList<String> list, String[] splitStr) {
        String cmd = splitStr[0];
        int idx = list.size();
        System.out.println(idx);

        if(splitStr.length > 1){
            //p
            String val = splitStr[1];
            if(idx == 0){
                return;
            }

            if("P".equals(cmd)){
                list.add(val);
                idx++;
            }


        }else{
            if (idx == 0) {
                return;
            }

            if("L".equals(cmd)){
                idx--;
            }

            if("D".equals(cmd)){
                idx++;
            }

            if("B".equals(cmd)){
                list.remove(idx);
            }
        }

    }
}
