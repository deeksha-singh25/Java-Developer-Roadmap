class Cat extends Animal implements Playable{
    public Cat(String name) {
        super(name);
    }
    public void animalSound(){
        System.out.println(name+"Meow: Meow Meow!");
    }
    public void play(){
        System.out.println(name+"..is playing ball");
    }

}
