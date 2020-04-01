package Theme2;

public class theme2Exercise {
    public static void main(String[] args) {

        // Задачача 1
        byte[] bm = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        taskOne(bm);
        System.out.println("\n");

        // Задачача 2
        taskTwo();
        System.out.println("\n");

        // Задачача 3
        taskThree();
        System.out.println("\n");

        // Задачача 4
        taskFour();
        System.out.println();

        // Задачача 5
        taskFive();
        System.out.println();

        // Задачача 5
        int[] balance = {1, 1, 1, 2, 1};
        System.out.println(taskSix(balance));
        System.out.println();

        // Задачача 6
        int[] cats = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        taskSeven(cats,5 ); // Смещение на +5 (вправо)
        System.out.println();
        taskSeven(cats,-2 ); // Смещение на -2 (влево)
        System.out.println();

    }

    // Задачача 1. С помощью цикла и условия заменить 0 на 1, 1 на 0
    static void taskOne(byte[] mass) {
        for (int i = 0; i < mass.length; i++) {
            mass[i] = (byte) ((mass[i] == 0) ? 1 : 0);
            System.out.print(mass[i]);
        }
    }

    // Задача 2. Задать пустой целочисленный массив размером 8.
    // С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
    static void taskTwo() {
        int[] em = new int[8];
        int num = 0;
        for (int i = 0; i < em.length; i++) {
            em[i] = num;
            num = num + 3;
        }
        for (int n : em) {
            System.out.print(n + " ");
        }
    }

    // Задача 3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ],
    // пройти по нему циклом, и числа, меньшие 6, умножить на 2;
    static void taskThree() {
        int[] snake = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < snake.length; i++) {
            if (snake[i] < 6) {
                snake[i] = snake[i] * 2;
            }
        }
        for (int n : snake) {
            System.out.print(n + " ");
        }
    }

    // Задача 4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
    // и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
    static void taskFour() {
        int[][] square = new int[5][5];
        for (int i = 0; i < 5; i++) {
            square[i][i] = 1;
        }
        for (int[] row : square) {
            for (int col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    // Задача 5. Задать одномерный массив и найти в нем минимальный и максимальный элементы;
    static void taskFive(){
        int[] randomnums = {32,4,5,6,66,34,4,80,7,3,55,};
        int min = randomnums[0];
        int max = randomnums[0];
        for(int i : randomnums){
            min = (i < min) ? i : min;
            max = (i > max) ? i : max;
        }
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
    }

    // Задача 6. Написать метод, в который передается не пустой одномерный целочисленный массив,
    // метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны.
    // Примеры: checkBalance([1, 1, 1, || 2, 1]) → true, checkBalance ([2, 1, 1, 2, 1]) → false,
    // checkBalance ([10, || 10]) → true, граница показана символами ||, эти символы в массив не входят;
    static boolean taskSix(int[] balance){
        int mean;
        if (balance.length % 2 == 0) {
            mean = balance.length / 2;
        }
        else{
            mean = (balance.length / 2) +1;
        }

        int left = 0;
        int right = 0;
        for (int i = 0; i < mean; i++){
            left += balance[i];
        }
        for (int j = mean; j < balance.length; j++){
            right += balance[j];
        }

        return left == right;
    }

    // Задача 7. *Написать метод, которому на вход подается одномерный массив и число n (может быть положительным
    // или отрицательным), при этом метод должен сместить все элементы массива на n позиций.
    // Нельзя пользоваться вспомогательными массивами.

    // Элементы смещаются по кругу!
    static void taskSeven(int[] cats, int n){
        int times = Math.abs(n);
        int count = 0;
        while ( count < times) {
            if (n < 0){
                int last = cats[0];
                for(int i = 0; i < (cats.length-1); i++) {
                    cats[i] = cats[i+1];
                }
                cats[cats.length-1] = last;
                count += 1;
            }
            else{
                int first = cats[cats.length-1];
                for(int i = (cats.length-1); i > 0 ; i--) {
                    cats[i] = cats[i-1];
                }
                cats[0] = first;
                count += 1;
            }
        }

        if (n < 0){

        }

        for (int c : cats) {
            System.out.print(c + " ");
        }
    }

}
