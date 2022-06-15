/*
Calcular de forma recursiva el exponente de un numero entero, para ello
se debera de ingresar un numero N que representa los casos de prueba, seguido
de un numero A (base) y un numero B (exponente).Al ingresar los numeros A y B deberan
de estar en una sola linea y separados por el caracter "-"

Ejemplo
           Entrada        Salida
           3
           2-3            6
           5-2            25
           10-3           1000
*/
/*----------------------------------------------------------------------------------------*/
import java.util.Scanner;
public class Ejercicio2{
Scanner entrada;
int a_A, a_B, a_N; 
int Resultados [];
    public static void main(String[] args) {
        Ejercicio2objeto = new Ejercicio2();
        objeto.entrada = new Scanner(System.in);
        objeto.a_N = objeto.entrada.nextInt();
        objeto.m_DatosArreglo();
        objeto.m_printArray(objeto.Resultados, 0);
    }
    void m_DatosArreglo(){
    Resultados = new int [a_N];
        for (int i=0;i<a_N; i++) {
            m_IngreNumeros();
            Resultados[i]= m_CalPotencia(a_A, a_B);
        }
    }
    void m_IngreNumeros(){
    String v_cadena;
            v_cadena = entrada.next();
            String [] v_partes = v_cadena.split("-");
            a_A = Integer.parseInt(v_partes[0]);
            a_B = Integer.parseInt(v_partes[1]);
    }
    int m_CalPotencia(int p_A, int p_B){
        if (p_B == 0) return 1;
        else if (p_B == 1) return p_A;
        else return p_A * m_CalPotencia(p_A, p_B-1); 
      }
    void m_printArray(int Arreglo[], int p_posicion){
        if (p_posicion != Arreglo.length) {
            System.out.println(Arreglo[p_posicion]);
            m_printArray(Arreglo, p_posicion+1);
        }
    }
}





