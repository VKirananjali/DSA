class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
        }
}

class LinkedList{
    Node head;
    public void insert_start(int data){
        Node new_node= new Node(data);
        if(head==null){
            head=new_node;
        }
        else{
            new_node.next=head;
            head=new_node;
        }
    }
    public void insert_end(int data){
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
    public void insert_middle(int data, int pos){
         Node new_node= new Node(data);
        if(head==null){
            head=new_node;
        }
        else{
            Node temp=head;
            int current=0;
            while(temp.next != null){
                current++;
                if(current==pos){
                    break;
                }
                temp=temp.next;
            }
            new_node.next=temp.next;
            temp.next=new_node;
        }
    }
    
    public void delete_start(){
        if(head==null){
            System.out.println("no nodes present in the linked list");
        }
        else{
            head=head.next;
        }
    }
    public void delete_end(){
        if(head==null){
            System.out.println("no nodes present in the linked list");
        }
        else{
            Node current = null;
            Node temp = head;
            while(temp.next!=null){
                current=temp;
                temp=temp.next;
            }
            current.next=null;
        }
    }
    public void delete_middle(int pos){
        if(head==null){
            System.out.println("no nodes present in the linked list");
        }
        else{
            Node temp=head;
            int current=0;
            while(temp.next != null){
                current++;
                if(current==pos){
                    break;
                }
                temp=temp.next;
            }
            temp.next=temp.next.next;
        }
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
        LinkedList ll=new LinkedList();
        ll.insert_end(4);
        ll.insert_end(9);
        ll.insert_end(1);
        ll.insert_end(5);
        ll.insert_end(2);
        ll.printList();
        ll.insert_start(10);
        System.out.println("inserting 10 at start:");
        ll.printList();
        ll.insert_middle(6,3);
        System.out.println("inserting 6 at position 3 start:");
        ll.printList();
        ll.delete_end();
        System.out.println("deleting at end:");
        ll.printList();
        ll.delete_start();
        System.out.println("deleting at start:");
        ll.printList();
        ll.delete_middle(4);
        System.out.println("deleting at position 4:");
        ll.printList();
    }
}