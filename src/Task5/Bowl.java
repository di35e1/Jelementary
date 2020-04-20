package Task5;

import java.util.Scanner;

public class Bowl {

    private int volume;
    private int foodQuantity = 0;

    public Bowl(int vol) {
        this.volume = vol;
    }

    public Bowl(int vol, int quantity) {
        this.volume = vol;
        this.foodQuantity = quantity;
    }

    // установить количество еды в миске
    public void setFoodQuantity(int quantity) {
        if(volume > quantity){
            this.foodQuantity = quantity;
        }
        else{
            System.out.println("Столько еды не поместится в эту миску!");
        }
    }

    // положить еды в миску, интерактивный метод
    public void fillUp() {
        Scanner bowlUp = new Scanner((System.in));
        System.out.println("Сколько добавить еды?");
        while(true) {
            int food = bowlUp.nextInt();
            if (volume < foodQuantity + food) {
                System.out.println("В миску влезет еще не более " + (volume - foodQuantity) + " еды");
            }
            else{
                foodQuantity += food;
                System.out.println("В миске теперь " +foodQuantity + " еды");
                break;
            }
        }
    }

    // узнать количество еды в миске
    public int getFoodQuantity() {
        return foodQuantity;
    }
}
