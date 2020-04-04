package Theme4;

public class MainClass {
    public static void main(String[] args) {

        Animal animal = new Animal("Animal") {
            @Override
            public void voice() {

            }
        };

        Cat cat = new Cat("Barsik", "White", 4, 4);

        Birds bird = new Birds("Popka");

        animal.AnimalInfo();
        cat.AnimalInfo();
        cat.CatInfo();
        bird.fly();

    }
}
