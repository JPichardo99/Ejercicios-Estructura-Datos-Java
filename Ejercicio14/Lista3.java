public class Lista3 {
    Nodo inicio, fin;
    Nodo aux;
    Lista3() {
        inicio = fin = null;
    }
    boolean m_IsEmpty() {
        return (inicio == null) ? true : false;
    }
    void m_PUSH(int p_valor){
          aux = new Nodo(p_valor);
          if (m_IsEmpty())inicio = fin = aux;
          else fin = fin.siguiente = aux;
      }
    int m_LenghtList3() {
        int v_cont = 0;
        aux = inicio;
        while (aux != null) {
            aux = aux.siguiente;
            v_cont++;
        }
        return v_cont;
    }
    void print() {
        aux = inicio;
        String s = "";
        while (aux != null) {
            s = aux.valor + " ";
            System.out.print(s);
            aux = aux.siguiente;
        }
        System.out.println("");
    }
}