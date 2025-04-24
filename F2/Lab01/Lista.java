package F2.Lab01;

public class Lista<T extends Comparable<T>>{
    private Node<T> first;

    public Lista(){
        this.first = null;
    }

    public boolean isEmptyList() {
        if(first == null){
            return true;
        }
        return false;
    }
    public int length(){
        if(isEmptyList()){
            return 0;
        } else {
            int cont = 0;
            Node<T> actual = first;
            while(actual.getNext() != null){
                actual = actual.getNext();
                cont++;
            }
            return cont;
        }
    }
    public void destroyList(){
        first = null;
    }
    public int search(T dato){
        if(isEmptyList()){
            return -1;
        } else{
            int cont = 0;
            Node<T> actual = first;
            while(actual.getNext() != null){
                if(actual.getDato().equals(dato)){
                    return cont;
                }
                cont++;
            }
            return -1;
        }
    }
    public void insertFirst(T dato){
        if(isEmptyList()){
            first = new Node<>(dato);
        } else {
            Node<T> nuevoNodo = new Node<>(dato);
            nuevoNodo.setNext(first);
            first = nuevoNodo;
        }
    }
    public void insertLast(T dato){
        if(isEmptyList()){
            first = new Node<>(dato);
        } else {
            Node<T> nuevoNodo = new Node<>(dato);
            Node<T> actual = first;
            while(actual.getNext() != null){
                actual = actual.getNext();
            }
            actual.setNext(nuevoNodo);
        }
    }
    public void insertarOrdenado(T dato){
        if(isEmptyList()){
            first = new Node<>(dato);
        } else {
            Node<T> actual = first;
            while(actual.getNext() != null){
                if(actual.getDato().compareTo(dato) == 1){
                    Node<T> nuevoNodo = new Node<>(dato);
                    nuevoNodo.setNext(actual);
                    actual = nuevoNodo;
                }
                if(actual.getDato().compareTo(dato) == 0 || ){
                    Node<T> nuevoNodo = new Node<>(dato);
                    nuevoNodo.setNext(actual.getNext());
                    actual.setNext(nuevoNodo);
                }
                if(actual.getDato().compareTo(dato) == -1){
                    Node<T> nuevoNodo = new Node<>(dato);

                }
            }
        }
    }
    public void removeNode(T dato){
        if(isEmptyList()){
            System.out.println("Lista vacía.");
        } 
        if(first.getDato().equals(dato)){
            first = first.getNext();
        } else {
            Node<T> actual = first;
            while(actual.getNext() != null){
                if(actual.getDato().equals(dato)){
                    actual = actual.getNext();
                }
            }
        }
    }
}
