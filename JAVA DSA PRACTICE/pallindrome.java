public class pallindrome {
    public static void Pallindrome(int n){
        int num = n;
        int reverse =0;
        while(n!=0){
            int digit = n%10;
            reverse = reverse * 10 + digit;
            n = n/10;
        }
        if(num == reverse){
            System.out.println( "The number is a pallindrome");
        }
        else {
            System.out.println( "The number is not a pallindrome");
        }

    }
    public static void main(String args[]){
        int n = 121;
        Pallindrome(n);
        int n1 = 123;
        Pallindrome(n1);
    }
}