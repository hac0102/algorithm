public class Al14RecursionBinarySearch {
    public static void main(String[] args){
        //이진 탐색
        String[] arr = {"나", "다", "가", "라", "마"};

        binarySearch(arr, "가", 0, 5);

    }

    private static int binarySearch(String[] arr, String target,
                                     int begin, int end) {
//        if(begin > end){
//            return; -1;
//        }else{
//            int middle = (begin + end) / 2;
//            int compResult = target.compareTo(arr[middle]);
//
//            if(compResult == 0){
//
//            }
//        }
        return 1;
    }
}
