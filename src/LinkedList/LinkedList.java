package LinkedList;

public class LinkedList<T> {
    Node<T> first;
    Integer size;

    public LinkedList(){
        first = null;
        size = 0;
    }

    public LinkedList(T val){
        first = new Node<T>(val);
        size = 1;
    }

    public Node<T> getFirst(){
        return first;
    }

    public T getFirstValue(){
        return first.data;
    }

    public Integer getSize(){
        return size;
    }

    public Boolean isEmppty() {
        return first==null;
    }

    public void addFirst(T value){
        Node<T> newNode = new Node<T>(value);
        if(first == null){
            first = newNode;
            size++;
        } else{
            Node<T> head = first;
            first = newNode;
            first.next = head;
        }
        size++;
    }

    public void addLast(T value){
        Node<T> newNode = new Node<T>(value);
        if(first==null){
            first = newNode;
            size++;
        }else{
            Node<T> tail = first;
            while(tail.next != null){
                tail = tail.next;
            }
            tail.next = newNode;
            size++;
        }
    }

    public Node<T> removeFirst() {
        if(first==null){
            System.out.println("Can't remove node LinkedList is empty");
        }
        Node<T> res;
        res = first;
        first = first.next;
        size--;
        return res;
    }

    public Node<T> removeLast(){
        Node<T> res=null;
        if(first==null){
            System.out.println("Can't remove node LinkedList is empty");
        } else if(first.next == null){
            res = first;
            first = null;
        } else {
            Node<T> secondLast = first;
            while(secondLast.next.next != null){
                secondLast = secondLast.next;
            }
            res = secondLast.next;
            secondLast.next = null;
        }
        size--;
        return res;
    }

    public String toString() {
        StringBuilder res = new StringBuilder();
        if (getSize() == 0) {
            return "LinkedList is empty";
        } else {
            res.append("LinkedList has ").append(size).append(" items:\n");
        }
        Node<T> currNode = first;
        while (currNode != null) {
            res.append(currNode.data).append("\n");
            currNode = currNode.next;
        }

        return res.toString();
    }
}
