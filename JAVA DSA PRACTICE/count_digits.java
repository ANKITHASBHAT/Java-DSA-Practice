public class count_digits {
    static int count(int n){
        int x =n;
        int count = 0;
        while(x!=0){
            x = x/10;
            count++;
        }return count;
    }
    public static void main(String[] args) {
        int n = 12345;
        System.out.println(count(n));
    }
}