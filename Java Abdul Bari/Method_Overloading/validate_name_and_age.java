public class validate_name_and_age {
    boolean validate(String name){
        return name.matches("[a-zA-Z\\s]+");
    }
    boolean validate(int age){
        return age>0 && age<16;
    }

    public static void main(String[] args){
        validate_name_and_age obj = new validate_name_and_age();
        System.out.println(obj.validate("John"));
        System.out.println(obj.validate(15));
    }
}