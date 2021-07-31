
package mini_codigos;

public class MatrizBidimensional {

    public static void main(String[] args) {
       //Creacion de matriz bidimensional, se asemeja a un array normal
       int [][] arrayBidimensional=new int [3][2];
       
       //Relleno de la matriz manual 
       //                 F  C           F=Fila C=Columna o F=Dimensión 1 y C=Dimensión 2
       arrayBidimensional[0][0]=1;
       arrayBidimensional[0][1]=2;
       
       arrayBidimensional[1][0]=3;
       arrayBidimensional[1][1]=4;
       
       arrayBidimensional[2][0]=5;
       arrayBidimensional[2][1]=6;
       
       //Ver solo un dato de los indices [0,0] (por ej) de la matriz en consola
        System.out.println("[0,0]: "+arrayBidimensional[0][0]);
        
        
        //Ver toda la matriz en forma de tabla. Se recorre utilizando dos for, uno para la primera dimensión y otro para la segunda dimensión
       
        for(int i=0;i<3;i++){
            for(int j=0; j<2;j++){
                System.out.print(arrayBidimensional[i][j]+" ");
            }
            System.out.println();
        }
       
    }
    
}
