import java.util.Scanner;

public class Switch5{

  public static void Switch() {
    Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um numero de 1 a 7: ");
        int a = scanner.nextInt();

    switch (a) {
      case 1:
        System.out.println("Monday");
        break;
      case 2:
        System.out.println("Tuesday");
        break;
      case 3:
        System.out.println("Wednesday");
        break;
      case 4:
        System.out.println("Thursday");
        break;
      case 5:
        System.out.println("Friday");
        break;
      case 6:
        System.out.println("Saturday");
        break;
      case 7:
        System.out.println("Sunday");
        break;
    }
  }
  public static void main (String[] args) {
    Switch();
  }
}