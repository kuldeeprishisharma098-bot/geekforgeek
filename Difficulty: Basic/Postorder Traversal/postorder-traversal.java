/* Structure of Binary Tree Node
class Node {
    int data;
    Node left, right;
    Node(int val){
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    public ArrayList<Integer> postOrder(Node root) {
        // code here
        ArrayList<Integer> ans=new ArrayList<>();
        postorder(root,ans);
        return ans;
    }
    public void postorder(Node node,ArrayList<Integer> ans){
        if(node==null)return ;
        postorder(node.left,ans);
        postorder(node.right,ans);
        ans.add(node.data);
    }
}