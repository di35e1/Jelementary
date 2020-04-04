package Theme4;

public class PublicationsExample {
    public static void main(String[] args) {
        Publication[] publications = new Publication[2];

        publications[0] = new News("Новость");
        publications[1] = new Announcement("Анонс");

        for(Publication pub: publications){
            pub.render();
        }
    }
}
