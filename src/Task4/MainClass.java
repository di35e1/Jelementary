package Task4;

public class MainClass {
    public static void main(String[] args) {

        Cat cat0 = new Cat("Кот Дефолт");
        Cat cat1 = new Cat("Барсик", 200, 0, 2);
        Cat cat2 = new Cat("Мотя", 100, 0, 1.5);

        Cat dog0 = new Cat("Собака");
        Dog dog1 = new Dog("Шарик", 600, 9, 0.9);
        Dog dog2 = new Dog("Тузик", 400, 11, 0.1);

        dog1.run(500);
        dog2.run(500);
        dog1.swim(9);

        cat1.swim(5);
        cat1.jump(1.7);
        cat2.jump(1.7);

    }
}
