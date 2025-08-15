public class Cycle{
    public static  class Node{
        int data;
        Node next;//reference to the next node

       public Node(int data) {
            this.data = data;//initialize data
            this.next = null;//initialize next to null 
        }
    }

    public static Node head;
    public static Node tail;

 
       public static  boolean isCycle(){
        Node slow=head;
        Node fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

            if(slow==fast){
                return true;//cycle exists
            }
        }

        return false;
    }

    public static void removeCycle(){
        Node slow=head;
        Node fast=head;
        boolean cycle=false;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

            if(fast == slow){
                cycle=true;
                break;
            }
        }

        if(cycle == false){
            return;
        }

        //find meeting point
        slow=head;
        Node prev=null;//last node
        while(slow!=fast){
            prev=fast;
            slow=slow.next;
            fast=fast.next;
        }

        //remove cycle
        prev.next=null;

    }
    public static void main(String[] args) {
        head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=head;

        System.err.println(isCycle());
        
    }
}