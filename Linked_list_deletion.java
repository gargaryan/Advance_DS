public class Main
{
    Node head;
    class Node
    {
        public String name;
        public int roll;
        public Node next;
        Node(String name,int roll)
        {
            this.name=name;
            this.roll=roll;
            next=null;
        }
        public void setNext(Node next)
        {
            this.next=next;
        }
       public Node getNext()
        {
            return next;
        }
    }
        public int listlength()
        {
            int l=0;
            Node current=head;
            while(current!=null)
            {
                l++;
                current=current.getNext();
            }
            return l;
        }
        public   void insert(String name, int roll, int position)
        {
            Node newnode=new Node(name,roll);
            if(position==1)
            {
                if(head==null)
                {
                    head=newnode;
                }
                else
                {
                    newnode.next=head;
                }
            }
            else if(position>1 && position<listlength())
            {
                if(head==null)
                {
                    System.out.println("invalid input");
                }
                else
                {
                     Node previous=head;
                     int count=1;
                    while(count<position-1)
                    {
                        previous=previous.getNext();
                        count++;
                    }
                     Node current=previous.getNext();
                     newnode.setNext(current);
                     previous.setNext(newnode);
                    
                    
                }
            }
            else
            {
                if(head==null)
                {
                    head=newnode;
                }
                else
                {
                     Node current=head;
                    while(current.getNext()!=null)
                    {
                        current=current.getNext();
                    }
                    current.setNext(newnode);
                }
            }
        }
        public  void delete(int position)
        {
            int size=listlength();
            //If user position give the position and our linkedlist is empty the it will give error message.
            if(position<1 && position>size|| size==0)
            {
                System.out.println("invalid position");
            
            }
            //deletion of first element
            if(position==1)
            {
                head=head.getNext();
                
                
                
            }
            //deletion of last as well as middle element from  linked list
            else
            {
                int count=1;
                Node previous=head;
                while(count<position-1)
                {
                    previous=previous.getNext();
                    count++;
                }
                Node current=previous.getNext();
                previous.setNext(current.getNext());
                current=null;
                
            }
        }
        public  void display()
        {
              Node current=head;
            
            while(current!=null)
            {
                System.out.println(current.name);
                System.out.println(current.roll);
                current=current.getNext();
            }
        }
	public static void main(String[] args) 
	{
	    Main l1=new Main();
	    l1.insert("aryan",1,1);
	    l1.insert("ritik",2,2);
	    l1.insert("shukla",3,3);
	    l1.insert("nikhil",4,4);
	    l1.insert("saxena",5,5);
	    l1.delete(3);
	    l1.display();
	    
	}
}
