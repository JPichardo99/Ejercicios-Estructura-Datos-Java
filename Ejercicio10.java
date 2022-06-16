/*
Crear una solucion que implemente recurisivad para determinar si un numero 
dado es potencia de 4 o potencia de 8 segun sea el caso dado. Para ello se
debera de ingrear un numero N (N>0) de casos, seguido de un numero 4 0 8
esto indicara si se desa saber si es potencia de 4 o potencia de 8 seguido
del numero F (F>0) al cual se desea evaluar, mostrara un 'false'en caso de 
no ser potencia o un 'true' en caso de cerlo. Los resultados deberan de ser
guardados en un arreglo y mostrados mediante recursividad al finalizar de 
ingresar los datos.

           Entrada              Salida
           4
           4 4096               true
           4 729                false
           8 512                true
           8 32768              true
*/
/*----------------------------------------------------------------------------------------*/
import java.util.Scanner;
public class Ejercicio10{
int a_N, a_F, a_Caso;
boolean Resultados[];
    public static void main(String[] args) {
       Ejercicio10 objeto = new Ejercicio10();
       Scanner entrada = new Scanner(System.in);
       objeto.a_N = entrada.nextInt();
        objeto.m_DatosArreglo();
        objeto.m_printArray(objeto.Resultados, 0);
    }
 void m_ingreNumeros(){
 Scanner v_entrada2 = new Scanner(System.in);    
 String v_cadena;
       v_cadena = v_entrada2.nextLine();
       String[] v_partes = v_cadena.trim().split(" "); 
       a_Caso = Integer.parseInt(v_partes[0]);
       a_F = Integer.parseInt(v_partes[1]);
 } 
 void m_DatosArreglo(){
 Resultados = new boolean[a_N];
     for (int i=0;i<a_N;i++) {
         m_ingreNumeros();
         if (a_Caso == 4) Resultados[i] = m_Multiplo4(a_F);
         else Resultados[i] = m_Multiplo8(a_F);
     }
 }
    
 boolean m_Multiplo4(int p_F){
 double v_aux = Math.log(p_F) / Math.log(4);
 return v_aux == Math.floor(v_aux);
 }
 boolean m_Multiplo8(int p_F){
 double v_aux = Math.log(p_F) / Math.log(8);
 return v_aux - Math.floor(v_aux) < 0.000001;
 }
 void m_printArray(boolean Arreglo[], int p_posicion){
        if (p_posicion != Arreglo.length) {
            System.out.println(Arreglo[p_posicion]);
            m_printArray(Arreglo, p_posicion+1);
        }
    }
}