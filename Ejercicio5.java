/*
Para calcular el total de cuadrados que pueden ser abarcados en un area 
de N X M, se tiene un numero infinito de cuadrados de tamaño 2i X 2i donde
i = cualquier numero entero (0, 1, 2...). De esta forma tenemos los siguientes
casos:
      caso 1: Si N es un numero impar y M es un numero par, se debera de
              llenar una fila o una columna de cuadrados de tamano 1X1, posteriormente
              se debera de contar el numero minimo de cuadrados para el tamaño de 
              area N/2 X M/2, si M da como resultado un numero impar y N un numero par
              se debera de encontrar el numero minimo de cuadrados para N/2 X M/2.
      Caso 2: Si N y M son numeros impares, se debera de llenar una fila y una
              columna, de tal modo que se debera de agregar N + M - 1 a la posible 
              siguiente respuesta para asi poder encontrar el numero minimo de cuadrados
              necesarios para llenar un area de N/2 X M/2.
      caso 3: Si N y M son numeros pares, se debera de calcular el numerio minimo de 
              cuadrados necesarios para llenar un area de N/2 X M/2.

Por ejemplo: para un area de 5(N)X6(M) se puede cubrir con un minimo de 9 cuadros,
6 cuadros de 1X1, 2 cuadros de 2X2 y un cuadro de 4X4.

Dicho lo contrario la intencion es encontrar una solucion que implemente recursividad para calcular
el numero minimo de cuadrados necesarios para cubrir un area NXM, para ello se debera de ingresar 
un Numero n de casos a evaluar (n > 0), seguido de un numero entero N y un numero entero M, ambos deberan 
de estar en una misma linea separados por el caracter "-",los resultados deberan de ser guardados en
un arreglo y al final deberan de ser imprimidos de forma recursiva.

Ejemplo
           Entrada             Salida
           5
           5-6                  9 -> Cuadros Minimos
           4-4                  1 -> Cuadros Minimos 
           2-2                  1 -> Cuadros Minimos
           3-7                  12 -> Cuadros Minimos
           1-4                  4 -> Cuadros Minimos
             
*/
/*----------------------------------------------------------------------------------------*/
import java.util.Scanner;
public class Ejercicio5 {
Scanner entrada;
int a_n, a_N, a_M;
int Resultados[];
public static void main(String[] args) {
        Ejercicio5 objeto = new Ejercicio5();
        objeto.entrada = new Scanner(System.in);
        objeto.a_n = objeto.entrada.nextInt();
        objeto.m_DatosArreglo();
        objeto.m_printArray(objeto.Resultados, 0);
    }
void m_DatosArreglo(){
Resultados = new int[a_n];
    for (int i=0;i<a_n;i++) {
    m_IngreNumeros(); 
    Resultados[i] =  m_MinCuadrados(a_N, a_M);
    }
}
void m_IngreNumeros(){
String v_cadena;
        v_cadena = entrada.next();
        v_cadena.toUpperCase().trim();
        String[] v_partes = v_cadena.split("-");
        a_N = Integer.parseInt(v_partes[0]);
        a_M = Integer.parseInt(v_partes[1]);
}
int m_MinCuadrados(int p_N, int p_M){
    if (p_N == 0 || p_M ==0)return 0;
    else if(p_N%2==0 && p_M%2==0) return m_MinCuadrados(p_N/2, p_M/2);
    else if(p_N%2==0 && p_M%2==1) return (p_N + m_MinCuadrados(p_N/2, p_M/2));
    else if(p_N%2==1 && p_M%2==0) return (p_M + m_MinCuadrados(p_N/2, p_M/2));
    else return (p_N + p_M - 1 + m_MinCuadrados(p_N/2, p_M/2));        
}
void m_printArray(int Arreglo[], int p_posicion) {
        if (p_posicion != Arreglo.length) {
            System.out.println(Arreglo[p_posicion] + " -> Cuadros Minimos");
            m_printArray(Arreglo, p_posicion + 1);
        }
    }    
}