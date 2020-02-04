public class Al11RecursionArraySumCode01 {
    public static void main(String[] args){
        //data[0]에서 data[n - 1]까지의 합을 구하여라
        int[] data = {1, 2, 3, 4, 5};

        System.out.println("합 :: " + sum(2, data));

    }

    private static int sum(int n, int[] data) {
        if(n <= 0){
            return 0;
        }else{
            return sum(n - 1, data) + data[n - 1];
        }
    }
}


//모든 순환 함수는 반복문으로 변경 가능
// 그 역도 성립함. 즉 모든 반복문은 recursion으로 표현 가능
// 순환함수는 복잡한 알고리즘을 단순하고 알기쉽게 표현하는 것을 가능하게함
// 하지만 함수 호출에 따른 오버헤드가 있음 매개변수전달, 액티베이션 프레임 생성 등