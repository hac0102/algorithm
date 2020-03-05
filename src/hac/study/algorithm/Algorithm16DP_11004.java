package hac.study.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Algorithm16DP_11004 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] firstLine = br.readLine().split(" ");
        int n = Integer.parseInt(firstLine[0]);
        int findIdx = Integer.parseInt(firstLine[1]);
        String[] secLine = br.readLine().split(" ");
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(secLine[i]);
        }

        //배열, lowIdx 0,  highIdx arr.length -1, 찾으려는 배열 Index
        quickSort(arr, 0, arr.length - 1);

        System.out.println(arr[findIdx - 1]);
    }

    private static void quickSort(int[] arr, int low, int high) {
        if (low >= high) {
            return;
        }

        int mid = partition(arr, low, high);
        quickSort(arr, low, mid - 1);   //pivot 기준으로 작은값들 재귀함수
        quickSort(arr, mid, high);            //pivot 기준으로 큰값들 ㅈ귀함수


    }

    private static int partition(int[] arr, int low, int high) {
        // 4 3 2 1 5 -> 2
        //

        int pivot = arr[(low + high) / 2];
        while (low <= high) {
            while (arr[low] < pivot) low++;
            while (arr[high] > pivot) high--;
            if(low <= high) {
                swap(arr, low, high);
                low++;
                high--;
            }
        }
        return low;
    }

    private static void swap(int[] arr, int low, int high) {
        int tmp = arr[low];
        arr[low] = arr[high];
        arr[high] = tmp;
    }
}