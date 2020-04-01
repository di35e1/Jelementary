package TicTacToe;
import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

    private static char[][] map;
    private static int SIZE = 3;

    private static final char DOT_EMPTY = '.';
    private static final char DOT_X = 'X';
    private static final char DOT_O = 'O';

    private static final boolean SILLY_MODE = true;

    private static Scanner scanner = new Scanner(System.in);
    private static Random random = new Random();

    public static void main(String[] args) {

        initMap();
        printMap();

        while(true) {
            humanTurn(); // ход человека
            if (isEndGame(DOT_X)) {
                break;
            }

            computerTurn(); // ход компутера
             if (isEndGame(DOT_O)) {
                 break;
             }
        }

        System.out.println("Игра закончена");
    }

    private static void initMap() {
        map = new char[SIZE][SIZE];
        for(int i = 0; i < SIZE; i++){
            for(int j = 0; j < SIZE; j++){
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    private static void printMap() {
        for(int i = 0; i <= SIZE; i++){
            System.out.print(i + " ");
        }
        System.out.println();

        for(int i = 0; i < SIZE; i++){
            System.out.print((i+1) + " ");
            for(int j = 0; j < SIZE; j++){
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
    }

    private static void humanTurn() {
        int x, y;

        do{
            System.out.println("Введите координаты ячейки - y x");
            y = scanner.nextInt() - 1;
            x = scanner.nextInt() - 1;
        } while (!isCallValid(x, y));

        map[y][x] = DOT_X;
    }

    private static void computerTurn() {
        int x = 0, y = 0;
        int numCells = 0;

        if (SILLY_MODE) {
            do {
                x = random.nextInt(SIZE);
                y = random.nextInt(SIZE);
            } while (!isCallValid(x, y));
        }
        // Типа умный компьютер
        else {
            for (int i = 0; i < SIZE;  i++) {
                for (int j = 0; j < SIZE; j++) {
                    /// ???
                }
            }
        }

        System.out.println("Компьютер выбрал ячейку " + (y+1) + " " + (x+1));
        map[y][x] = DOT_O;
    }

    public static int checkCell(int x, int y){
        int rating=0;

        for(int i = x; i < SIZE; i++){
            for (int j = y; j < SIZE; j ++){
                System.out.print("?" );

                if(isCallValid(i, j) && map[j][i] == DOT_O) {

                    rating++;
                }
            }
        }
        return rating;
    }

    private static boolean isCallValid(int x, int y) {
        boolean result = true;

        if((x < 0) || (x >= SIZE) || (y < 0) || (y >= SIZE)){
            result = false;
        }

        else if(map[y][x] != DOT_EMPTY){
            result = false;
        }

        return result;
    }

    private static boolean isEndGame(char playerSymbol) {
        boolean result = false;

        printMap();

        if(checkWin(playerSymbol)){
            System.out.println("Победил " + playerSymbol);
            result = true;
        }

        if(isMapFull()) {
            System.out.println("Ничья");
            result = true;
        }

        return result;
    }

    private static boolean isMapFull() {
        boolean result = true;

        for(int i = 0; i < SIZE; i++) {
            for(int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }

    private static boolean checkWin(char playerSymbol) {
        boolean result = false;

        if(
        (map[0][0] == playerSymbol && map[0][1] == playerSymbol && map[0][2] == playerSymbol) ||
        (map[1][0] == playerSymbol && map[1][1] == playerSymbol && map[1][2] == playerSymbol) ||
        (map[2][0] == playerSymbol && map[2][1] == playerSymbol && map[2][2] == playerSymbol) ||
        (map[0][0] == playerSymbol && map[1][0] == playerSymbol && map[2][0] == playerSymbol) ||
        (map[0][1] == playerSymbol && map[1][1] == playerSymbol && map[2][1] == playerSymbol) ||
        (map[0][2] == playerSymbol && map[1][2] == playerSymbol && map[2][2] == playerSymbol) ||
        (map[0][0] == playerSymbol && map[1][1] == playerSymbol && map[2][2] == playerSymbol) ||
        (map[2][0] == playerSymbol && map[1][1] == playerSymbol && map[0][2] == playerSymbol)
        ){
            result = true;
        }
        return result;
    }
}