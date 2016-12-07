 /* Node is defined as :
 class Node 
    int data;
    Node left;
    Node right;
    
    */

static Node Insert(Node root,int value)
    {
        if(root==null){
            return null;
        }
        insert_val(root, value);
        return root;
    }

static void insert_val(Node root, int value){
         if(root==null){
            return ;
        }
    
        if(value>root.data&& root.right!=null){
            insert_val(root.right, value);
        }
        else if(value<root.data && root.left!=null){
            insert_val(root.left,value);
        }
        else if(value> root.data && root.right ==null){
           Node n= new Node();
           n.data=value;
           root.right=n;
           return;
        }
        else if(value <root.data && root.left==null){
           Node n= new Node();
           n.data=value;
           root.left=n;
           return;
        }
        else{
            return;
        }
}
