/* Structure of Tree Node
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}*/

class Solution {
    public ArrayList<Integer> preOrder(Node root) {
        //  code here
        ArrayList<Integer> ans=new ArrayList<>();
        preorder(root,ans);
        return ans;
    }
    public void preorder(Node nood,ArrayList<Integer> ans){
        if(nood==null)return;
        
        ans.add(nood.data);
        preorder(nood.left,ans);
        preorder(nood.right,ans);
    }
}