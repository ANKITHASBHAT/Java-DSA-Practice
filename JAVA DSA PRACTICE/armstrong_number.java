public class armstrong_number {
    public static void armstrong(int value){
        int num = value;
        int count =String.valueOf(num).length();
        int sum = 0;
        while(num >0){
            int digit = num % 10;
            sum += Math.pow(digit,count);
            num = num/10;
        }
        if (value == sum){
            System.out.println("the number is armstrong");
        }
        else {
            System.out.println("the number is not an armstrong number");
        }
}
    public static void main(String[] args) {
        int value = 153;
        armstrong(value);
    }
}
