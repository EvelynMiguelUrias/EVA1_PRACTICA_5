/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_practica_5;

/**
 *
 * @author Evelyn
 */
/* 
CREAR UN ARREGLO CON 50 ELEMENTOS, LLENARLO CON VALORES ALEATORIOS ENTRE 1 Y 100
IMPRIMIR UNA LISTA CON LOS VALORES PARES QUE CONTENGA
 */
public class EVA1_PRACTICA_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //CREAMOS EL ARREGLO PARA LOS VALORES 
        int aiArreglo[] = new int[50];
        //INICIALIZAMOS UNA VARIABLE PARA GUARDAR LOS VALORES PARES 
        int z;
        //LLENAMOS EL ARREGLO E IMPRMIMOS LOS VALORES PARES
        for (int i = 0; i < aiArreglo.length; i++) {
            z = (int) (Math.random() * 100);
            //System.out.println("Arreglo: ["+ i+ "]" + z);
            if (z % 2 == 0) {
                aiArreglo[i] = z;
                System.out.println("Numero par: " + aiArreglo[i] + " del arreglo [" + i + "]");
            }
        }
    }
}
