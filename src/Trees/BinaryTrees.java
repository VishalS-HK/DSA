package Trees;

import com.sun.source.tree.Tree;

public class BinaryTrees {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {
        static int index = -1;
        public static Node buildTree(int[] nodes) {
            index++;
            if(nodes[index] == -1){
                return null;
            }
            Node newNode = new Node(nodes[index]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }
    }

    public static void preOrder(Node root){
        if(root == null)
            return;
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);

    }

    public static void inOrder(Node root){
        if(root == null)
            return;
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public static void postOrder(Node root){
        if(root == null)
            return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }

    public static int countNode(Node root){
        if(root == null)
            return 0;
        int leftNodes = countNode(root.left);
        int rightNodes = countNode(root.right);

        return leftNodes + rightNodes + 1;
    }

    public static int sumOfNodes(Node root) {
        if(root == null)
            return 0;
        int leftSum = sumOfNodes(root.left);
        int rightSum = sumOfNodes(root.right);

        return leftSum + rightSum + root.data;
    }

    public static int height(Node root){
        if(root == null)
            return 0;
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        return Math.max(leftHeight, rightHeight) + 1;
    }

    // Diameter of a trees: Approach 1 [O(n^2)]
//    public static int diameter(Node root){
//        if(root == null)
//            return 0;
//        int dia1 = diameter(root.left);
//        int dia2 = diameter(root.right);
//        int dia3 = height(root.left) + height(root.right) + 1;
//
//        return Math.max(dia3, Math.max(dia1, dia2));
//    }

    static class TreeInfo{
        int ht;
        int dia;
        TreeInfo(int ht, int dia){
            this.ht = ht;
            this.dia = dia;
        }
    }
    public static TreeInfo diameter(Node root) {
        if(root == null){
            return new TreeInfo(0, 0);
        }
        TreeInfo left = diameter(root.left);
        TreeInfo right = diameter(root.right);

        int height = Math.max(left.ht, right.ht) + 1;

        int dia1 = left.dia;
        int dia2 = right.dia;
        int dia3 = left.ht + right.ht + 1;

        int diameter = Math.max(dia3, Math.max(dia1, dia2));

        TreeInfo info = new TreeInfo(height, diameter);
        return info;
    }
    public static void main(String[] args){

        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
//        System.out.println(root.data);
        System.out.print("Preorder Traversal : ");
        preOrder(root);
        System.out.print("\nInorder Traversal : ");
        inOrder(root);
        System.out.print("\nPostorder Traversal : ");
        postOrder(root);
        System.out.print("\nNumber of nodes : " + countNode(root));
        System.out.print("\nSum of nodes : " + sumOfNodes(root));
        System.out.print("\nHeight of the tree : " + height(root));
        System.out.print("\nDiameter of the tree : " + diameter(root).dia);
    }
}