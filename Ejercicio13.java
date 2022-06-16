/*
Realizar un programa que calcule el numero de comparaciones que
se realizan en el metodo de ordenamiento burbuja, para ello se 
ingresara un numero N (N>0) que indicara el numero de casos a evaluar
seguido de un numero A (A>0) que indica el numero de datos a ordenar,
seguido de un numero B (B>0) que indica el numero limite respecto a un
numero aleatorio que en este caso seria desde 1 hasta B.

Nota: Al estar el arreglo lleno con numeros aleatorios es casi improbable 
que si se ingresa exactamente los mimso casos den los mismo resultados.

Ejemplo

           Entrada            Salida
           3
           10 99              14          
           10 99              18
           15 99              65                  
*/
/*----------------------------------------------------------------------------------------*/
import java.util.Random;
import java.util.Scanner;
public class Ejercicio13 {
    public static void main(String[] args) {
        Ejercicio13 objeto = new Ejercicio13();
        Scanner v_entrada = new Scanner(System.in);
        int v_N;
        v_N = v_entrada.nextInt();
        for (int i = 0; i < v_N; i++) {
        objeto.m_IngreNumeros();
        }
    }
    void m_IngreNumeros() {
        Scanner v_entrada2 = new Scanner(System.in);
        String v_cadena;
        v_cadena = v_entrada2.nextLine();
        String[] v_partes = v_cadena.trim().split(" ");
        int v_A = Integer.parseInt(v_partes[0]);
        int v_B = Integer.parseInt(v_partes[1]);
        m_CrearLlenarArreglo(v_A, v_B);
    }
    void m_CrearLlenarArreglo(int p_A, int p_B) {
     int [] v_Array = new int[p_A];
     Random v_NumAleatorio = new Random();
        for (int i=0;i<p_A; i++) {
            v_Array[i] = 1 + v_NumAleatorio.nextInt(p_B);
        }
        m_BubbleSort(v_Array);
    }
    void m_BubbleSort(int p_Array[]){
    int aux = 0, v_contador=0;
        for (int i = 0; i <p_Array.length; i++) {
        for (int j = 1; j < (p_Array.length - i); j++) {
            if (p_Array[j - 1] >p_Array[j]) {
                aux = p_Array[j - 1];
                p_Array[j - 1] = p_Array[j];
                p_Array[j] = aux;
                v_contador++;
            }
        }    
      }
        System.out.println(v_contador);
    }
}