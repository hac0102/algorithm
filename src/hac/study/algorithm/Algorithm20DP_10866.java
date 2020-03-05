package hac.study.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Algorithm20DP_10866 {
    static int front = -1;
    static int back = 0;
    static  int cnt = 0;

    public static void main(String[] args) throws IOException {

//        test1();
        test2();


    }

    private static void test2() throws IOException {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        LinkedList<String> deque = new LinkedList<>();
        int n = Integer.parseInt(sc.nextLine());
        String command[][] = new String[n][];
        for(int i=0; i<n; i++){
            command[i] = sc.nextLine().split("\\s"); // "스페이스 바"로 구분
            switch (command[i][0]) {
                case "push_front":
                    deque.push(command[i][1]);
                    break;
                case "push_back" :
                    deque.add(command[i][1]);
                    break;
                case "pop_front" :
                    sb.append(deque.isEmpty() ? "-1\n" : deque.poll()+"\n");
                    break;
                case "pop_back" :
                    sb.append(deque.isEmpty() ? "-1\n" : deque.pollLast()+"\n");
                    break;
                case "size" :
                    sb.append(deque.size()+"\n");
                    break;
                case "empty" :
                    sb.append(deque.isEmpty() ? "1\n" : "0\n");
                    break;
                case "front" :
                    sb.append(deque.isEmpty() ? "-1\n" : deque.peekFirst()+"\n");
                    break;
                case "back" :
                    sb.append(deque.isEmpty() ? "-1\n" : deque.peekLast()+"\n");
                    break;
            }
        }
        System.out.print(sb);

    }


    private static void test1() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] arr = new String[n];
        back = arr.length;
        for (int i = 0; i < n; i++) {
            String[] inStr = br.readLine().split(" ");
            que(inStr, arr);
        }

    }

    private static void que(String[] inStr, String[] arr) {
        String cmd = inStr[0];

        if (inStr.length > 1) {
            int val = Integer.parseInt(inStr[1]);

            if(cmd.indexOf("front") != -1 ){
                front++;
                arr[front] = String.valueOf(val);
            }else{
                back--;
                arr[back] = String.valueOf(val);
            }
            cnt++;
        }else{
            if(cmd.indexOf("pop") != -1){
                if(cnt == 0){
                    System.out.println(-1);
                    return;
                }


                if(cmd.indexOf("front") != -1){
                    if (front == -1){
                        return;
                    }
                    System.out.println(arr[front]);
                    front--;
                }else{
                    if (back == arr.length) {
                        return;
                    }
                    System.out.println(arr[back]);
                    back++;
                }
                cnt--;
            }else if("front".equals(cmd)){
                System.out.println(cnt == 0 ? -1 : arr[front]);
            }else if("back".equals(cmd)){
                System.out.println(cnt == 0 ? -1 : arr[back]);
            }else if("size".equals(cmd)){
                System.out.println(cnt);
            }else if("empty".equals(cmd)){
                System.out.println(cnt == 0 ? 1 : 0);
            }

        }

    }

}
