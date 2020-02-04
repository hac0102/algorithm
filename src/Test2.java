import java.io.BufferedReader;
import java.lang.reflect.Array;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

public class Test2 {

    public static void main(String[] args){

//        sol2558();
//        sol10950();
//        sol10951();
//        sol10952();
//        sol10953();
//        sol11021();
//        sol11022();
//        sol11718();
//        sol11719();
//        sol11720();
//        sol11721();
//        sol2741();
//        sol2742();
//        sol2739();
//        sol1924();
//        sol8393();
//        sol10818();
//        sol2438();
//        sol1463();


        System.out.println(fibo(7));




        
    }

    private static int fibo(int i) {
        if(i == 1 || i ==2){
            return 1;
        }else{
            return fibo(i-2) + fibo(i-1);
        }

    }

    private static void sol1463() {
        // 다이내믹 프로그래밍
        // 문제해결 방법
        //bottom-up  : 작은문제부터 차례대로, 문제의 크기를 조금씩 크게 만들면서 문제 품
        //top-down : 큰문제를 작은 문제로 나눔, 작은문제를 품, 재귀함수 방식으로 품;

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();








    }

    private static void sol2438() {
        Scanner sc = new Scanner(System.in);

        int inputNum = sc.nextInt();

        for (int i = 0; i < inputNum; i++){
            for(int j = 0; j < inputNum; j++){
                if (i < j) {
                    System.out.print(" ");

                } else {
                    System.out.print("*");
                }
            }
            System.out.println("");
        }

    }


    private static void sol10818() {
        Scanner sc = new Scanner(System.in);

        int max = -1000000, min = 1000000;
        int numCnt = sc.nextInt();
        int[] arr = new int[numCnt];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

            max = Math.max(max, arr[i]);
            min = Math.min(min, arr[i]);
        }

        System.out.println(min + " " + max);
    }

    private static void sol8393() {
        Scanner sc = new Scanner(System.in);

        int inputNum = sc.nextInt();
        int sum = 0;

        for (int i = 0; i < inputNum; i++) {
            sum += inputNum - i;
        }
        System.out.println(sum);

    }

    private static void sol1924() {
        Scanner sc = new Scanner(System.in);

        int year = 2007;
        int month = sc.nextInt();
        int day = sc.nextInt();

        LocalDate date = LocalDate.of(year, month, day);

        System.out.println(String.valueOf(date.getDayOfWeek()).substring(0, 3));

    }

    private static void sol2739() {
        Scanner sc = new Scanner(System.in);

        int inputNum = sc.nextInt();

        for (int i = 1; i < 10; i++) {
            String outStr = String.valueOf(inputNum) + " * " + String.valueOf(i) + " = ";
            int mul = inputNum * i;
            System.out.println(outStr + mul);
        }
    }

    private static void sol2742() {
        Scanner sc = new Scanner(System.in);

        int inputNum = sc.nextInt();

        for (int i = 0; i < inputNum; i++) {
            System.out.println(inputNum - i);
        }
    }

    private static void sol2741() {
//        int sc = new Scanner(System.in).nextInt();
//
//        int inputNum = sc.nextInt();
//
//        for (int i = 0; i < inputNum; i++) {
//            System.out.println(i + 1);
//        }
    }


    private static void sol11721() {
//        알파벳 소문자와 대문자로만 이루어진 길이가 N인 단어가 주어진다.
//        한 줄에 10글자씩 끊어서 출력하는 프로그램을 작성하시오.
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

//        System.out.println("aaaaaaaaaaaaaa ::" + str);
//        System.out.println("bbb ::" + 2/10);
//        System.out.println(10/10);
//        System.out.println(4/10);
//        System.out.println(5%10);
//        System.out.println(10%10);
        System.out.println(0 % 10);

        for (int i = 0; i < str.length(); i++) {
            if (i % 10 == 0) {
                System.out.println();
            }

            System.out.print(str.charAt(i));

        }

    }

    private static void sol11720() {
        Scanner sc = new Scanner(System.in);

        int strLength = sc.nextInt();
        String str = sc.next();
        int sum = 0;

        for (int i = 0; i < strLength; i++) {

            sum += Integer.parseInt(str.substring(i, i + 1));
        }
        System.out.println(sum);

    }

    private static void sol11719() {
        Scanner sc = new Scanner(System.in);

        while(sc.hasNextLine()){
            String str = sc.nextLine();
            System.out.println(str);
        }

    }

    private static void sol11718() {

        Scanner sc = new Scanner(System.in);

        while(sc.hasNextLine()){
            String str = sc.nextLine();
            System.out.println(str);
        }


    }

    private static void sol11022() {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            String plusStr = String.valueOf(x) + " + " + String.valueOf(y) + " = " + (x + y);
            String testNum = String.valueOf(i + 1) + ": ";
            System.out.println("Case #" + testNum + plusStr);
        }

    }

    private static void sol11021() {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for(int i = 0; i < T; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int sum = x + y;
            System.out.println("Case #" + String.valueOf(i + 1) + " : " + sum);
        }
    }

    private static void sol10953() {
        // 처째줄에 테스트 케이스의 개수 T가 주어진다
        // 각테스트 케이스는 한줄로 이루어져 있으며, 각줄에 A, B가 주어진다. A, B는 콤마로 구분되어있다.

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for(int i = 0; i < T; i++){
            String[] arr = sc.next().split(",");

            System.out.println(Integer.parseInt(arr[0])+ Integer.parseInt(arr[1]));
        }
//        sc.close();

    }

    private static void sol10952() {
        //입력은 여러개의 테스트 ㅔ이스로 이루어져 있따
        // 각 테스트 케이스는 한줄로 이루어져 있으며, 각 줄에 A, B가 주어진다
        // 입력의 마지막에는 0 두 개가 들어온다.   --> 반복 끝나는지점인가??  0 0 두개 입력되면 끝??
        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()){
//            if(sc.nextInt() == 0 && sc.nextInt() == 0){

//            }
//            System.out.println(sc.nextInt() + sc.nextInt());
            int x = sc.nextInt();
            int y = sc.nextInt();

            if(x == 0 && y == 0){
                break;
            }

            System.out.println(x + y);

        }


    }

    private static void sol10951() {
        //입력은 여러개의 테슽 케이스로 이루어져 있따  ??????????? 무한입력? 제한이 없따는긴가
        // 1 1      2
        // 2 2      4
        // 3 3      6

        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()){
            System.out.println(sc.nextInt() + sc.nextInt());
        }

    }

    private static void sol10950() {
        Scanner sc = new Scanner(System.in);

        int cnt = sc.nextInt();

        for(int i = 0; i < cnt; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();

            System.out.println(x + y);
        }

    }

    private static void sol2558() {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.println(x + y);
    }
}
