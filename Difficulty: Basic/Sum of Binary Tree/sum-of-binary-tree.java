/* Definition for Node
class Node {
    int data;
    Node left;
    Node right;
    Node(int val) {
        data = val;
        left = null;
        right = null;
    }
} */

class Solution {
    static int sumBT(Node root) {
     return root==null ?0:root.data+sumBT(root.left)+sumBT(root.right);
    }
}