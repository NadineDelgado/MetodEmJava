import java.util.Scanner;

public class Asteristico10{
    
    public static void Asteristico() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a altura do triângulo: ");
        int a = scanner.nextInt();

        for(int b = 1; b <= a; b++){

            for(int c = 1; c <= b; c++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Asteristico();
    }
}