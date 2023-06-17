import java.util.LinkedList;

/*
This is the Stack Class that you have to implement
the code to pass the test cases
 */
public class Stack {
   LinkedList<String> myStack = new LinkedList<>();

   //The size() method returns the number of elements currently in the stack.
    public int size() {
        return myStack.size();
    }

    //The push() method adds a given element to the top of the stack.
    public void push(String input) {
        myStack.addFirst(input);
    }

    //The pop() method removes the element on the top of the stack and returns it.
    public String pop() throws StackUnderFlowException {
        //Cannot call pop() when the stack is empty
        if (!myStack.isEmpty()){
            String result = myStack.getFirst();
            myStack.removeFirst();
            return result;
        }
        else {
            throw new StackUnderFlowException();
        }
    }
}
class StackUnderFlowException extends Exception{
    public StackUnderFlowException(){
        super("You cannot call pop() method if the Stack is empty");
    }
}