/*
Un numero Natural es un numero cualquiera que puede ser usado para contar los
elementos de un cierto conjunto de elementos, se puede decir que los numeros 
naturales empiezan desde el numero 1 hasta un numero n de elementos, dicho esto
se desea implementar una suma recursiva de un numero Natural entero, por ejemplo si se 
desea saber la suma de numeros Naturales comprendidos desde el numero 1 hasta 
el numero 6 quedaria de la siguiente manera -> 1 + 2 + 3 + 4  + 5 + 6 = 21. Para
ello se debera de ingresar un numero N que representa los casos a evaluar (N>0) 
seguido del numero Natural n del cual se desea saber la suma de sus numero Naturales,
Los resultados deberan de ser guardados en un arreglo y mostrados de forma recursiva.

Ejemplo

           Entrada              Salida
           3
           5                    15 
           10                   55
           15                   120
*/
/*----------------------------------------------------------------------------------------*/
import java.util.Scanner;
public class Ejercicio6 {
Scanner entrada;
int a_N;
int Resultados[];
public static void main(String[] args) {
        Ejercicio6 objeto = new Ejercicio6 ();
        objeto.entrada = new Scanner(System.in);
        objeto.a_N = objeto.entrada.nextInt();
        objeto.m_DatosArreglo();
        objeto.m_printArray(objeto.Resultados, 0);
    }
void m_DatosArreglo(){
int v_n;
Resultados = new int [a_N];
    for (int i=0;i<a_N; i++) {
       v_n = entrada.nextInt();
       Resultados[i] = m_NumNatural(v_n);
    }
}
int m_NumNatural(int p_n){
    if (p_n <= 1) return p_n;
    else return p_n + m_NumNatural(p_n-1);
}
void m_printArray(int Arreglo[], int p_posicion) {
        if (p_posicion != Arreglo.length) {
            System.out.println(Arreglo[p_posicion]);
            m_printArray(Arreglo, p_posicion + 1);
        }
    }      
}