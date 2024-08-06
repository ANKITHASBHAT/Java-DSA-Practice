
public class sumofN{
    static int sumN(int n){
        int sum = 0;
        for(int i = 0; i<=n; i++){
            sum += i;
         }
          return sum;
        }
public static void main(String[] args) {
    int n = 9;
    int result = sumN(n);
    System.out.println("Sum is: " + result);

}
    }
