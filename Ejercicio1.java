/*
Sumas de forma recursiva los digitos de un numero entero, para ello
tendremos un numero N que representa la cantidad de casos de prueba
seguido de los numeros a sumar contenidos dentro de una misma linea.

Ejemplo:
	Entrada		Salida
  	3		
	123		6
	161		8	
	1234		10
*/
import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
        Ejercicio1 objeto = new Ejercicio1 ();
        Scanner entrada = new Scanner(System.in);
        int N, num;
        int Resultados[];
        N = entrada.nextInt();
        Resultados = new int[N];
        for (int i = 0; i < N; i++) {
            num = entrada.nextInt();
            Resultados[i] = objeto.m_SumRecursiva(num);
        }
        for (int i = 0; i < Resultados.length; i++) {
            System.out.println(Resultados[i]);
        }
    }

    int m_SumRecursiva(int p_num) {
        if (p_num == 0) {
            return p_num;
        } else {
            return m_SumRecursiva(p_num / 10) + (p_num % 10);
        }
    }
}
