public class Node {
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }

    public static boolean isLoop(Node head){
        Node slow=head;
        Node fast=head.next;
        while(fast !=null && fast.next!=null){
             slow=slow.next;
             fast=fast.next.next;
             if(slow==fast){
                return true;
             }
        }
        return false;
    }

    public static Node reverseList(Node head){
        Node curr=head;
        Node prev=null;
        while(curr!=null){
            Node next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
}
