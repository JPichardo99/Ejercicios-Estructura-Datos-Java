/*
Crear una solucion que implemente Listas en la cual se deberan de 
ingresar un numero N (N>0) que indica el numero de casos a evaluar,
seguido de un numero A (A>0) que indica la cantidad de elemetos que 
contendra la lista 1, seguido de los numeros que contendra la lista 1,
posteriormente un numero B (B>0) que indica la cantida de elementos
que contendra una segunda lista 2, seguido de los numeros que contendra
la lista 2, el programa dara como resultado una tercera lista 3 que 
contendra todos los elementos de la lista 1 y de la lista 2 ordenados.

Ejemplo

           Entrada            Salida
           1
           5
           5
           1
           15
           0
           -1
           5
           30
           3
           500
           700
           1000             -1 0 1 3 5 15 30 500 700 1000 
*/
/*----------------------------------------------------------------------------------------*/
import java.util.Scanner;
public class Ejercicio14{
    int Array[];
    Lista1 objeto1 = new Lista1();
    Lista2 objeto2 = new Lista2();
    Lista3 objeto3 = new Lista3();

    public static void main(String[] args) {
        Ejercicio14 objeto = new Ejercicio14();
        Scanner entrada = new Scanner(System.in);
        int v_N = entrada.nextInt();
        for (int i = 0; i < v_N; i++) {
          objeto.m_IngreDatosLista1();
          objeto.m_IngreDatosLista2();
          objeto.m_LlenarLista3();
          objeto.m_OrdenarArray(objeto.Array);
          objeto.m_LlenarList3(objeto.Array);
          objeto.m_PrintList3();
        }
    }

    void m_IngreDatosLista1() {
        Scanner v_entrada = new Scanner(System.in);
        int v_A;
        v_A = v_entrada.nextInt();
        for (int i = 0; i < v_A; i++) {
            objeto1.m_PUSH(m_IngreNumeros());
        }
    }
    void m_IngreDatosLista2() {
        Scanner v_entrada = new Scanner(System.in);
        int v_B;
        v_B = v_entrada.nextInt();
        for (int i = 0; i < v_B; i++) {
            objeto2.m_PUSH(m_IngreNumeros());
        }
    }
    int m_IngreNumeros() {
        Scanner v_entrada = new Scanner(System.in);
        int v_Numero;
        v_Numero = v_entrada.nextInt();
        return v_Numero;
    }
    void m_LlenarLista3(){
    int v_posicion = 0;
    int LenghtArray = objeto1.m_LenghtList1() + objeto2.m_LenghtList2();
    Array = new int [LenghtArray];
    
    int size1 = objeto1.m_LenghtList1();
    int size2 = objeto2.m_LenghtList2();
        for (int i=0;i<size1; i++, v_posicion++) {
            Array[i] = objeto1.ValueList1();
        }
        for (int j=0;j<size2; j++, v_posicion++) {
            Array[v_posicion] = objeto2.ValueList2();
        }
    }
    void m_OrdenarArray(int p_Array[]){
    for (int i = 0; i < p_Array.length-1; i++) {
            for (int j = i+1; j < p_Array.length; j++) {
                if (p_Array[i] > p_Array[j]){
                    int aux = p_Array[i];
                    p_Array[i]=p_Array[j];
                    p_Array[j]=aux;
                }
            }   
        }
    }
    void m_LlenarList3(int p_Array[]){
        for (int i=0;i<p_Array.length; i++) {
            objeto3.m_PUSH(p_Array[i]);
        }
    }
    void m_PrintList3(){objeto3.print();}
}