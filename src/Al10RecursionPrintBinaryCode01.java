public class Al10RecursionPrintBinaryCode01 {
    public static void main(String[] args){
        //음이 아닌 정수 n을 이진수로 변환
        printlnBinary(15);
    }

    private static void printlnBinary(int i) {
        if(i < 2){
            System.out.print(i);
        }else{
            printlnBinary(i / 2);   //n을 2로 나눈 몫을 먼져 2진수로 변환
            System.out.print(i % 2);  //  n을 2로 나눈 나머지 출력
        }
    }
}
