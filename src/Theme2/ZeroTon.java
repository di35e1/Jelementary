package Theme2;
import java.util.Scanner;

public class ZeroTon {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
            System.out.print("Введите ограничение: ");
            int limit = userInput.nextInt();
        userInput.close();

        int counter = 0;
        System.out.println("Список четных чисел из заданного промежутка");
        while (counter <= limit) {
            if (counter % 2 == 0) {
                System.out.println(counter);
            }

            counter++;
        }

        for (int i=1; i <= limit; i++) {
            System.out.print(" i = " + i);
        }
        System.out.print(" end");

        forExample(3);
        forEach(new String[]{"a", "b", "c"});

    }

    static void forExample(int count){
        for (int i=1; i <= count; i++) {
            System.out.print(" i = " + i);
        }
        System.out.println(" end");
    }

    static void forEach(String[] list){
        for (String el : list) {
            System.out.print(el + " ");
        }
    }
}
