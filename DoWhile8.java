import java.util.Scanner;

public class DoWhile8{
    
    public static void DoWhile() {
        Scanner scanner = new Scanner(System.in);
        int n;
        int soma = 0;

        do{
        System.out.println("Digite um numero ou 0 para sair:");
        n = scanner.nextInt();
        soma += n;
    }while(n != 0);
    
    System.out.println("A Soma dos números digitados é: " + soma);
    }
    public static void main(String[] args) {
        DoWhile();
    }
}
