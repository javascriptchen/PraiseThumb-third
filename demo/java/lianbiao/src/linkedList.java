

/**
 * Created by Administrator on 2018/5/29.
 */
public class LinkedList<E> {
    private class Node{
        public E e;
        public Node next;

        public Node(E e , Node next){
            this.e = e;
            this.next = next;
        }

        public Node(E e){
            this(e,null);
        }

        public Node(){
            this(null,null);
        }

        @Override
        public String toString(){
            return e.toString();
        }
    }

    private Node dummyHead;
    private int size;

    public LinkedList(){
        dummyHead = new Node(null,null);
        size = 0;
    }

    public int getSize(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }



    public void add(int index, E e){
        if(index < 0 || index > size){
            throw new IllegalArgumentException("err");
        }


        Node prev = dummyHead;
        for (int i = 0; i < index; i++){
            prev = prev.next;
        }

//            Node node = new Node(e);
//            node.next = prev.next;
//            prev.next = node;
        prev.next = new Node(e,prev.next);

        size++;

    }

    public void addLast(E e){
        add(size, e);
    }

    public void addFirst(E e){
        add(0, e);
    }
}
