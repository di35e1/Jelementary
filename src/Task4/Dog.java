package Task4;

public class Dog extends Animal {

    public Dog(String name){
        this.name = name;
        this.runLimit = 500;
        this.swimLimit = 10;
        this.jumpLimit = 0.5;
    }

    public Dog(String name, double runLimit, double swimLimit, double jumpLimit) {
        super(name, runLimit, swimLimit, jumpLimit);
    }
}
