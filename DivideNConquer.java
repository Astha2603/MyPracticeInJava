public class DivideNConquer {

  //MERGE SORT
    public static void printArr(int arr[]) {
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }
    public static void mergeSort(int arr[],int si,int ei) {
    if(si>=ei){
        return;
        
    }
    //kaam
    int mid = si + (ei-si)/2;  //(si+ei)/2
    mergeSort(arr, si, mid);  //left part
    mergeSort(arr, mid+1, ei);  //right part
    merge(arr,si,mid,ei);
}

public static void merge(int arr[], int si,int mid, int ei) {
  int temp[] = new int [ei-si+1];
  int i=si; //iterator for left part
  int j= mid+1; //iterator for right part
  int k=0;  //iterator for temp array

  while(i<=mid && j<=ei){
    if(arr[i] < arr[j]){
        temp[k] =arr[i];
        i++;
    }
    else{
    temp[k] = arr[j];
    j++;
    }
    k++;
  }
  while(i<=mid){
    temp[k++] = arr[i++];       //left part mein jo bacha kucha ho wo
  }
  while(j<=ei){
    temp[k++] = arr[j++];
  }
  //copy temp arr to original arr
  for(k=0, i=si; k < temp.length; k++, i++){
    arr[i] = temp[k];
  }
}    
public static void main(String[] args) {
    int arr[] = {6,3,4,8,1,9};
    mergeSort(arr, 0,arr.length-1);
    printArr(arr);
}

}