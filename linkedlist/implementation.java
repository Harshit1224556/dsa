public class implementation {
    
    
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static  class linkedlists{
        Node head  = null;
        Node tail = null;
        void insertatend(int val){
           Node temp = new Node(val);
           if(head==null){
            head = temp;
            tail = temp;
           }
           else{
           tail.next = temp;
           tail = temp;
          
           }
            temp = tail;
        }

        void insertathead(int val){
            Node temp = new Node(val);
            if(head==null){
                 
                head = temp;
                tail = temp;
            }
            else{
                temp.next= head;
                head = temp;
            }
        }
   
       void display(){
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
       }

    }
    
    
    
    
    public static void main(String[] args) {
        

 linkedlists ll = new linkedlists();

ll.insertatend(10);
ll.insertatend(20);
ll.insertatend(30);
ll.insertatend(40);
ll.insertatend(50);

ll.insertathead(60);
ll.display();





    }
}
