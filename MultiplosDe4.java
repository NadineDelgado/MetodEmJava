public class MultiplosDe4 {

    public static void Multiplos() {
        int n = 100;
        int a = 1;
        int b = 1;
        int c;

        while ((c = a + b) <= n) {
            if (c % 4 != 0) {
                System.out.print(c + " ");
            }
            a = b;
            b = c;
        }
    }
    public static void main(String[] args) {
        Multiplos();
    }
}
