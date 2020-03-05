package hac.study.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Algorithm44GRAPH_1260 {
    static ArrayList<Integer>[] a;
    static boolean[] c;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int loopNum = Integer.parseInt(st.nextToken());
        int start = Integer.parseInt(st.nextToken());


        //점 초기화
        a = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            a[i] = new ArrayList<>();
        }

        for (int i = 0; i < loopNum; i++) {
            st =  new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            a[u].add(v);
            a[v].add(u);
        }

        for (int i = 1; i <= n; i++) {
            Collections.sort(a[i]);
        }

        c = new boolean[n + 1];
        dfs(start);
        System.out.println();

        c = new boolean[n + 1];
        bfs(start);
        System.out.println();



    }

    private static void bfs(int start) {
        // bfs 큐 애는 fifo 첨들어온게 먼져 나감
        Queue<Integer> que = new LinkedList<>();
        que.add(start);
        c[start] = true;
        //큐가 빌떄까지 반복
        while(!que.isEmpty()){
            int x = que.remove();
            System.out.print(x + " ");
            for (int y : a[x]) {
                if (!c[y]) {
                    c[y] = true;
                    que.add(y);
                }
            }
        }
    }

    private static void dfs(int x) {
        //스택 - lifo
        // start - pop - 인접한 노드 push - pop - Pop한 인접한 노드 push empty될때까지 반복
        //이미 탐색 했으면/true 이면 return
        if(c[x]){
            return;
        }

        //탐색하는값 true로,  c[x] = false 디폴트값
        c[x] = true;
        System.out.print(x + " ");
        for (int y : a[x]) {
            if (!c[y]) {
                dfs(y);
            }
        }
    }
}
