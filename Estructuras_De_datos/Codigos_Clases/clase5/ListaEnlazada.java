public class ListaEnlazada {
    Nodo nodoFrist;

    ListaEnlazada(int date){
        this.nodoFrist = new Nodo(date);
    }

    void añadir_datos(int date){
        Nodo nodo =  new Nodo(date);
        Nodo ptr = this.nodoFrist;
        while (ptr.ptr != null) {
            ptr = ptr.ptr;
        }
        ptr.ptr = nodo;
    }

    void mostrar_datos(){
        Nodo ptr = this.nodoFrist;
        while (ptr != null) {
            System.out.print(ptr.date+" ---> ");
            ptr=ptr.ptr;
        }
        System.out.println("null");

    }
    
}