import java.util.ArrayList;

//Empty classes amd methods made to compile tests, remove when implementation starts
public class Queue {
    ArrayList myQueue = new ArrayList<>();
    String dequeuedItem;//This string is to save the dequeued item which always is the first item
    public int size(){
        return myQueue.size();
    }
    public void enqueue(String element){
        myQueue.add(element);
    }
    public void dequeue() throws UnderFlowException{
        if (myQueue.isEmpty()){
            throw new UnderFlowException();
        }
        dequeuedItem = myQueue.remove(0).toString();
    }
    public String peek(){
        return dequeuedItem;
    }

}

class UnderFlowException extends Exception{
    public UnderFlowException(){
        super("You cannot dequeue from an empty queue.");
    }
}

