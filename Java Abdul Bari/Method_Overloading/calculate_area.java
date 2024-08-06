import java.lang.Math;


//Overloading functions
class calculate_area {
     static double area(double a, double b){
        return a*b;
    }
     static double area(double radius){
        return Math.PI*radius*radius;
     }

    public static void main(String[] args){
        double rectangle = area(3,4);
        double circle = area(7.5);
        System.out.println("Area of Rectangle : " + rectangle);
        System.out.println("Area of Circle: " + circle);
    }
}