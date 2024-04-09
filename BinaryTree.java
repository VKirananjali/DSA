import java.util.*;

class ListNode{

    int data;
 
    ListNode next;

    ListNode(int data){

        this.data=data;

        next=null;

    }

}

class BinaryTreeNode{

    int data;

    BinaryTreeNode left,right;

    BinaryTreeNode(int data){

        this.data=data;

        left=right=null;

    }

}

class BinaryTree{

    BinaryTreeNode root;

    ListNode head;

    void push(int data){

        ListNode newNode=new ListNode(data);

        newNode.next=head;

        head=newNode;

    }

    BinaryTreeNode convertList2Tree(BinaryTreeNode node){

        Queue <BinaryTreeNode> q=new LinkedList<BinaryTreeNode>();

        if(head==null){

            node=null;

            return null;

        }

        node=new BinaryTreeNode(head.data);

        q.add(node);

        head=head.next;

        while(head!=null){

            BinaryTreeNode parent=q.peek();

            BinaryTreeNode leftChild, rightChild =null;

            leftChild=new BinaryTreeNode(head.data);

            q.add(leftChild);

            head=head.next;

            if(head!=null){

                rightChild=new BinaryTreeNode(head.data);

                q.add(rightChild);

                head=head.next;

            }

            
            parent.left=leftChild;

            parent.right=rightChild;

            q.poll();

        }

        return node;

    }

    void inorder(BinaryTreeNode node){

      if(node!=null){

        inorder(node.left);

        System.out.print(node.data+" ");

        inorder(node.right);

    
      }

    }

    void preOrder(BinaryTreeNode node){
        if(node!=null){
            System.out.print(node.data+" ");
            preOrder(node.left);
            preOrder(node.right);
        }
    }

    void postOrder(BinaryTreeNode node){
        if(node!=null){
            postOrder(node.left);
            postOrder(node.right);
            System.out.print(node.data+" ");
        }
    }

    public static void main(String args[]){

        BinaryTree b=new BinaryTree();

        b.push(12);

        b.push(6);

        b.push(14);

        b.push(25);

        b.push(2);

        b.push(18);

        b.push(31);

        b.root=b.convertList2Tree(b.root);

        System.out.println("inorder transversal:");

        b.inorder(b.root);
        System.out.println();
        System.out.println("preorder transversal:");


        b.preOrder(b.root);
        System.out.println();
        System.out.println("postorder transversal:");

        b.postOrder(b.root);
    }

}