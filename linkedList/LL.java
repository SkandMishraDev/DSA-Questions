public class LL {
    Node head;
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data=data;
            this.next=null;
        }
    }
    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    public void addLast(String data){
        Node newNode= new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node currNode=head;
        while (currNode.next!=null){
            currNode=currNode.next;    
        }
        currNode.next=newNode;
    }
    public void printList(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        Node currNode=head;
        while(currNode!=null){
            System.out.print(currNode.data+"-> ");
            currNode=currNode.next;
        }
        System.out.print("Null");
    }
    public void deleteFirst(){
        if(head==null){
            return;
        }
        if(head.next==null){
            head=null;
            return ;
        }
        head.next=head;
     }
     public void deleteLast(){
        if(head==null){
            return;
        }
        if(head.next==null){
            head=null;
            return ;
        }
        Node currNode=head.next;
        Node secondLast=head;
        while(currNode.next!=null){
            currNode=currNode.next;
            secondLast=secondLast.next;
        }
        secondLast.next=null;
     }
    public static void main(String args[]){
        LL list =new LL();
        list.addFirst("a");
        list.addFirst("is");
        list.addLast("list");
        list.addFirst("this");
        list.printList();
    }
    
}
