package Task5;

public class Cat extends Animal {

    private int appetite; // аппетит
    boolean fullness = false; // насыщенность

    public Cat(String name){
        this.name = name;
        this.runLimit = 200;
        this.swimLimit = 0;
        this.jumpLimit = 2;
        this.appetite = 3; // аппетит у дефолтного кота - 3
    }

    public Cat(String name, int appetite){
        this.name = name;
        this.runLimit = 200;
        this.swimLimit = 0;
        this.jumpLimit = 2;
        this.appetite = appetite;
    }

    public Cat(String name, double runLimit, double swimLimit, double jumpLimit) {
        super(name, runLimit, swimLimit, jumpLimit);
        this.appetite = 3; // аппетит у дефолтного кота - 3
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public int getAppetite() {
        return appetite;
    }

    // метод "пожрать"
    public void eating(Bowl bowl){

        int quantity = bowl.getFoodQuantity();  // узнать сколько в миске еды

        while(quantity == 0){ // пока в миске ноль еды, котик будет выносить мозг
            System.out.println("Котик " + this.name + " говорит, - мяяууу? В миске нет еды!");
            bowl.fillUp();
            quantity = bowl.getFoodQuantity();
        }

        while(quantity < appetite){ // пока в миске еды меньше чем хочет котик, котик буде выносить мозг
            System.out.println("Котик " + this.name + " говорит, что в миске не хватает еды для него :(");
            bowl.fillUp();
            quantity = bowl.getFoodQuantity();
        }

        // когда котику еды хватает, он кушает и уходит :)
        bowl.setFoodQuantity(quantity - appetite);
        this.fullness = true;
        System.out.println("Котик " + this.name + " наелся!");
    }
}
