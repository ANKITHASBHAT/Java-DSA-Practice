public class constructors {
     private int length;
     private int breadth;

     public constructors(){
            length = 1;
            breadth = 1;
     }

     public constructors(int l, int b){
        length = l;
        breadth = b;
     }

     public static void main(String[] args){
        System.out.println(constructors.constructor1(5, 10));
     }
}