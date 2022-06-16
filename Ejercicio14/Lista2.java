public class Lista2 {
    Nodo inicio, fin;
    Nodo aux;
    
    Lista2(){inicio = fin = null;}
    boolean m_IsEmpty(){return (inicio == null) ?true:false;}
      
      void m_PUSH(int p_valor){
          aux = new Nodo(p_valor);
          if (m_IsEmpty())inicio = fin = aux;
          else fin = fin.siguiente = aux;
      }
      
      int m_LenghtList2(){
      int v_cont = 0;
      aux = inicio;
      while(aux != null){
      aux = aux.siguiente;
      v_cont++;
      }
      return v_cont;
      }
      
      int ValueList2(){
      int v_value = 0;
          if (!m_IsEmpty()) {
              v_value = inicio.valor;
              inicio = inicio.siguiente;
          }
          return v_value;
      }
}
