public class selectionsort {
    static void selectionsort(int arr[], int n){
        for(int i = 0; i < n - 1; i++){
            int min = i;
            for(int j = i + 1; j < n; j++){
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            if(min != i){
                int temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }
        }
        System.out.println("Array after sorting:");
        for(int i = 0; i < n; i++){
            System.out.print(" " + arr[i]);
        }
        System.out.println();
    }

    public static void main(String[] args){
        int arr[] = {23, 67, 54, 34, 89};
        int n = arr.length;
        selectionsort(arr, n);
    }
}
