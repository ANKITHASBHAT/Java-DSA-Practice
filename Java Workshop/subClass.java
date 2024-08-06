class subClass extends superClass {
    @Override
    void method_name(){
        System.out.println("This is Sub class");
    }
    public static void main(String[] args) {
        subClass obj = new subClass();
        obj.method_name();
        superClass obj1 = new superClass();
        obj1.method_name();
    }
    
}