public abstract class Animal {
    public abstract void animalSound();

    public void sleep() {
        System.out.println("Animal is sleeping Zzzz");
    }


    public static void main(String[] args) {
        Animal myObj1 = new Dog();
        Animal myObj2 = new Cat();
        myObj1.animalSound();
        myObj1.sleep();
        myObj2.animalSound();
        myObj2.sleep();
        System.out.println();
    }

}