package Sorts;

public class BubbleSort {
    public static void bubbleSort(Integer[] arr,Integer N){
        for(int i=0;i<N;i++) {
            if(!sweep(arr,N,i)) break;
        }
    }

    public static Boolean sweep(Integer[] arr,Integer N, Integer prevPasses){
        Integer firstIndex = 0;
        Integer secondIndex = 1;
        Boolean didSwap = false;
        while(secondIndex < N-prevPasses){
            Integer firstNum = arr[firstIndex];
            Integer secondNum = arr[secondIndex];
            if(firstNum > secondNum){
                arr[firstIndex] = secondNum;
                arr[secondIndex] = firstNum;
                didSwap = true;
            }
            firstIndex++;
            secondIndex++;
        }
        return didSwap;
    }
}
