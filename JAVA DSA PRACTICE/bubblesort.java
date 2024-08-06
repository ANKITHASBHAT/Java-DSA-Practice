
public class bubblesort {
    public static void bubblesort(int[] arr, int n){
        for(int i = n-1;i>=0;i--){
            for(int j = 0 ; j<=i-1;j++){
                if(arr[j+1]>arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]= temp;
                }
            }
        }
        System.out.println("After Bubble Sort:");
        for(int i =n-1 ; i>=0;i--){
            System.out.println(" "+arr[i]);
        }
        System.out.println();
    }

    public static void main(String args[]){
        int arr[] = {6,42,24,56,34, 65};
        int n = arr.length;
        bubblesort(arr,n);

    }
 }