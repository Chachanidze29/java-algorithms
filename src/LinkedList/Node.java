package LinkedList;

public class Node<T> {
    T data;
    Node<T> next=null;
    public Node(T data){
        this.data = data;
    }

    public String toString(){
        return "Value "+this.data;
    }
}
