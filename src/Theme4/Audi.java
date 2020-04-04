package Theme4;

public class Audi implements CarTemplate {
    protected String name = "Audi";

    public int getId(){
        return 198;
    }

    public String getName(){
        return "Audi";
    }

    public void move() {
        System.out.println(this.name + " is moving");
    }
}
