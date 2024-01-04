class node{
    int data;
    node next;
    node(int data){
        this.data=data;
        this.next=next;
    }
}
class linklist{
    node head;
    linklist(){
        this.head=null;
    }
    void add(int data){
        node newnode=new node(data);
        if(head==null){
            head=newnode;
            return;
        }
        else{
            node current=head;
            while(current.next!=null){
                 current=current.next;
            }
            current=newnode;
        }
        System.out.println(newnode +"added");
    }
    void delete(int data){
        if(head==null){
            System.out.println("empty to delete:");
            return ;
        }
        
        if(head.data==data){
        head=head.next;
        return;        
            }
            node current=head;
            node prev=null;
            while(current.next!=null && current.data==data){
                    prev=current;
                    current=current.next;
            }
            if (current != null) {
        prev.next = current.next;
    }
        }
    
}

public class SLL_inheritense {
    
}
