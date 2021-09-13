import java.util.Arrays;
import java.util.LinkedList;

public class Tree {
    /**
     * 构建二叉树
     * @param inputList 输入序列
     */
    public static TreeNode createBinaryTree(LinkedList<Integer>inputList){
        TreeNode node = null;
        if(inputList == null || inputList.isEmpty()){
            return null;
        }
        Integer data = inputList.removeFirst();
        if(data != null){
            node = new TreeNode(data);
            node.left = createBinaryTree(inputList);
            node.right = createBinaryTree(inputList);
        }
        return node;
    }

    /**
     * 前序遍历
     * @param node 二叉树节点
     */
    public static void preOrderTraversal(TreeNode node){
        if(node == null){
            return;
        }
        System.out.println(node.data);
        preOrderTraversal(node.left);
        preOrderTraversal(node.right);
        return;
    }
    /**
     * 中序遍历
     * @param node 二叉树节点
     */
    public static void inOrderTraversal(TreeNode node){
        if(node == null){
            return;
        }
        preOrderTraversal(node.left);
        System.out.println(node.data);
        preOrderTraversal(node.right);
        return;
    }
    /**
     * 后序遍历
     * @param node 二叉树节点
     */
    public static void lastOrderTraversal(TreeNode node){
        if(node == null){
            return;
        }
        preOrderTraversal(node.left);
        preOrderTraversal(node.right);
        System.out.println(node.data);
    }
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>(Arrays.asList(new Integer[]{3, 2, 9, null, null, 10, null, null, 8, null, 4}));
        TreeNode treenode = createBinaryTree(linkedList);
        System.out.println("前序遍历");
        preOrderTraversal(treenode);
        System.out.println("中序遍历");
        inOrderTraversal(treenode);
        System.out.println("后序遍历");
        lastOrderTraversal(treenode);
    }
}
class TreeNode{
    int data;
    TreeNode left;
    TreeNode right;
    TreeNode(int data){
        this.data = data;
    }
}
