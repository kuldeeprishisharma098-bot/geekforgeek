/* Structure of Binary Tree Node
class Node {
    int data;
    Node left, right;
    Node(int item){
        data = item;
        left = right = null;
    }
}*/

class Solution {
    public ArrayList<Integer> inOrder(Node root) {
     ArrayList<Integer> ans=new ArrayList<>();
     inorder(root,ans);
     return ans;
    }
    public void inorder(Node node,ArrayList<Integer> ans){
        if(node==null)
        return;
        inorder(node.left,ans);
        ans.add(node.data);
        inorder(node.right,ans);
    }
    
    
}