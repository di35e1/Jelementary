package Task5;

// 5. Класс животное
public class Animal {
    public String name;
    double runLimit;
    double swimLimit;
    double jumpLimit;

    public Animal(){}

    // 7 (9) Ограничения задаются в конструкторе для каждого экземпляра животного
    public Animal(String name, double runLimit, double swimLimit, double jumpLimit) {
        this.name = name;
        this.runLimit = runLimit;
        this.swimLimit = swimLimit;
        this.jumpLimit = jumpLimit;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // 6. Дейстия - run, swim и jump
    public void run(double limit) {
        String result;

        if(runLimit <= 0){
            result = this.name + " не умеет бегать :(";
        }
        else if(limit <= runLimit){
            result = this.name + " пробежал " + limit + "м. !";
        }
        else{
            result = this.name + " столько не пробежит...";
        }

        System.out.println(result);
    }

    public void swim(double limit) {
        String result;

        if(swimLimit <= 0){
            result = this.name + " не умеет плавать :(";
        }
        else if(limit <= swimLimit){
            result = this.name + " проплыл " + limit + "м. !";
        }
        else{
            result = this.name + " столько не проплывет...";
        }

        System.out.println(result);
    }

    public void jump(double limit) {
        String result;

        if(jumpLimit <= 0){
            result = this.name + " не умеет прыгать :(";
        }
        else if(limit <= jumpLimit){
            result = this.name + " прогнул на " + limit + "м. !";
        }
        else{
            result = this.name + " так не сможет...";
        }

        System.out.println(result);
    }
}
