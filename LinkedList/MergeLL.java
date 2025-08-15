
import java.util.LinkedList;



public class MergeLL {

    public class Node {
        int data;
        Node next;// reference to the next node

        public Node(int data) {
            this.data = data;// initialize data
            this.next = null;// initialize next to null
        }
    }

    public static Node head;

    public Node getMid(Node head){
        Node slow=head;
        Node fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;//slow will be at the middle node
    }

    public Node merge(Node head1,Node head2){
        Node mergedLL=new Node(-1);
        Node temp=mergedLL;

        while(head1!=null && head2!=null){
            if(head1.data<head2.data){
                temp.next=head1;
                head1=head1.next;
            }else{
                temp.next=head2;
                head2=head2.next;
            }
            temp=temp.next;
        }
        while(head1!=null){
            temp.next=head1;
            head1=head1.next;
            temp=temp.next;
        }
        while(head2!=null){
            temp.next=head2;
            head2=head2.next;
            temp=temp.next;
        }
        return mergedLL.next;
    }

    public Node mergeSort(Node head){
        if(head==null || head.next==null){
            return head;
        }
        //find mid
        Node mid=getMid(head);
        //left & right MS
        Node rightHead=mid.next;
        mid.next=null;
        Node newleftHead=mergeSort(head);
        Node newrightHead=mergeSort(rightHead);

        //merge
        return merge(newleftHead,newrightHead);
    }
    
    public static void main(String[] args) {
        LinkedList ll =new LinkedList<>();
        ll.addLast(3);
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(4);
        ll.addLast(5);

        MergeLL obj=new MergeLL();
        Node head=obj.mergeSort((obj.head));
        while(head!=null){
            System.out.print(head.data+"->");
            head=head.next;
        }
    }
}
