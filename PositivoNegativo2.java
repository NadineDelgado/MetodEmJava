public class PositivoNegativo2{
    
    public static void PositivoNegativo() {
        int a = 2;
        int b = -20;

        System.out.println("a = " +a);
        System.out.println("b = " +b);

        if(a > 0 && b > 0){
            System.out.println("Os dois numeros são positivos. ");
        }else if(a < 0 && b < 0){
            System.out.println("Os dois numeros são negativos. ");
        }else
            System.out.println("Um numero é positivo e o outro é negativo. ");
    }

    public static void main (String[] args) {
        PositivoNegativo();
    }
}
