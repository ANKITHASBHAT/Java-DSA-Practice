public class Rectangle {
    public static double area(double length, double width){
        return length * width;
    }
    public static double perimeter(double length, double width){
        return 2*(length + width);
    }
    public static boolean isSquare(double length, double width){
        if(length == width){
            return true;
        }
        return false;
    }

    public static void main(String[] args){
        System.out.println("Area:" + area(3,4));
        System.out.println("perimeter:" + perimeter(3,4));
        System.out.println("IS the Rectangle square?" + isSquare(4,4));
    }
}