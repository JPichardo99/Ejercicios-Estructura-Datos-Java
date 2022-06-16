/*
Siguiendo con los metodos de ordenamiento toca el turno al
metodo de ordenamiento por seleccion, que consiste en detectar el
elemento menor del arreglo e intercambiarlo con el elemento en la
primera posicion, posteriosmente se buscara el segundo mas pequeño y
se intercambiara y asi sucesivamente. La intencion es crear una solucion
que implemente este metodo, para ello se debera de ingresar un numero
N (N>0) que seran los casos a evaluar, seguido de un numero B (B>0) que
corresponde a la longitud o tamaño del arreglo y seguido de los elementos
que en este caso seran numeros enteros a ordenar.

Ejemplo

           Entrada                      Salida
           2
           10                   
           -1 2 3 50 40 23 0 1 12 -10    -10  -1  0  1  2  3  12  23  40  50 
           5
           500 1952 0 2000 3             0  3  500  1952  2000           
*/
/*----------------------------------------------------------------------------------------*/
import java.util.Scanner;
public class Ejercicio12{
    public static void main(String[] args) {
       Ejercicio12 objeto = new Ejercicio12();
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
     m_SelectionSort(v_Numeros);
    }
    void m_SelectionSort(int p_Array[]){
    int v_n = p_Array.length;
        for (int i = 0; i < v_n-1; i++) {
            int v_aux = i;
            for (int j = i+1; j < v_n; j++) {
                if (p_Array[j]<p_Array[v_aux]) {
                    v_aux = j;  
                }
            }
            int v_aux_2 = p_Array[v_aux]; 
            p_Array[v_aux] = p_Array[i]; 
            p_Array[i] = v_aux_2;
        }
        printArray(p_Array);
    }
    void printArray(int p_Array[]){
        for (int i = 0; i <p_Array.length; i++) {
            System.out.print(p_Array[i]+"  ");
        }
        System.out.println("");
    } 
}