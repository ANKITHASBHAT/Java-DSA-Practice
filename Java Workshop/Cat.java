class Cat extends Animals {
    @Override
    void makeSound(){
        System.out.println("Meow");
    }
    public static void main(String[] args){
        Animals myAnimals = new Cat();
        myAnimals.makeSound();
        Animals myAnimals2 = new Animals();
        myAnimals2.makeSound();
    }
}