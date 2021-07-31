package mini_codigos;

public class Matrices1 {

    public static void main(String[] args) {

        //Primera forma de declarar una matriz
        int[] miMatriz = new int[5];

        //Primera forma de agregar elementos a una matriz (agregar cada elemento en el indice indicado)
        miMatriz[0] = 1;
        miMatriz[1] = 2;
        miMatriz[2] = 3;
        miMatriz[3] = 4;
        miMatriz[4] = 5;

        /*  Segunda forma de declarar una matriz
            Esta lo que hace es declarar la matriz e introducir los elementos 
            en una sola línea
         */
        int[] miMatriz2 = {1, 2, 3, 4, 5};

        // Recorrer las matrices con un for normal
        for (int i = 0; i < miMatriz.length; i++) {
            System.out.println("Posicion matriz 1: " + i + " con un valor de " + miMatriz[i]);
        }
        System.out.println();
        for (int i = 0; i < miMatriz2.length; i++) {
            System.out.println("Posicion matriz 2: " + i + " con un valor de " + miMatriz2[i]);
        }
    }

}
