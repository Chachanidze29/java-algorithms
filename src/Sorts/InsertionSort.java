package Sorts;

public class InsertionSort {
    public static void insertionSort(Integer[] arr,Integer N){
        for(int i=0;i<N;i++){
            Integer key = arr[i];
            int j=i-1;
            while(j >=0 && arr[j]>key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }
}
