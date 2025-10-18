class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int val) { this.val = val; }
}

public class Q84 {

    public static TreeNode insert(TreeNode root, int val) {
        TreeNode newNode = new TreeNode(val);
        if (root == null) return newNode;
        TreeNode curr = root, parent = null;
        while (curr != null) {
            parent = curr;
            if (val < curr.val) curr = curr.left;
            else curr = curr.right;
        }
        if (val < parent.val) parent.left = newNode;
        else parent.right = newNode;
        return root;
    }

    public static boolean search(TreeNode root, int val) {
        TreeNode curr = root;
        while (curr != null) {
            if (curr.val == val) return true;
            if (val < curr.val) curr = curr.left;
            else curr = curr.right;
        }
        return false;
    }

    public static TreeNode delete(TreeNode root, int val) {
        if (root == null) return null;
        TreeNode parent = null, curr = root;
        while (curr != null && curr.val != val) {
            parent = curr;
            if (val < curr.val) curr = curr.left;
            else curr = curr.right;
        }
        if (curr == null) return root;
        if (curr.left == null || curr.right == null) {
            TreeNode child = (curr.left != null) ? curr.left : curr.right;
            if (parent == null) return child;
            if (parent.left == curr) parent.left = child;
            else parent.right = child;
        } else {
            TreeNode successor = curr.right;
            TreeNode succParent = curr;
            while (successor.left != null) {
                succParent = successor;
                successor = successor.left;
            }
            curr.val = successor.val;
            if (succParent.left == successor) succParent.left = successor.right;
            else succParent.right = successor.right;
        }
        return root;
    }

    public static void inorder(TreeNode root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        TreeNode root = null;
        root = insert(root, 8);
        root = insert(root, 3);
        root = insert(root, 10);
        root = insert(root, 1);
        root = insert(root, 6);
        root = insert(root, 14);
        root = insert(root, 4);
        root = insert(root, 7);
        root = insert(root, 13);

        System.out.print("Inorder: ");
        inorder(root);
        System.out.println("\nSearch 6: " + search(root, 6));
        root = delete(root, 10);
        System.out.print("After deleting 10: ");
        inorder(root);
    }
}