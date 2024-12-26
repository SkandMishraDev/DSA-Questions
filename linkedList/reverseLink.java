package linkedList;

public class reverseLink {
    Node head;
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data=data;
            this.next=null;
        }
    }
    public void reverseIterate(String data){
        Node newNode=new Node(data);
        Node prev=head;
        Node curr=head.next;
        while(curr !=null){
            Node nextNode=curr.next;
            curr.next=prev;

            prev = curr;
            curr =nextNode;
        }
    }
    public static void main(String args[]){
        Node list = new Node();
        list.reverse
    }
    
}
