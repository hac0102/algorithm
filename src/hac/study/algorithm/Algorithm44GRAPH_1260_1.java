package hac.study.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Algorithm44GRAPH_1260_1 {
    static ArrayList<Integer>[] a;
    static boolean[] c;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int loopNum = Integer.parseInt(st.nextToken());
        int start = Integer.parseInt(st.nextToken());
        a = new ArrayList[n + 1];

        for (int i = 1; i <= n; i++) {
            a[i] = new ArrayList<>();
        }

        for (int i = 0; i < loopNum; i++) {
            st = new StringTokenizer(br.readLine());
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
        //큐
        Queue<Integer> q = new LinkedList<>();

        q.add(start);
        c[start] = true;

        while(!q.isEmpty()){
            int x = q.remove();
            System.out.print(x + " ");
            for (int y : a[x]) {
                if (!c[y]) {
                    c[y] = true;
                    q.add(y);
                }
            }
        }

    }

    private static void dfs(int x) {
        //이미 탐색했으면 true
        if (c[x]) {
            return;
        }

        c[x] = true;
        System.out.print(x + " ");

        for (int y : a[x]) {
            if (!c[y]) {
                dfs(y);
            }
        }
    }
}
