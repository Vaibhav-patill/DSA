
public class Linkedlist {

    public class Node {
        int data;
        Node next;// reference to the next node

        public Node(int data) {
            this.data = data;// initialize data
            this.next = null;// initialize next to null
        }
    }

    public static Node head;// head of the linked list
    public static Node tail;// tail of the linked list
    public static int size;

    // methods
    public void addFirst(int data) {
        // step1=create a new node
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode; // if list is empty, head and tail point to new node
            return; // exit
        }

        // step2 = newnode next=head
        newNode.next = head; // link
        // step3 = head=newnode
        head = newNode; // update head to new node
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode; // if list is empty, head and tail point to new node
            return; // exit
        }

        // step1 = tail next=newnode
        tail.next = newNode; // link
        // step2 = tail=newnode
        tail = newNode; // update tail to new node
    }

    public void print() {
        if (head == null) {
            System.out.println("List is empty");
            return; // exit
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next; // move to the next node
        }
        System.out.println("null");
    }

    public void addMiddle(int idx, int data) {
        if (idx == 0) {
            addFirst(data);
            return; // exit
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;

        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }

        // when -=idx-1; temp->prev
        newNode.next = temp.next;
        temp.next = newNode; // link the new node to the next node
    }

    public int removeFirst() {
        if (head == null) {
            System.out.println("List is empty");
            return -1;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null; // if only one node, set head and tail to null
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast() {
        if (size == 0) {
            System.out.println("List is empty");
            return -1;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null; // if only one node, set head and tail to null
            size = 0;
            return val;
        }
        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next; // move to the second last node
        }
        int val = prev.next.data; // get the data of the last node
        prev.next = null; // set the next of the second last node to null
        tail = prev; // update tail to the second last nod
        size--;
        return val;
    }

    public int search(int key) {
        Node temp = head;
        int i = 0;
        while (temp != null) {
            if (temp.data == key) {
                return i;
            }
            temp = temp.next;
            i++;
        }

        return -1; // if key not found, return -1

    }

    public int helper(Node head,int key){
        if(head == null){
            return -1;
        }
        if(head.data == key){
            return 0; // found at current position
        }   

        int idx = helper(head.next, key); // recursive call to the next node
        if(idx == -1){
            return -1; 
        }

        return idx + 1; 
    }

    public int recSearch(int key) {
        return helper(head, key);
    }

    public void reverse(){
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while(curr!=null){
            next = curr.next; // store the next node
            curr.next = prev; // reverse the link
            prev = curr; // move prev to current
            curr = next; // move to the next node
        }
        head = prev; // update head to the last node
    }

    public void removeNthFromEnd(int n){
        int size = 0;
        Node temp = head;
        while(temp != null){
            size++;
            temp = temp.next; // count the size of the list
        }
        if(n == size){
            head = head.next; 
            return;
        }

        //size-n

        int i=1;
        int iTofind=size-n;
        Node prev = head;
        while (i < iTofind) {
            prev=prev.next;
            i++;   
        }

        prev.next=prev.next.next;
        return;
    }
//slow and fast pointer approach to find the middle of the linked list
    public Node findMid(Node head) {
        if (head == null || head.next == null) {
            return head; // if list is empty or has one node, return head
        }
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next; // move slow by 1 step
            fast = fast.next.next; // move fast by 2 steps
        }
        return slow; // slow will be at the middle node
    }

    public boolean checkPalindrome(){
        if (head == null || head.next == null) {
            return true; 
        }
        Node mid=findMid(head);
        Node prev = null;
        Node curr = mid;
        Node next;
        while (curr != null) {
            next = curr.next; // store the next node
            curr.next = prev; // reverse the link
            prev = curr; // move prev to current
            curr = next; // move to the next node
        }
        Node left = head;
        Node right = prev; // right is the reversed second half
        while (right != null) {
            if (left.data != right.data) {
                return false; // if data doesn't match, not a palindrome
            }
            left = left.next; // move left pointer
            right = right.next; // move right pointer
        }
        return true; // if all data matches, it is a palindrome

    }




    public void zigzag(){
        //find mid
        Node slow=head;
        Node fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        Node mid=slow;//slow will be at the middle node
        //reverse second half
        Node curr=mid.next;
         mid.next=null;
        Node prev=null;
        Node next;

        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }

        Node left =head;
        Node right =prev;
        Node nextL,nextR;

        //alternate merge
        while(left!=null && right!=null){
            nextL=left.next;
            nextR=right.next;
            left.next=right;
            right.next=nextL;
            left=nextL;
            right=nextR;
        }

    }


 

    public static void main(String[] args) {
        Linkedlist ll = new Linkedlist();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addMiddle(2, 5);
        ll.print();
        System.out.println(ll.size);

        ll.removeFirst();
        ll.print();
        ll.removeLast();
        ll.print();
        System.err.println("Search for 3: " + ll.search(3));
        System.err.println("Search for 5: " + ll.search(10));
        ll.reverse();
        ll.print();

    }
}
