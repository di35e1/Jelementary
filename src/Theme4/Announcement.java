package Theme4;

public class Announcement extends Publication {

    public Announcement(String title){
        this.title = title;
    }

    @Override
    public void render() {
        cutText();
        System.out.println("Вывод на экран анонса");
    }

    private String cutText(){
        return this.title;
    }
}
