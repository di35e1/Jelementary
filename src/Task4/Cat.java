package Task4;

public class Cat extends Animal {

    public Cat(String name){
        this.name = name;
        this.runLimit = 200;
        this.swimLimit = 0;
        this.jumpLimit = 2;
    }

    public Cat(String name, double runLimit, double swimLimit, double jumpLimit) {
        super(name, runLimit, swimLimit, jumpLimit);
    }
}
