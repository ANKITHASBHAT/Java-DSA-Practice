
public class insertionsort {
    public static void insertionsort(int arr[], int n){
        for(int i = 0; i<=n-1; i++){
            int j =i;
            while(j>0 && arr[j-1]>arr[j]){
                int temp = arr[j-1];
                arr[j-1]= arr[j];
                arr[j]= temp;
                j--;
            }
        }
        System.out.println("Array after sorting:");
        for(int i=0;i<n;i++){
            System.out.println(" "+arr[i]);
        }
    }
    public static void main(String[] args){
        int arr[]={45,65,34,23,56,78};
        int n = arr.length;
        insertionsort(arr,n);
    }
}
