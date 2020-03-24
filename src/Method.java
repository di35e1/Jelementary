
public class Method {
    public static void main(String[] args) {
        int a = getSum(2,3);
        int b = getSum(9, 18);

        System.out.println(b);
        System.out.println(a);
    }

    static int getSum(int x, int y) {
        return x+y;
    }
}
