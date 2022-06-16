/*
Crear una solucion que implemente recurisivad para encontrar la suma de los
digitos de un numero entero dado, para ello se ingresara un numero N (N>0)
que indica los casos a evaluar, seguido de un numero A al cual se desean sumar 
sus digitos de forma recursiva, si el numero A al principio del mismo posee el caracter
o signo negativo, entonces todos los digitos que estan contenidos en el son negativos,
los resultados deberan de ser guardados en un arreglo e imprimido de forma recurisva 
al finalizar de evaluar todos los casos.

           Entrada              Salida
           4
           12345                15
           45632                20
           12121212             12
           -5500113             -15
*/
/*----------------------------------------------------------------------------------------*/
import java.util.Scanner;
public class Ejercicio9{
Scanner entrada;
int Resultados[];
int a_N;
    public static void main(String[] args) {
       Ejercicio9 objeto = new Ejercicio9();
       objeto.entrada = new Scanner(System.in);
       objeto.a_N = objeto.entrada.nextInt();
       objeto.m_DatosArreglo();
       objeto.m_printArray(objeto.Resultados, 0);
    }
    void m_DatosArreglo(){
    int v_A;
    Resultados = new int [a_N];
        for (int i=0;i<a_N;i++) {
            v_A = entrada.nextInt();
            Resultados[i] = m_SumaDigitos(v_A);
        }
    }
    int m_SumaDigitos(int p_A){
        if (p_A == 0) return 0;
        else return (p_A%10 + m_SumaDigitos(p_A/10));
    }
    void m_printArray(int Arreglo[], int p_posicion) {
        if (p_posicion != Arreglo.length) {
            System.out.println(Arreglo[p_posicion]);
            m_printArray(Arreglo, p_posicion + 1);
        }
    }    
}