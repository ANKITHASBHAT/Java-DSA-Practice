public class solution{
    public static void main(String args[]){
        int arr[] = {5,7,3,4,8,9};
        mergesort.mergeSort(arr,0,arr.length-1);
        System.out.println("Array after sorting:");
        for (int i = 0;i < arr.length;i++){
            System.out.println(arr[i]+" ");
        }
    }
}
