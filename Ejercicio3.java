/*
Calcular de forma recursiva la cantidad de digitos enteros contenidos en un
numero, para ello se deberan de ingresar un numero N que representa los casos
a evaluar, seguido del numero A que representa el numero al cual se desea saber
la cantidad de digitos que contiene.

Ejemplo
           Entrada         Salida
           3
           1234            4 -> Digitos
           100002          6 -> Digitos
           22              2 -> Digitos
*/
/*----------------------------------------------------------------------------------------*/
import java.util.Scanner;
public class Ejercicio3{
    Scanner entrada;
    int a_A, a_N;
    int Resultados[];
    public static void main(String[] args) {
        Ejercicio3 objeto = new Ejercicio3();
        objeto.entrada = new Scanner(System.in);
        objeto.a_N = objeto.entrada.nextInt();
        objeto.m_DatosArreglo();
        objeto.m_printArray(objeto.Resultados, 0);
    }
    void m_DatosArreglo(){
    Resultados = new int [a_N];
        for (int i=0;i<a_N;i++) {
         a_A = entrada.nextInt();
         Resultados [i] = m_CalDigitos(a_A);
        }
    }
    int m_CalDigitos(int p_A){
        if (p_A < 0) p_A = Math.abs(p_A);
        if (0 < p_A && p_A < 10) return 1;
        else return 1 + m_CalDigitos(p_A/10);
    }
    void m_printArray(int Arreglo[], int p_posicion){
        if (p_posicion != Arreglo.length) {
            System.out.println(Arreglo[p_posicion] + " -> Digitos");
            m_printArray(Arreglo, p_posicion+1);
        }
    }
}