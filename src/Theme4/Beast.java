package Theme4;

public class Beast extends Animal {
    protected int pawsNumber;

    @Override
    public void voice() {

    }

    public Beast(){
        this.name = "untitled";
        this.pawsNumber = 4;
    }

    public Beast(String name, int pawsNumber) {
        this.name = name;
        this.pawsNumber = pawsNumber;
    }

    public void BeastInfo(){
        System.out.println("Beast " + name + "with" + pawsNumber + "paws");
    }
}
