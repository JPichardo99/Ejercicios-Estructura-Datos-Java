/*
Nombre: Pichardo Buenrostro jesus Alejandro 
Instrucciones Problema propuesto 16
-----
La busqueda Secuencial consiste en buscar de forma linea o secuencial (uno en uno)
un elemento dentro de una serie de datos determinados, si el elemento en 
la primera posicion es el elemento que se desea buscar (Mejor caso) entonces
el metodo terminara en ese momento, de lo contrario se movera un elemento a la 
vez realizando comparaciones con el valor a buscar hasta encontrarlo (Caso promedio)
o hasta que no existan mas elementos comparables y por ende el valor no existira en 
la lista de elementos (Peor caso) este tipo de busqueda se suele aplicar para datos
que no este ordenados (lo que en teoria provocaria mayor numero de comparaciones) pero
pueden estar ordenados (Posiblemente se den menos comparaciones).

La intencion es crear una solucion que implemente una busqueda Secuencial, para ello
se deberan de ingresar un numero N (N>0) que indica los casos a evaluar,
seguido de la serie de datos ingresados sobre una misma linea y sepradaos por un
espacio (10 20 30 40 50...) *Como se dijo los datos pueden o no estar ordenados*
posteriormente un numero determinado a buscar dentro de la lista previamente 
ingresada. El programa arrojara si existe o no dicho elemento dentro de la serie de datos.

Ejemplo

           Entrada                       Salida
           2                   
           100 -1 30 20 10 3 4 5 150    
           -1                            El Numero: -1 -> Existe en el arreglo -> En la posicion: 1
           500 20 40 1200 5000 111 
           0                             El Numero: 0 -> No existe en el arreglo
*/
/*----------------------------------------------------------------------------------------*/
import java.util.Scanner;
public class Ejercicio16 {
    public static void main(String[] args) {
       Ejercicio16 objeto = new Ejercicio16();
       Scanner entrada = new Scanner(System.in);
       int v_N;
       v_N = entrada.nextInt();
        for (int i=0;i<v_N; i++) {
         objeto.m_IngreNumeros();
        }
    }
    void m_IngreNumeros(){
    Scanner v_entrada2 = new Scanner(System.in);
    String v_cadena;
    v_cadena = v_entrada2.nextLine();
    String[] v_partes = v_cadena.trim().split(" "); 
    int v_Numeros [] = new int[v_partes.length];
    for (int i=0;i<v_partes.length; i++) {
            v_Numeros[i] = Integer.parseInt(v_partes[i]);
       }
    m_BuscarNumero(v_Numeros,v_entrada2);   
    }
    void m_BuscarNumero(int p_Array[], Scanner p_entrada){
    int v_N;
    v_N = p_entrada.nextInt();
    boolean v_bandera = false;
    int v_i = 0;
    while   ((v_i<p_Array.length) && !v_bandera){
        if (p_Array[v_i++]== v_N) {
            v_bandera = true;
        }
    }
    if (v_bandera) {
            System.out.println("El Numero: " + v_N+" -> Existe en el arreglo"+ " -> En la posicion: "+(v_i-1));
        } else System.out.println("El Numero: " + v_N+" -> No existe en el arreglo");
    }
}