

//Overloading functions
class calculate_area2 {
     static double area(double a, double b){
        return a*b;
    }

    public static void main(String[] args){
        double rectangle = area(3,4);
        System.out.println("Area of Rectangle : " + rectangle);
}
}
