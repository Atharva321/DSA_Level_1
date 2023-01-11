import java.util.*;
public class MyClass {
    
    private static class Node{
          int data;
          ArrayList<Node> children = new ArrayList<>();
     }
     
    public static void display(Node node){
        String str = node.data + " -> ";
        for(Node child: node.children){
            str += child.data + ", ";
        }
        str += " .";
        
        System.out.println(str);
        
        for(Node child : node.children){
            display(child);
        }
    }
      
    public static void main(String args[]) {
        int [] genericTree = {10, 20, 50, -1, 60, -1, -1, 30, 70, -1, 80, 110, -1, 120, -1, -1, 90, -1, -1, 40, 100, -1, -1, -1}; 
        Stack<Node> st = new Stack<>();
        Node root = null;
        
        for(int i=0; i<genericTree.length; i++){
            if(genericTree[i] == -1){
                st.pop();
            }
            else{
                Node curr = new Node();
                curr.data = genericTree[i];
                
                if(st.size() > 0){
                    st.peek().children.add(curr);
                    st.push(curr);
                }
                else{
                    root = curr;
                    st.push(root);
                }
            }
        }
        display(root);
    }
}
