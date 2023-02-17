import java.util.*;
//desending bubble sort
public class DescendingSorting{
    public static void bubbleSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0; j<arr.length-1-i;j++){
                if(arr[j]<arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void printArr(int arr[]){
        for (int i=0;i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    //descending  selecion sorting 

    public static void selectionSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int minPos=i;
            for(int j=i+1; j<arr.length;j++){
                if(arr[minPos]<arr[j]){
                    minPos = j;
                }
            }
            //swap
            int temp= arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }
   
    public static void main(String args[]){
        int arr[] = {5,1,6,4,3,2,7};
       selectionSort(arr);
        printArr(arr);
    }
}