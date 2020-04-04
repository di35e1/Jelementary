package Theme4;

public class Birds extends Animal {

    @Override
    public void voice() {

    }

    private boolean canFly = true;


    public Birds(String name){
        this.name = name;
    }

    public void fly(){
        System.out.println(this.name + " is flying");
    }
}
