package Sorts;

public class SelectionSort {
    public static void selectionSort(Integer[] arr,Integer N){
        for(int i=0;i<N;i++) {
            int min_index = i;
            for(int j=i+1;j<N;j++) {
                if(arr[j]<arr[min_index]){
                    min_index = j;
                }
            }
            Integer helper = arr[min_index];
            arr[min_index] = arr[i];
            arr[i] = helper;
        }
    }
}
