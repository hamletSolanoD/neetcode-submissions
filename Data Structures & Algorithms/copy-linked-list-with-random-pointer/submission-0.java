/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        HashMap<Node, Node> indexOfNodes = new HashMap<>();

        Node pointer = head;
        while(pointer != null){
            indexOfNodes.put(pointer, new Node(pointer.val));
            pointer = pointer.next;
        }

        Node nL = null;

        Node prev = null;
        Node sP = head;
        while(sP != null){
            Node nNode = indexOfNodes.get(sP);
            if(prev != null){
                prev.next = nNode; 
            }
            if(sP == head)
            {
                nL = nNode;
            }
            nNode.random = indexOfNodes.get(sP.random);

           prev = nNode;
           sP = sP.next;
        }
        
    return nL;
        
    }
}
