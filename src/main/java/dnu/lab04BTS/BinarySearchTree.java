package dnu.lab04BTS;

public class BinarySearchTree {

    static class Node {
        int key;
        String value;
        Node left, right;

        public Node(int key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    private Node root;

    public void insert(int key, String value) {
        root = insert(root, key, value);
    }

    private Node insert(Node root, int key, String value) {
        if (root == null) {
            return new Node(key, value);
        }
        if (key < root.key) {
            root.left = insert(root.left, key, value);
        } else if (key > root.key) {
            root.right = insert(root.right, key, value);
        } else  {
            root.value = value;
        }
        return root;
    }

    public void delete(int key) {
        root = delete(root, key);
    }

    private Node delete(Node root, int key) {
        if (root == null) {
            return root;
        }
        if (key < root.key) {
            root.left = delete(root.left, key);
        } else if (key > root.key) {
            root.right = delete(root.right, key);
        } else {
            if (root.left == null) {
                return root.right;
            }
            if (root.right == null) {
                return root.left;
            }
            root.key = minValue(root.right);
            root.right = delete(root.right, root.key);
        }
        return root;
    }

    private int minValue(Node root) {
        int min = root.key;
        while (root.left != null) {
            min = root.left.key;
            root = root.left;
        }
        return min;
    }

    public String search(int key) {
        Node res = search(root, key);
        return res != null ? res.value : null;
    }

    private Node search(Node root, int key) {
        if (root == null || root.key == key) {
            return root;
        }
        if (key < root.key) {
            return search(root.left, key);
        }
        return search(root.right, key);
    }

    public void traverse() {
        traverse(root);
    }

    private void traverse(Node root) {
        if (root != null) {
            traverse(root.left);
            System.out.println("Key: " + root.key + ", Value: " + root.value);
            traverse(root.right);
        }
    }
    public int size() {
        return size(root);
    }

    private int size(Node node) {
        if (node == null) {
            return 0;
        }
        return 1 + size(node.left) + size(node.right);
    }
}
