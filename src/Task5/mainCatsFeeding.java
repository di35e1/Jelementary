package Task5;

public class mainCatsFeeding {

    public static void main(String[] args) {

        Bowl bowl = new Bowl(15); // пустая миска, вместительностью 15 еды
        Cat[] arrayOfCats = new Cat[10];

        // 10 голодных котиков
        arrayOfCats[0] = new Cat("Барсик");
        arrayOfCats[1] = new Cat("Мурзик",4);
        arrayOfCats[2] = new Cat("Крестик", 7);
        arrayOfCats[3] = new Cat("Нолик", 1);
        arrayOfCats[4] = new Cat("Пушок");
        arrayOfCats[5] = new Cat("Лысик", 2);
        arrayOfCats[6] = new Cat("Ушастик");
        arrayOfCats[7] = new Cat("Хвостастик", 1);
        arrayOfCats[8] = new Cat("Бегемот");
        arrayOfCats[9] = new Cat("Кот в сапогах", 5);

        for(Cat kitty : arrayOfCats) {
            kitty.eating(bowl);
            System.out.println();
        }

        System.out.println("Уффф.. Все котики наелись.");
    }
}
