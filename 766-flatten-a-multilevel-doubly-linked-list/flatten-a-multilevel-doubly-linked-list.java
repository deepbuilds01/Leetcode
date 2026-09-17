/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {

        if(head == null){
            return null;
        }
        Node move = head;
        while(move!=null){
            if(move.child==null){
                move = move.next;
            }else{
                Node movenext = move.next;
                Node movechild = move.child;
                move.next = movechild;
                movechild.prev = move;
                move.child = null;
                while(movechild.next!=null){
                    movechild = movechild.next;
                }
                movechild.next = movenext;
                if(movenext != null){
                    movenext.prev = movechild;
                }
            }
        }
        return head;
    }
}