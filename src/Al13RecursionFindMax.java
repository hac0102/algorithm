public class Al13RecursionFindMax {
    //최대값
    public static void main(String[] args){
        int[] arr = {1, 5, 2, 3, 4};
        findMax(arr, 0, 5);

        //중간값 나눠서 찾기
        findMaxMiddle(arr, 0, 5);
    }

    private static int findMaxMiddle(int[] arr, int begin, int end) {
        if(begin == end){
            return arr[begin];
        }else{
            int middle = (begin + end) / 2;

            int max1 = findMaxMiddle(arr, begin, middle);
            int max2 = findMaxMiddle(arr, middle + 1, end);
            return Math.max(max1, max2);

        }

    }

    private static int findMax(int[] arr, int begin, int end) {
        if(begin == end){
            return arr[begin];
        }else{
            return Math.max(arr[begin], findMax(arr, begin + 1, end));
        }
    }
}
