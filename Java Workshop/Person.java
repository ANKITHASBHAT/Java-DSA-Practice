public class Person {
    // Private fields (attributes)
    private String name;
    private int age;

    // Constructor to initialize fields
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter method for name
    public String getName() {
        return name;
    }

    // Setter method for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for age
    public int getAge() {
        return age;
    }

    // Setter method for age with validation
    public void setAge(int age) {
        if (age > 0) { // Ensuring age is positive
            this.age = age;
        } else {
            System.out.println("Age must be positive");
        }
    }
    public static void main(String[] args) {
        Person person = new Person("John", 30);
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        person.setAge(-2); // Negative age
        person.setAge(2); // Positive age
        System.out.println("Age: " + person.getAge());
    }
}
