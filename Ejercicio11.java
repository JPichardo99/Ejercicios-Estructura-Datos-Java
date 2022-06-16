/*
Uno de los tantos metodos de ordenacion que existe dentro de la programacion
es el metodo burbuja, el cual realiza intercambios y repeticiones segun la cantidad
de datos que contenga un arreglo determinado. Para ello se busca crear un ejercicio
basico en el cual se ingresara un numero N (N>0) que seran los casos a evaluar,
seguido de un numero A (A>0) que sera la longitud de dicho arreglo determinado
que contendra numeros enteros, y por ultimo los numeros a los cuales se deberan de
ordenar. 

           Entrada                       Salida
           2
           10                   
           -1 2 3 50 40 23 0 1 12 -10    -10  -1  0  1  2  3  12  23  40  50 
           5
           500 1952 0 2000 3             0  3  500  1952  2000           
*/
/*----------------------------------------------------------------------------------------*/
import java.util.Scanner;
public class Ejercicio11 {
    public static void main(String[] args) {
       Ejercicio11 objeto = new Ejercicio11();
       Scanner entrada = new Scanner(System.in);
       int v_N;
       v_N = entrada.nextInt();
        for (int i=0;i<v_N; i++) {
         int v_A = entrada.nextInt();
         objeto.m_IngreNumeros(v_A);
        }
    }
    void m_IngreNumeros(int p_A){
    int v_Numeros [] = new int [p_A];
    Scanner v_entrada2 = new Scanner(System.in);    
    String v_cadena;
    v_cadena = v_entrada2.nextLine();
    String[] v_partes = v_cadena.trim().split(" "); 
    for (int i=0;i<v_partes.length; i++) {
            v_Numeros[i] = Integer.parseInt(v_partes[i]);
       }
     m_BubbleSort(v_Numeros);
    }
    void m_BubbleSort(int p_Array[]){
    int aux = 0;
        for (int i = 0; i <p_Array.length; i++) {
        for (int j = 1; j < (p_Array.length - i); j++) {
            if (p_Array[j - 1] >p_Array[j]) {
                aux = p_Array[j - 1];
                p_Array[j - 1] = p_Array[j];
                p_Array[j] = aux;
            }
        }    
      }
        printArray( p_Array);
    }
    void printArray(int p_Array[]){
        for (int i = 0; i <p_Array.length; i++) {
            System.out.print(p_Array[i]+"  ");
        }
        System.out.println("");
    }
}