package Theme4;

public class News extends Publication {

    public News(String title){
        this.title = title;
    }

    @Override
    public void render() {
        System.out.println("Вывод на экран новости");
    }
}
