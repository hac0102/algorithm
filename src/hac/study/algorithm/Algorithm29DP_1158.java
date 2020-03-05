package hac.study.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;
import java.util.StringTokenizer;

public class Algorithm29DP_1158 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int cnt = 1;
        StringBuilder sb = new StringBuilder("<");

        Deque<Integer> que = new ArrayDeque<>();

        for (int i = n; 0 < i; i--) {
            que.push(i);
        }

        while(que.size() > 0){
            if(cnt % k == 0){
                sb.append(que.getFirst() + ", ");
                que.pop();
            }else{
                que.addLast(que.removeFirst());
//                que.pop();
            }
            cnt++;
        }

        sb.delete(sb.length()-2, sb.length()).append(">");
        System.out.println(sb);

    }
}
