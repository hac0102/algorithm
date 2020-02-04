public class Al04RecursionFactorialCode01 {
    public static void main(String[] args){
     //0! = 1
     //n! = nx(n-1! n>0
     // n! 팩토리럴

     int result = factorial(1);

        System.out.println("result ::" + result);


    }

    private static int factorial(int i) {
        if(i == 0){
            return 1;
        }else{
            return i * factorial(i - 1);
        }
    }
}

// factorial(int i)는 음이 아닌 정수 n에 대해서 n!을 올바르게 계산하다
//증명
//1. n = 0 인 경우 1을 반환
//2. 임의의 양의 정수 k에 대해서 n < k인경우 n!을 올바르게 계산하다고 가정하자.
//3. n = k인 경우를 고려해보자. factorial은 먼저 factorial(k-1) 호출하는데 2번의 가정에 의해서
//   (k - 1)!이 올바르게 계산되어 ㅏㅂㄴ . 따라서 메서드 factorial는 k * (k - 1)! = k!를 반환