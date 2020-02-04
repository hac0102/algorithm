public class Al03RecursionCode03 {
    public static void main(String[] args){
        int result = func(4);
        System.out.println("result ::" + result);
    }

    private static int func(int i) {
        if (i == 0){
            return 0;
        }else{
            return i + func(i-1);
        }
    }
}
// 순환함수와 수학적귀납법
// func(int n) 은 음이 아닌 정수 n에 대해서 0에서 n까지의 합을 올바로 계산
// 증명
//  1. n=0d인 경우 0을 반환
//  2. 임의의 양의 정수 k에 대해서 n<k 인 경우 0에서 n까지의 합을 올바르게 계산하여 반환한다고 가정
//  3. n = k 인 경우를 고려해보자. func는 먼저 func(k-1) 호출하는데 2번의 가정에 의해서 0에서 k-1까지의 합이 올바르게 계산되어 반환
//     메서드 func는 그 값에 n을 더해서 반환. 따라서 메서드 func는 0에서 k까지의 합을 올바르게 계산하여 반환