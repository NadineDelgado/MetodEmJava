public class MaiorMenor3{

    public static void MaiorMenor() {
        int a = 2;
        int b = 10;

        System.out.println("a = " +a);
        System.out.println("b = " +b);

        if(a > b || b < a){
            System.out.println(a+ " é maior que " +b);
        }else if(b > a || a < b){
            System.out.println(b+ " é maior que " +a);
        }else
            System.out.println("Os dois são iguais. ");
    }
    public static void main (String[] args) {
        MaiorMenor();
    }
}