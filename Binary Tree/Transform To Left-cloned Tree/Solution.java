// Time  : 
// Space : 

public static Node createLeftCloneTree(Node node){
    // write your code here
    if (node == null) {
      return null;
    }

    Node leftcloned = createLeftCloneTree(node.left);
    Node rightcloned = createLeftCloneTree(node.right);

    node.left = new Node(node.data, leftcloned, null);
    node.right = rightcloned;

    return node;
  }
