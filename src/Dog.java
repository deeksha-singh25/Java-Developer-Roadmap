class Dog extends Animal implements Playable {
    public Dog(String name) {
        super(name);
    }
    public void animalSound() {
        System.out.println(name+"barks: Woof Woof!");
    }
    public void play() {
        System.out.println(name + " ...is playing fetch!");
    }
}