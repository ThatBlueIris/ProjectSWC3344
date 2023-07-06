/**
 * Queue Class
 *
 */
//import the LinkedList package
import java.util.LinkedList;
public class Queue
{//start class
    //Declare the object of queue 
    private LinkedList q;
    //using LinkedList
    int size = 0;
    //Constructor without parameter
    public Queue()
    {
        q = new LinkedList();
    }//end of constructor
    //method to insert an object to a queue
    public void enqueue(Object item)
    {
        q.addLast(item);
        size++;
    }//end of enqueue
    //method to remove an object from a queue
    public Object dequeue()
    {
        if (!empty())
        { 
            size--;
            return q.removeFirst(); //remove the first element (front)
        }
        else
        {
            System.out.println("Queue is empty!");
            return 0;// Return 0 handle empty queue case
        }
    }//end of dequeue
    //method to test whether the queue is empty or not
    public boolean empty() 
    {
        return (q.size() == 0);
    }//end of empty 
    //return the element at the front without removing it
    public Object front()
    {
        if (!empty())
            return q.getFirst(); //get the first element
        else
        {
            System.out.println("Queue is empty!");
            return 0;// Return 0 handle empty queue case
        }
    }
    //method to get the size of the queue
    public int size()
    {
        return size;
    }
}//end of Queue