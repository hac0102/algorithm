public class Al12RecursionDesignSearch {
    public static void main(String[] args) {
        //적어도 하나의 base case -> 순환하지 않고 종료되는 case 필요
        //모든 case는 결국 base case로 수렴해야 함

        // 암시적(implicit) 매개변수를 명시적(explicit) 매개변수로 바꿔라
        // 순차 탐색
        // data[0] 에서 data[n-1]사이에서 타겟을 검색
        // 검색 구간의 시작 인덱스 0은 보통 생략한다. 즉 암시적 매개변수이다.
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("위치 :: " + search(arr, 5, 3));

        //recursion으로 순차탐색, 시작점위치 증가
        recursionSearch1(arr,0, 5, 4);

        // 끝에서부터 검색
        recursionSearch2(arr, 0, 5, 4);

        //중간값에서부터
        recursionSearch3(arr, 0, 5, 4);
    }

    //중간에서부터
    private static int recursionSearch3(int[] arr, int begin, int end, int target) {
        if(begin > end){
            return -1;
        }else{
            int middle = (begin + end) / 2;

            //중간값에서 찾으면
            if(target == arr[middle]){
                return middle;
            }

            //중간값에서 못찾으면 끝위치값 middle - 1 값에서 찾음
            int index = recursionSearch3(arr, begin, middle-1, target);

            if(index != -1){
                return index;
            }else{
                // 인덱스값이 -1 이면 시작위치값을 middle + 1 해서 찾음
                return recursionSearch3(arr, middle + 1, end, target);
            }
        }
    }

    // 끝에서부터
    private static int recursionSearch2(int[] arr, int begin, int end, int target) {
        if(end < begin){
            return -1;
        }else if(target == arr[end]){
            return end;
        }else {
            return recursionSearch2(arr, begin, end - 1, target);
        }
    }



    //시작위치부터, 끝위치를 명시적으로 지정가능
    private static int recursionSearch1(int[] arr, int begin, int end, int target) {
        if(begin > end){
            return -1;
        }else if (target == arr[begin]) {
            return begin;
        }else{
            return recursionSearch1(arr, begin + 1, end, target);
        }
    }

    //for문으로, 시작위치를 0으로 고정 암시적
    private static int search(int[] arr, int n, int target) {
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }


}


