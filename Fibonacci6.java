public class Fibonacci6{

    public static void Fibonacci() {
        int n = 12;
        int a = 1;
        int b = 1;

        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
    }
    public static void main(String[] args) {
        Fibonacci();
    }
}
