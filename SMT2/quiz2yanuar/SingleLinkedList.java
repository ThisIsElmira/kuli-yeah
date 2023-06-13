package quiz2yanuar;

public class SingleLinkedList
{
    Node head, tail;
    int size;
    
    SingleLinkedList(){
        head = tail = null;
        size=0;
    }
    boolean isEmpty(){
        return size==0;
    }
    void addFirst(int data){
        Node nu = new Node(data);
        if(isEmpty()){
            head = tail = nu;
        }else{
            nu.n = head;
            head = nu;
        }
        size++;
    } 
    void deleteFirst(){
        Node tmp = head.n;
        head = head.n;
        tmp = null;
        size--;
    }
    void print(){
        Node tmp = head;
        while(tmp!=null){
            System.out.print(""+tmp.data+" ");
            tmp = tmp.n;
        }
        System.out.println("");
    } 
    //1.A. complete the missing code addLast
    /**
     * this method will add new node at the last
     */
    void addLast(int data){
        Node nu = new Node(data);
        if(isEmpty()){
            head = tail = nu;
        }else{
            Node current = head;
            while (current.n != null) current = current.n;
            Node newNode = new Node(current, data, null);
            current.n = newNode;
            size++;
        }
    }

    void deleteLast(){
        if (isEmpty()) System.out.println("Linked list is still empty");
        else if (head.n == null)
        {
            head = null; //this will make the head become null since we wanted to remove the head
            size--; //this will reduce the size of the linked list
            return;
        }
        Node current = head; //this will make temporary data
        while (current.n.n != null) current = current.n; //this will check whether the next and next of the current data is null or not, if yes then it will continue to the next current
        current.n = null; //this will make the next of current data become null
        size--; //this will reduce the size of the linked list
    }
}
