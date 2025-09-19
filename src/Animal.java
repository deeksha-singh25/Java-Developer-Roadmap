import java.util.ArrayList;
public abstract class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void animalSound();

    public void sleep() {
        System.out.println(name+"is sleeping ");
    }


    public static void main(String[] args) {
        ArrayList<Playable> pets = new ArrayList<>();
        pets.add(new Dog("Buddy"));
        pets.add(new Cat("Whiskers"));

        for (Playable pet : pets) {
            // Cast to Animal to also use sound() + sleep()
            Animal animal = (Animal) pet;
            animal.animalSound();
            animal.sleep();

            // Interface method
            pet.play();

            System.out.println("----------------");
        }
    }

}
