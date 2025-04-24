package F2.Lab01;

public class Node<T extends Comparable<T>> implements Comparable<T>{
    private T dato;
    private Node<T> next;

    public Node(T dato) {
        this.dato = dato;
        this.next = null;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }
    public T getDato() {
        return dato;
    }
    public void setNext(Node<T> next){
        this.next = next;
    }
    public Node<T> getNext(){
        return next;
    }

    public int compareTo(T otroDato){
        return dato.compareTo(otroDato);
    }
}