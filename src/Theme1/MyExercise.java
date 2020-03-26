package Theme1;

public class MyExercise {

    // Задача 1.
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // Задача 2. Создать переменные всех пройденных типов
        byte b8 = 88;
        short s16 = 1616;
        int i32 = 3232;
        long l64 = 6464L;
        float f32 = 32.32f;
        double d64 = 64.6464;
        char ch = 'V';

        // Поверка нижеследующих задач
        System.out.println(abcdSum(5,4,5,9));
        System.out.println(checkRange(7,8));
        checkSign(7);
        System.out.println(checkNegative(-7));
        printHello("Владимир Владимирович");
        wtfYear(2021);
        wtfYear(2020);

    }

    // Задача 3. Написать метод, вычисляющий выражение a * (b + (c / d))
    static double abcdSum(double a, double b, double c, double d) {
        return a * (b + (c/d));
    }

    // Задача 4. Написать метод, проверяющий что сумма чисел лежит в пределах от 10 до 20
    static boolean checkRange(int x, int y) {
        boolean result = false;
        if (((x+y) >= 10) && ((x+y) <=20)) {
            result = true;
        }
        return result;
    }

    // Задача 5. Написать метод, которой должен напечатать положительное число или отрицательное
    static void checkSign(int x) {
        String positive = "Число положительное";
        String negative = "Число отрицательное";
        String result = (x < 0) ? negative : positive;
        System.out.println(result);
    }

    // Задача 6. Метод должен вернуть true, если число отрицательное
    static boolean checkNegative(int x) {
        return x < 0;
    }

    // Задача 7. Метод должен вывести в консоль сообщение «Привет, указанное_имя!»;
    static void printHello(String name) {
        System.out.println("Привет, " + name + "!");
    }

    // Задача 8. Написать метод, который определяет, является ли год високосным,
    // и выводит сообщение в консоль.
    static void wtfYear(int year) {
        if (((year % 4 == 0) && !(year % 100 == 0 )) || (year % 400 == 0)) {
            System.out.println("Этот " + year + " год высокосный!");
        }
        else{
            System.out.println("Этот " + year + " год не высокосный!");
        }
        }
}
