package Assignment10;

public class SListIterator<T> extends SList{
    public void insert(Node<T> node) {

       if(head == null){
           head = node;
       }
       else {
           Node t = head;
           while(t.getNext()!=null)
               t = t.getNext();
           t.setNext(node);
       }
    }

    public void remove(){
        Node t = head;
        if(head.getNext()==null)
            head=null;
        else {
            while (t.getNext().getNext()!= null)
                t = t.getNext();
            t.setNext(null);
        }
    }

    private void printList(Node<T> node) {
        System.out.println("Node is " + node.getValue());
        if(node.getNext()!=null) printList(node.getNext());
    }
    public void ToString(){

        System.out.println("Printing list");
        printList(head);
    }

}
