package View;

public class Matriz2 {
    public static void main(String[] args) {
        //Definir cantidad
        int cantidad = 3;

        int[][] matriz = new int[cantidad][6];

        // Imprimir la matriz
        int i;
        int j;
        for (i = 0; i < matriz.length; i++) {
            System.out.printf(i+" \n....");
            for (j = 0; j < matriz[i].length; j++) {

                //System.out.printf("["+i+","+j+"] ");
                System.out.print(j+" ");
            }
            System.out.println("");
        }
    }
}
