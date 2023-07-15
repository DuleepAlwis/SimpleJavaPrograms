import javax.sound.sampled.Line;

public class InterviewLinkedList {

    public static void main(String [] args){
        String [] arr = new String[]{"aaa","bbb","ccc","ddd","eee","fff","ggg"};
        LinkedList ll = new LinkedList();
        for(String str:arr){
            ll.insert(str);
        }
        ll.printLinkedList();
        ll.delete("ddd");
        ll.delete("ggg");
        ll.delete("aaa");
        ll.printLinkedList();
    }
}


class LinkedList{

    Node head;

    public void insert(String val){
        if(head==null){
            Node n = new Node();
            n.val = val;
            head = n;
            System.out.printf("%s Value inserted\n",val);

        }else{
            Node curr = head;
            while(curr.next!=null){
                curr = curr.next;
            }
            Node n = new Node();
            n.val = val;
            curr.next = n;
            System.out.printf("%s Value inserted\n",val);
        }
    }

    public void delete(String val){
        Node prev = null;
        if(head!=null && head.val.equalsIgnoreCase(val)){
            head = head.next;
            System.out.printf("%s values deleted from the linked list\n",val);
            return;
        }else{
            Node curr = head;
            while(curr!=null){
                if(curr.val.equalsIgnoreCase(val)){
                    prev.next = curr.next;
                    System.out.printf("%s values deleted from the linked list\n",val);
                    return;
                }else{
                    prev = curr;
                    curr = curr.next;
                }
            }
        }

        System.out.printf("%s value not found\n",val);
    }

    public void printLinkedList(){
        Node curr = head;
        while(curr!=null){
            System.out.printf("Values is - %s\n",curr.val);
            curr = curr.next;
        }
        System.out.println("====================================");
    }
}


class Node{
    String val;
    Node next;

    public Node(){}

}