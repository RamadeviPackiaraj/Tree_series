class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> res=new ArrayList<>();
        postOrderHelper(root,res);
        return res;
    }
    public void postOrderHelper(TreeNode root, List<Integer> res){
        if(root==null) return;
        postOrderHelper(root.left,res);
        postOrderHelper(root.right,res);
        res.add(root.val);
    }
}