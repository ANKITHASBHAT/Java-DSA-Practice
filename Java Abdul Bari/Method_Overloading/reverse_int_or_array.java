public class reverse_int_or_array {
    static int reverse(int n){
        int num = n;
        int rev = 0;
        while(num!=0){
        int remainder = num % 10;
        rev = rev * 10 + remainder;
        num = num/10;
       
    }
    return rev;
    }

    static int[] reverse(int[] a){
        int b[] = new int[a.length];
        for(int i = a.length -1, j= 0; i>=0; i--,j++){
            b[j] = a[i];       
        }
            return b;
    }
    public static void main(String[] args){
        int s[] = {1,2,3,4,5,6,7,8};
        s = reverse_int_or_array.reverse(s);
        for(int i=0; i<s.length; i++){
            System.out.println(s[i]); }
        int n  = 345;
        int result = reverse(n);
        System.out.println(result);

        }
    }