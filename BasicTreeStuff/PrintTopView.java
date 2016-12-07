/*
   class Node 
       int data;
       Node left;
       Node right;
*/
void top_view(Node root)
{
  if(root==null){
      return;
  }

    left(root.left);
    System.out.print(root.data+" ");
    right(root.right);
    
}
void right(Node root){
    if (root==null){
        return;
    }
    System.out.print(root.data+" ");
    right(root.right);
}

void left(Node root){
    if(root==null){
        return;
    }
    left(root.left);
    System.out.print(root.data+" ");
}
