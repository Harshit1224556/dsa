
public class basicll {


    public static void display(Node head){

        Node temp = head;
        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }

    }


       public static class Node{
            int data;
            Node next;
            Node(int data){
                this.data = data;
            }
        }

    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;

        // System.out.println(a.data);
        // System.out.println(a.next.data);
        // System.out.println(a.next.next.data);
        // System.out.println(a.next.next.next.data);
        // System.out.println(a.next.next.next.next.data);

        //display a linkedlist using loop rather than printing manually only head is given with you 

        // while(a!=null){
        //     System.out.println(a.data);
        //     a=a.next;
        // }


        //lets do it by making functions

        //just make a function and what we have to do just track it by 
        display(a);
    }
}
