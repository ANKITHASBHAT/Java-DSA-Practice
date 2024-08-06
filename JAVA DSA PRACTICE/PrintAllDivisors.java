/* public class PrintAllDivisors {
    static int[] printDiv(int n, int[] size){
        int[] divisors = new int[n];
        int count =0;
        for(int i =1; i<= n; i++){
            if(n%i ==0){
                divisors[count++]=i;
            }
        }
        size[0] = count;
        return divisors;
    }
    public static void main(String[] args) {
        int n = 36;
        int size[] = new int[1];
        int divisors[] = printDiv(n, size);
        System.out.print("Divisors are: ");
        for(int i = 0 ; i< size[0]; i++){
            System.out.print(" "+ divisors[i]);
        }   
        System.out.println();
     }
} */

import java.util.ArrayList;
import java.lang.Math.*;
import java.lang.reflect.Array;
public class PrintAllDivisors {
    public static  ArrayList<Integer> findDiv(int n){
        ArrayList<Integer> divisors = new ArrayList<Integer>(); 
        int sqrt = (int) Math.sqrt(n);
        for(int i = 1; i<sqrt; i++){
            if(n%i ==0){
                divisors.add(i);
                if(i!=n/i){
                    divisors.add(n/i);
                }
            }
        }
        return divisors;
    }
    public static void main(String[] args) {
      int n = 36;
       ArrayList<Integer> divisors = findDiv(n);
       System.out.println("The Divisors are : ");
       for(int divisor: divisors){
        System.out.print(" "+ divisor);
      
    }
    System.out.println();
}
}