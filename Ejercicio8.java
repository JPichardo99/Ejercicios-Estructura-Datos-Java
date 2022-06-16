/*
Crear una solucion que implemente recurisivad para eliminar las letras que se 
encuentre duplicadas dentro de una cadena, para ello se debera de ingresar un
numero N (N>0) que indica el numero de casos a evaluar, seguido de la candena 
a la cual se desea eliminar las palabras, se debera de mostrar la cadena sin 
las letras en cuestion, los resultados deberan de ser guardados dentro de un 
arreglo  el cual sera mostrado al finalizar de ingresar las cadenas en cuestion 
de forma Recusrivas

           Entrada              Salida
           3
           aacv                 acv
           caddx                cadx
           cccaaddxx            cadx          
*/
/*----------------------------------------------------------------------------------------*/
import java.util.Scanner;
public class Ejercicio8 {
    Scanner entrada;
    int a_N;
    String Resultados[];
    public static void main(String[] args) {
        Ejercicio8 objeto = new Ejercicio8();
        objeto.entrada = new Scanner(System.in);
        objeto.a_N = objeto.entrada.nextInt();
        objeto.m_DatosArreglo();
        objeto.m_printArray(objeto.Resultados, 0);
    }
    void m_DatosArreglo(){
    String v_cadena;
    Resultados = new String [a_N];
    for (int i=0;i<a_N;i++) {
        v_cadena = entrada.next();
        Resultados [i] = m_EliminarDuplicado(v_cadena);
     }
   }
    String m_EliminarDuplicado(String p_Cadena){
          if (p_Cadena == null || p_Cadena.length()<=1) return p_Cadena;
          char aux = p_Cadena.charAt(0);
          char aux2 = p_Cadena.charAt(1);
          if (aux == aux2) return m_EliminarDuplicado(p_Cadena.substring(1));
          else return aux + m_EliminarDuplicado(p_Cadena.substring(1));
    }
    void m_printArray(String Arreglo[], int p_posicion) {
        if (p_posicion != Arreglo.length) {
            System.out.println(Arreglo[p_posicion]);
            m_printArray(Arreglo, p_posicion + 1);
        }
    }        
}