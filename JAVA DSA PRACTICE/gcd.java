/* public class gcd {
    public static int findgcd(int n1, int n2) {
       int gcd =1;
       for (int i =1; i<= Math.min(n1,n2); i++) {
        if(n1%i==0 && n2%i==0){
            gcd = i;
        }
 }
 return gcd;
    }
    public static void main(String[] args) {
        int n1 = 9;
        int n2 = 15;
        int gcd = findgcd(n1,n2);

        System.out.println("The gcd is " + gcd);
    } 
} */
// time complexity -> O(n) = O(min(n1,n2))
/* public class gcd {
    public static int findgcd(int n1, int n2) {
        for (int i = Math.min(n1,n2); i>=1;i--){
            if(n1%i==0 && n2%i==0){
                return i;
}
}
return 1;
}
public static void main(String[] args) {
    int n1 = 9,n2 = 15;
    int gcd = findgcd(n1, n2);
    System.out.println("GCD is:" +gcd);
}
} */
public class gcd {
    public static int findgcd(int n1, int n2) { 
        while(n1>0 && n2>0){
            if(n1>n2){
                n1= n1%n2;
            }
            else{
                n2 = n2 %n1;
            }
        }
        if(n1 == 0){
            return n2;
        }
        return n1;
    }
    public static void main(String[] args) {
        int n1 = 9, n2= 15;
        int gcd = findgcd(n1, n2);
         
        System.out.println("GCD is : " +gcd);
    }
}