package hac.study.algorithm;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Algorithm18DP_9012 {
    public static void main(String[] args) throws IOException {

//        test1(); //왜안되지

        test2();    //스택으로 딴사람이 푼거





    }

    private static void test2() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int repeat = Integer.parseInt(br.readLine());
        for (int j = 0; j < repeat; j++) {
            String input = br.readLine();
            String res = "YES";
            Stack st = new Stack<>();
            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) == '(') {
                    st.push(1);
                } else if (input.charAt(i) == ')') {
                    if (st.isEmpty()) {
                        res = "NO";
                        break;
                    } else {
                        st.pop();
                    }
                }
            }
            if(!st.isEmpty()) {
                res = "NO";
            }
            System.out.println(res);
        }
    }

    private static void test1() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] arr = new String[n];

        for (int i = 0; i < n; i ++) {
            arr[i] = br.readLine();
        }

        for (int i = 0; i < n; i++) {
            vps(arr[i]);
        }
    }

    private static void vps(String s) {
        int a = 0;
        int b = 0;
        for (int i = 0; i < s.length(); i++) {
            if(')' == s.charAt(0)){
                System.out.println("NO");
                return;
            } else if('(' == s.charAt(i)){
                a++;
            } else if(')' == s.charAt(i)){
                b++;
            }
        }
        System.out.println(a != b ? "NO" : "YES");
    }
}

