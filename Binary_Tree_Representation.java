import java.util.*;
class Node{
    int data;
    Node left;
    Node right;
    public Node (int key){
        data=key;
    }
}
public class Binary_Tree_Representation{
    public static void main(String[] args){
        Node root=new Node(1);
         root.left=new Node(2);
         root.right=new Node (3);
         root.left.right=new Node(4);
        System.out.println("Root: " + root.data);
        System.out.println("Left child of root: " + root.left.data);
        System.out.println("Right child of root: " + root.right.data);
        System.out.println("Right child of Left child: " + root.left.right.data);

    }
}