public class car1 {
    String color;
    String model;
    static car1 myCar = new car1();

    public static void main(String[] args) {
        myCar.color = "red";
        myCar.model = "Mustang";
        System.out.println("The color of my car is: " +myCar.color);
        System.out.println("Model of my car is: " + myCar.model);
    }
}