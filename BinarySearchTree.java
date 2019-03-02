public class BinarySearchTree
{
    //declare variables
    Node root;

    //constructor
    public BinarySearchTree()
    {
        root = null;
    }

    //insert wrapper method for insert recursion method
    public void insert(String key)
    {
        root = insertRec(root, key);
    }

    //insert method
    public Node insertRec(Node root, String key)
    {
        //if root is empty set key as the root
        if(root == null)
        {
            //create new node for root
            root = new Node(key);
            return root;
        }

        //if statements to check if the next node should go the the right or left of the rooot
        if(key.compareTo(root.toString()) == -1)
        {
            //recursion to check if entry should go to the left subtree of the root
            root.setLeft(insertRec(root.getLeft(), key));
        }
        else if(key.compareTo(root.toString()) == 1)
        {
            //recursion to check if the entry should go to the right subtree of the root
            root.setRight(insertRec(root.getRight(), key));
        }

        //return the root
        return root;
    }

    //method to search for entries in the tree
    public String search(String key)
    {
        return root == null ? null : root.getKey(key);
    }

    //method to print the tree in Post order traversal
    public void printPostOrder(Node node)
    {
        //returns if there is nothing
        if(node == null)
            return;

        //recursion to get the left node
        printPostOrder(node.getLeft());

        //recursion to print the right node
        printPostOrder(node.getRight());

        //prints the current node
        System.out.print(node.getKey("") + ", ");
    }

    //methos to print the tree in In order traversal
    public void printInOrder(Node node)
    {
        //returns if the root is empty
        if(node == null)
            return;

        //recursion to print the left node
        printInOrder(node.getLeft());

        //prints out the current node
        System.out.print(node.getKey("") + ", ");

        //prints out the right node
        printInOrder(node.getRight());
    }

    //method to print the tree in PreOrder traversal
    public void printPreOrder(Node node)
    {
        //returns if the node is empty
        if(node == null)
            return;

        //prints out the current node
        System.out.print(node.getKey("") + ", ");

        //recursion to print the left node
        printPreOrder(node.getLeft());

        //recursion to print the right node
        printPreOrder(node.getRight());
    }

    //wrapper methods to print the tree in the traversal orders
    public void printPostOrder()
    {
        printPostOrder(root);
    }

    public void printInOrder()
    {
        printInOrder(root);
    }

    public void printPreOrder()
    {
        printPreOrder(root);
    }
}
