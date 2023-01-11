// Time  : O(n)
// Space : O(1)

import java.io.*;
import java.util.*;

public class Main {
  private static class Node {
    int data;
    ArrayList<Node> children = new ArrayList<>();
  }

  public static void display(Node node) {
    String str = node.data + " -> ";
    for (Node child : node.children) {
      str += child.data + ", ";
    }
    str += ".";
    System.out.println(str);

    for (Node child : node.children) {
      display(child);
    }
  }

  public static Node construct(int[] arr) {
    Node root = null;

    Stack<Node> st = new Stack<>();
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == -1) {
        st.pop();
      } else {
        Node t = new Node();
        t.data = arr[i];

        if (st.size() > 0) {
          st.peek().children.add(t);
        } else {
          root = t;
        }

        st.push(t);
      }
    }

    return root;
  }

// size = 0;
  public static int size(Node node){
    
      int tree_size = 0;
      for(Node child: node.children){
        int child_size = size(child);
        tree_size += child_size;
      }
      return tree_size+1;
    
//       if(node != null){
//         size++;
//       }
//       for(Node child: node.children){
//         size(child);
//       }

//       return size;
  }

  public static int max(Node node){
    // write your code here
    int maxNode = Integer.MIN_VALUE;
    maxNode = Math.max(maxNode, node.data);
    for(Node child: node.children){
        maxNode = Math.max(maxNode, max(child));
    }
    return maxNode;
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int[] arr = new int[n];
    String[] values = br.readLine().split(" ");
    for (int i = 0; i < n; i++) {
      arr[i] = Integer.parseInt(values[i]);
    }

    Node root = construct(arr);
    int maxNode = max(root);
    System.out.println(maxNode);
    // display(root);
  }

}
