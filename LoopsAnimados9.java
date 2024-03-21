public class LoopsAnimados9{

    public static void LoopsAnimados() {
        int c = 1;
        int[][] matriz = new int [5][5];
        
        for(int linha = 0; linha < 5; linha++){
            for(int coluna = 0; coluna < 5; coluna++){
                matriz[linha][coluna] = c;
                    c++;
            }
        } 
        
        for(int linha = 0; linha < 5; linha++){
            for(int coluna = 0; coluna < 5; coluna++){
                System.out.print(matriz[linha][coluna] + " ");
            }
            System.out.println();
        } 
    }
        public static void main(String[] args) {
            LoopsAnimados();
    }
}
