package Theme4;

public abstract class Publication {
    protected String title;

    public Publication(){
        this.title = "Заголовок по умолчанию";
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getTitle(){
        return title;
    }

    abstract public void render();
}
