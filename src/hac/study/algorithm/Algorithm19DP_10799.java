package hac.study.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Algorithm19DP_10799 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputStr = br.readLine();
        int cnt = 0;
        Stack st = new Stack();

        for (int i = 0; i < inputStr.length(); i++) {
            if (inputStr.charAt(i) == '(') {
                if(inputStr.charAt(i + 1) == ')'){
                    //( 다음에 바로 ) 레이져일경우, (  () )  쇠막대기가 있을때 ()레이져쏘면 막대기 쪼개 스택쌓인거 더
                    i++;
                    cnt += st.size();
                    continue;
                }
                //막대기 + 1짐
                st.push(1);
            }else{
                //   } 제거 막대갯수 +1
                st.pop();
//                막대기 증가
                cnt++;
            }
        }
        System.out.println(cnt);
    }

}
