class Node 
{ 
    int key; 
    Node left, right; 
  
    public Node(int item) 
    { 
        key = item; 
        left = right = null; 
    } 
} 
  
class postorder 
{ 
    
    Node root; 
  
    postorder() 
    { 
        root = null; 
    } 

    void printPostorder(Node node) 
    { 
        if (node == null) 
            return; 
  
        
        printPostorder(node.left); 
  
        printPostorder(node.right); 
  
        System.out.print(node.key + " "); 
    } 
	 void printPostorder() 
	 {     printPostorder(root);  
		}

 public static void main(String[] args) 
    { 
        postorder tree = new postorder(); 
        tree.root = new Node(1); 
        tree.root.left = new Node(2); 
        tree.root.right = new Node(3); 
        tree.root.left.left = new Node(4); 
        tree.root.left.right = new Node(5); 
 System.out.println("\nPostorder of binary tree: "); 
        tree.printPostorder(); 
    } 
} 		