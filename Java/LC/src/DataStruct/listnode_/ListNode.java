package DataStruct.listnode_;

public class ListNode {
    private int data;
    private ListNode next;
    public ListNode(int data){
        this.data = data;
    }
    public void setData(int data){
        this.data = data;
    }
    public int getData(){
        return data;
    }
    public void setNext(ListNode next){
        this.next = next;
    }
    public ListNode getNext(){
        return this.next;
    }
    int ListLength(ListNode headNode){
        //时间复杂度为O(n),空间复杂度为O(1)
        int length=0;
         ListNode currentNode = headNode;
        while(currentNode!= null){
            length++;
            currentNode = currentNode.next;
        }
        return length;
    }
    ListNode InsertInLinkedList(ListNode headNode,ListNode nodeToInsert,int position){
        if(headNode == null)
            return nodeToInsert;
        int size=ListLength(headNode);
        if(position>size+1||position<1){
            System.out.println("Cannt Insert");
            return headNode;
        }
        if(position == 1){
            nodeToInsert.next=headNode.next;
            headNode.next=nodeToInsert;
        }
        else{
            ListNode previousNode= headNode;
            for (int i = 0; i < position; i++) {
                previousNode =previousNode.getNext();
            }
            ListNode currentNode = previousNode.getNext();
            nodeToInsert.next=currentNode;
            previousNode.next = nodeToInsert;

        }
        return headNode;



    }
}
