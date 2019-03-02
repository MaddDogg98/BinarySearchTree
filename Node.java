public class Node
{
    //declare variables
    String key;
    Node left, right;

    //Constructor method
    public Node(String entry)
    {
        key = entry;
        left = right = null;
    }

    //method to retrieve the left node
    public Node getLeft()
    {
        return left;
    }

    //method to retrieve the right method
    public Node getRight()
    {
        return right;
    }

    //method to retrive the current node as well as search for the current node
    public String getKey(String entry)
    {
        if(this.key.equals(key))
        {
            return key;
        }

        if(entry.compareTo(this.key) < 0)
        {
            return left == null ? null : left.getKey(entry);
        }
        else
        {
            return right == null ? null : right.getKey(entry);
        }
    }

    //method to set the left node
    public void setLeft(Node left)
    {
        this.left = left;
    }

    //method to set the right node
    public void setRight(Node right)
    {
        this.right = right;
    }
}
