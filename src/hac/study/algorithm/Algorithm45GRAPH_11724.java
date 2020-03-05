package hac.study.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Algorithm45GRAPH_11724 {
    static ArrayList<Integer>[] a;
    static boolean[] c;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int ans = 0;
        a = new ArrayList[n + 1];


        for (int i = 1; i <= n; i++) {
            a[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            a[u].add(v);
            a[v].add(u);
        }

        c = new boolean[n + 1];
        for (int i = 1; i <= n; i++) {
            if (!c[i]) {
                dfs(i);
                ans += 1;
            }
        }

        System.out.println(ans);
    }

    private static void dfs(int x) {
        if (c[x]) {
            return;
        }

        c[x] = true;

        for (int y : a[x]) {
            if (!c[y]) {
                dfs(y);
            }
        }
    }
}
