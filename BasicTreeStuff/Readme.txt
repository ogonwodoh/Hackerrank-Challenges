Here is a descripton of the challenge for printint the top view of a tree:

You are given a pointer to the root of a binary tree. Print the top view of the binary tree. 
You only have to complete the function. 
For example :

     3
   /   \
  5     2
 / \   / \
1   4 6   7
 \       /
  9     8
Top View : 1 -> 5 -> 3 -> 2 -> 7
Input Format

You are given a function,

void top_view(node * root)
{

}
Output Format

Print the values on a single line separated by space.

Sample Input

     3
   /   \
  5     2
 / \   / \
1   4 6   7
 \       /
  9     8
Sample Output

1 5 3 2 7
Explanation

     3
   /   \
  5     2
 / \   / \
1   4 6   7
 \       /
  9     8
From the top only nodes 1,5,3,2 and 7 will be visible.


Here is a description for insert into BST challenge:

You are given a pointer to the root of a binary search tree and a value to be inserted into the tree. Insert this value into its appropriate position in the binary search tree and return the root of the updated binary tree. You just have to complete the function.

Input Format

You are given a function,

node * insert (node * root ,int value)
{

}
node is defined as :

struct node
{
int data;
node * left;
node * right;
}node;
Output Format

Return the root of the binary search tree after inserting the value into the tree.

Sample Input

        4
       / \
      2   7
     / \
    1   3
The value to be inserted is 6.

Sample Output

         4
       /   \
      2     7
     / \   /
    1   3 6
