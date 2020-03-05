package hac.study.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Algorithm16DP_11004_4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int findArr = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }


        quickSort(arr, 0, arr.length - 1);
        System.out.println(arr[findArr - 1]);


    }

    private static void quickSort(int[] arr, int low, int high) {
        if(low >= high){
            return;
        }

        int mid = partition(arr, low, high);

        quickSort(arr, low, mid - 1);
        quickSort(arr, mid, high);
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[(low + high) / 2];

        while(low <= high){
            while(arr[low] < pivot) low++;
            while(arr[high] > pivot) high--;

            if(low <= high){
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
