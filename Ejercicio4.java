/*
Las operaciones más basicas en matematicas que se puedan realizar son: Suma, Resta, Division y Multiplicacion,
para ello se debera de crear una solucion que realice alguna de las anteriores mencionadas en forma recursiva.
De tal manera que se deba de  ingresa un numero N que representa los casos a evaluar, seguido de un numero A 
y un segundo numero B, los numeros ingresados deberan de estar en una misma linea separados por el caracter "-" 
seguido de la operacion que se desea realizar (SUMA, RESTA, DIVISION, MULTIPLICACION). Al finalizar de ingresar 
los datos los resultados deberan de ser guardados en un arreglo e imprimido de forma recursiva.

           Entrada              Salida
           4
           2-3-SUMA             5
           10-2-DIVISION        5.0
           10-3-RESTA           7
           2-5-MULTIPLICACION   10     
*/
/*----------------------------------------------------------------------------------------*/
import java.util.Scanner;
public class Ejercicio4 {
    Scanner entrada;
    int a_N, a_A, a_B;
    String Resutlados[];
    String a_Operacion;
    public static void main(String[] args) {
        Ejercicio4 objeto = new Ejercicio4();
        objeto.entrada = new Scanner(System.in);
        objeto.a_N = objeto.entrada.nextInt();
        objeto.m_DatosArreglo();
        objeto.m_printArray(objeto.Resutlados, 0);
    }
    void m_DatosArreglo() {
        Resutlados = new String[a_N];
        for (int i = 0; i < a_N; i++) {
            m_IngreNumeros();
            switch (a_Operacion) {
                case "SUMA":
                    Resutlados[i] = String.valueOf(m_SumaRecursiva(a_A, a_B));
                    break;
                case "RESTA":
                    Resutlados[i] = String.valueOf(m_RestaRecursiva(a_A, a_B));
                    break;
                case "DIVISION":
                    Resutlados[i] = String.valueOf(m_DivisionRecursiva(a_A, a_B));
                    break;
                case "MULTIPLICACION":
                    Resutlados[i] = String.valueOf(m_MultiplicacionRecursiva(a_A, a_B));
                    break;
            }
        }
    }
    void m_IngreNumeros() {
        String v_cadena;
        v_cadena = entrada.next();
        v_cadena.toUpperCase().trim();
        String[] v_partes = v_cadena.split("-");
        a_A = Integer.parseInt(v_partes[0]);
        a_B = Integer.parseInt(v_partes[1]);
        a_Operacion = v_partes[2];
    }
    int m_SumaRecursiva(int p_A, int p_B) {
        if (p_B > 0) {
            return m_SumaRecursiva(p_A + 1, p_B - 1);
        } else {
            return p_A;
        }
    }
    int m_RestaRecursiva(int p_A, int p_B) {
        if (p_A > p_B) {
            return 1 + m_RestaRecursiva(p_A, p_B + 1);
        }
        if (p_B > p_A) {
            return -1 + m_RestaRecursiva(p_A + 1, p_B);
        } else {
            return 0;
        }
    }
    float m_DivisionRecursiva(int p_A, int p_B) {
        if (p_B > p_A) {
            return 0;
        } else {
            return (m_DivisionRecursiva(p_A - p_B, p_B) + 1);
        }
    }
     int m_MultiplicacionRecursiva(int p_A, int p_B) {
        if (p_B == 0) {
            return 0;
        } else {
            return (p_A + m_MultiplicacionRecursiva(p_A, p_B - 1));
        }
    }
    void m_printArray(String Arreglo[], int p_posicion) {
        if (p_posicion != Arreglo.length) {
            System.out.println(Arreglo[p_posicion]);
            m_printArray(Arreglo, p_posicion + 1);
        }
    }
}
