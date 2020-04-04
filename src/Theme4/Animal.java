package Theme4;

public abstract class Animal {
    protected String name;

    public abstract void voice();

    public void jump(){
        System.out.println("Животное подпрыгнуло");
    }

    public Animal(){
    }

    public Animal(String name){
        this.name = name;
    }

    public void AnimalInfo(){
        System.out.println("Animal: " + name);
    }
}
