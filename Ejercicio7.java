/*
Un numero binario como su nombre lo indica es un numero que solo puede tener dos 
tipos de caracteres 1 y 0, la representacion binario es muy utilizada para emplearse 
en el sistema operativo, para ello deberemos crear una solucion que ingrese un numero N (N >0)
que indica los casos a evaluar, seguido del numero al cual se desea saber su representacion binaria,
dicho numero debera de ser entero, de igual forma el numero debera de ser mayor a 0 de lo contrario
se mostrara un mensaje null como salida, la intencion es crear una solucion recursiva, los 
resultados deberan de ser guardados en un arreglo el cual debera de ser imprimido de forma 
recursiva.

           Entrada              Salida
           5
           -1                   null
           10                   1010
           100                  1100100
           25                   11001
           500                  1111101002
*/
/*----------------------------------------------------------------------------------------*/
import java.util.Scanner;
public class Ejercicio7 {
    Scanner entrada;
    String Resultados[];
    int a_N;
public static void main(String[] args) {
        Ejercicio7 objeto = new Ejercicio7();
        objeto.entrada = new Scanner(System.in);
        objeto.a_N = objeto.entrada.nextInt();
        objeto.m_DatosArreglo();
        objeto.m_printArray(objeto.Resultados, 0);
    }
void m_DatosArreglo(){
int v_Numero;
Resultados = new String [a_N];
    for (int i=0;i<a_N;i++) {
        v_Numero = entrada.nextInt();
        Resultados [i] = m_Binario(v_Numero);
    }
}
public String m_Binario(int p_Numero){
    if (p_Numero <0) return null;
    if (p_Numero / 2 == 0) return "" + p_Numero;
    else return m_Binario (p_Numero/2) + "" + p_Numero%2;
}
void m_printArray(String Arreglo[], int p_posicion) {
        if (p_posicion != Arreglo.length) {
            System.out.println(Arreglo[p_posicion]);
            m_printArray(Arreglo, p_posicion + 1);
        }
    }      
}