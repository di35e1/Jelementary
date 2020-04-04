package Theme4;

public class Cat extends Beast {
    protected String color;
    protected int age;

    public Cat(String name, String color, int age, int pawsNumber){
        this.name = name;
        this.color = color;
        this.age = age;
        this.pawsNumber = pawsNumber;

        }

    public String getCatName(){
        return this.name;
    }

    public void CatInfo() {
        System.out.println("Name: " + name + " Color: " + color);
    }

}
