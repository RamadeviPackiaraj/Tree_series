class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
     List<Integer> res=new ArrayList<>();
     inorderhelper(root,res);
     return res;
    }
    public void inorderhelper(TreeNode root,List<Integer> res){
        if(root==null){
            return;
        }
        inorderhelper(root.left,res);
        res.add(root.val);
        inorderhelper(root.right,res);
    }
}