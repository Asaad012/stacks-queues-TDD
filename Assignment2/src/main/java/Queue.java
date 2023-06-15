//Empty classes amd methods made to compile tests, remove when implementation starts
public class Queue {
    public int size(){ return 0;}

    public void enqueue(String element){}

    public void dequeue() throws StackUnderFlowException {}

    public String peek(){return "";}

}

class UnderFlowException extends Exception{}

