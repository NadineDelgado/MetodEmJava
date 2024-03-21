import java.util.Scanner;

public class Tabuada7{
    
    public static void Tabuada() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número entre 1 a 10: ");
        int n = scanner.nextInt();

        for(int a = 1; a <= 10; a++){
            System.out.println(n + " + " + a + " = " +(n + a));
        }      

        System.out.println("\n");
        for(int a = 1; a <= 10; a++){
            System.out.println(n + " - " + a + " = " +(n - a));
        }

        System.out.println("\n");
        for(int a = 1; a <= 10; a++){
            System.out.println(n + " * " + a + " = " +(n * a));
        }

    System.out.println("\n");
        for(int a = 1; a <= 10; a++){
            System.out.println(n + " / " + a + " = " +(n / a));
        }
    }
    public static void main(String[] args) {
        Tabuada();
    }
}
