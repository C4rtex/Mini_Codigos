package mini_codigos;

public class ArrayBidimensionalDos {

    public static void main(String[] args) {

        double porcentaje;
        double acumulado,aux;
        

        double[][] array = new double[5][6];

        for (int i = 0; i < 5; i++) {
            porcentaje=0.10;
            for (int j = 0; j < 6; j++) {
                if(i==0){
                    array[0][j]=10000;
                }else{
                acumulado = array[i-1][j]+ (array[i-1][j]* porcentaje);
                array[i][j] = acumulado;
                porcentaje = porcentaje + 0.01;
                }
            }
            
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.printf("%1.2f", array[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }

    }

}
