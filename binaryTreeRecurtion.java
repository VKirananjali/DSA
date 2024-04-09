public class binaryTreeRecurtion {

    Node root;
    public class Node{
        int key;
        Node left,right;
        Node(int key){
            this.key=key;
            left=null;
            right=null;
        }
    }
    public void insert(int key){
        root=insertRot(root,key);
    }
    public Node insertRot(Node root,int key){
        if(root==null){
            Node nroot=new Node(key);
            System.out.println("   "+key);
            return nroot;
        }
        
            if(root.left==null){
                root.left=insertRot(root.left,key);
            }
            else if(root.right==null) {
                root.right=insertRot(root.right,key);
            }
            else{
                root.left=insertRot(root.left,key);
            }
            
        return root;
    }
    public void inorder(Node root){
        if(root!=null){
        inorder(root.left);
        System.out.print(root.key+" ");
        inorder(root.right);
    }
        
    }
    public static void main(String args[]){
        binaryTreeRecurtion b=new binaryTreeRecurtion();
        b.insert(6);
        b.insert(11);
        b.insert(24);
        b.insert(9);
        b.insert(15);
        b.insert(20);
        b.insert(18);

        b.inorder(b.root);
    }
}
