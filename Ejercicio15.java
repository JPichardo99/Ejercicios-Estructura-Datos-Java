/*
La busqueda Binaria consiste en buscar el elemento central de la lista
o el mas proximo a este, si ese primer dato central es igual al dato
que deseamos buscar entonces el metodo termina (Mejor caso) pero si
si ese elemento central no es el que buscamos y este elemento es menor
al elemento a buscar podemos ignoar los datos de la mitad inferior de la lista
al igual que el item central se puede ignorar y volvemos a buscar un
valor central y a repetir el proceso de comparaciones hasta encontrarl
el valor a buscar o hasta que se termine la lista y por ende no existiria
el elemento a buscar (Pero caso), esto se logra gracias a que este metodo
de busqueda es unicamente aplicado para una serie de datos los cuales estan ordenados.

La intencion es crear una solucion que implemente una busqueda binaria, para
ello se debera de ingresar un numero N (N>0) que indica los caos a evaluar,
seguido de la seire de datos ingresados sobre una misma linea y separados
por un esppacio (1 2 3 4 5...) *Los datos pueden o no estar ordenados, ya que de igual 
forma se les aplicara un metodo de ordenamiento* posteriormente un numero A que indicara el elemento
a buscar dentro de la serie de datos. El programa arrojara si existe o no existe el elemento
dentro de la serie de datos.

Ejemplo

           Entrada                       Salida
           2                   
           500 1952 0 2000 3    
           -1                            El Numero: -1 -> No existe en el arreglo
           -1 2 3 50 40 23 0 1 12 -10 
           0                             El Numero: 0 -> Existe en el arreglo -> En la posicion: 2
*/
/*----------------------------------------------------------------------------------------*/
import java.util.Scanner;
public class Ejercicio15 {
public static void main(String[] args) {
        Ejercicio15 objeto = new Ejercicio15();
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
     m_Num_Buscar(p_Array);  
    }
    void m_Num_Buscar(int p_Array[]){
        Scanner v_entrada = new Scanner(System.in);
    int v_N;
        v_N = v_entrada.nextInt();
        int Resultado = m_Buscar_Numero(v_N,p_Array);
        if (Resultado != -1) {
            System.out.println("El Numero: " + v_N + " -> Existe en el arreglo" + " -> En la posicion: " + Resultado);
        } else {
            System.out.println("El Numero: " + v_N + " -> No existe en el arreglo");
        }
    
    }
     int m_Buscar_Numero(int p_N, int p_Array[]) {
      int inicio = 0;
      int fin = p_Array.length-1;
      int Post_central, val_central;
      while (inicio <= fin){
      Post_central =  (inicio+fin)/2;
      val_central = p_Array[Post_central];
          if (p_N == val_central) return Post_central;
          else if (p_N < val_central) fin = Post_central - 1;
          else inicio = Post_central + 1;
      }
      return -1;  
    }
}