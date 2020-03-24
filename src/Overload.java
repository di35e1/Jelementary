public class Overload {
    public static void main(String[] args) {
        int a = multiply(5,4);
        double d = multiply(7.8);

        System.out.println(a);
        System.out.println(d);
    }

    static int multiply(int x, int y){
        return x * y;
    }

    static double multiply(double x){
        return x * x;
    }
}

