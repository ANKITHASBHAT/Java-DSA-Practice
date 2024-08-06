
public class Circle {

     public double area(double radius){
            return Math.PI * radius*radius;
     }
     public double perimeter(double radius){
        return 2*Math.PI * radius;
     }
     public double circumference(double radius){
            return perimeter(radius);
     }

     public static void main(String[] args){
            Circle circle = new Circle();
            System.out.println(circle.area(5.0));
            System.out.println(circle.perimeter(5.0));
            System.out.println(circle.circumference(5.0));

     }
     }