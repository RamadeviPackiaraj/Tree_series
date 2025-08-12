class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
     List<Integer> res=new ArrayList<>();
     preorderhelper(root,res);
     return res;
    }
    public void preorderhelper(TreeNode root,List<Integer> res){
        if(root==null){
            return;
        }
        res.add(root.val);
        preorderhelper(root.left,res);
        preorderhelper(root.right,res);
    }
}