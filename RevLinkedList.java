class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
        }
}

class RevLinkedList{
    Node head;

    public void insert(int data){
        Node new_node= new Node(data);
        if(head==null){
            head=new_node;
        }
        else{
            Node temp = head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=new_node;
        }
    }
    
    public void reversList(){
        Node pre=null;
        Node cur=head;
        Node temp=head;
        while(temp!=null){
            temp=temp.next;
            cur.next=pre;
            pre=cur;
            cur=temp;
        }
        head=pre;
    }

    public void printList(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    
    public static void main(String args[]){
        RevLinkedList ll=new RevLinkedList();
        ll.insert(3);
        ll.insert(7);
        ll.insert(1);
        ll.insert(4);
        ll.insert(8);
        System.out.println("Origial list:");
        ll.printList();
        ll.reversList();
        System.out.println("Reversed list:");
        ll.printList();
    }
}