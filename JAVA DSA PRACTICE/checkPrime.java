public  class checkPrime{
    static boolean isPrime(int n){
        int count = 0;
    for (int i = 1; i <= Math.sqrt(n); i++){
        if(n%i == 0) {
            count++;
            if(i!=n/i){
                count = count+1;
            }
        }
    }
        if(count==2){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        int n = 1483;
        boolean prim = isPrime(n);
        if(prim){
            System.out.println("The number is prime!");
    }
    else{
        System.out.println("The number is not prime!");
    }
  }
}