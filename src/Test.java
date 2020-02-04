import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

    //피보나치
//        makeStar();

//        makeStiker();

//        func();

        //stringLecght("문자열 길이zzzzzΩΩΩΩ");

//        division();

//        System.out.println(;
        pinaryNumer(4);

    }

    private static void pinaryNumer(int i) {
        Scanner sc = new Scanner(System.in);
        String str = "";
//        int i = sc.nextInt();

        //입력받고, 이진수로 변환후 , 첫번째 글자가 0으로 시작하는지 || 11 로 시작하는거 개수 구하기

        //이진변환
        if(i < 2){
//            System.out.print(1);
            str += "1";
//            return 1;
        }else{
            pinaryNumer(i / 2);
//            System.out.print(i % 2);
            str += i % 2 == 0 ? "0" : "1";

        }

        System.out.print(str);


    }


    private static void division() {
        Scanner sc = new Scanner(System.in);

        double x = sc.nextInt();
        double y = sc.nextInt();

        System.out.println(x / y);

    }

    private static void func() {
        System.out.println("recursion");
        func();
    }

    private static void makeStiker() {
        Scanner sc = new Scanner(System.in);
        int[][] arr2;

    }

    private static void makeStar() {
        //Scanner sc = new Scanner(System.in);
        //int input = sc.nextInt();
        int input = 155;
        //입력 하세요
//        String result = "";

        for (int i = 1; i < input; i++){
            for(int j = input - 1; j > 0; j--){
                if (i < j) {
                    System.out.print(" ");

                } else {
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
    }
}
