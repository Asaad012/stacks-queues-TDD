import org.junit.Test;
import static org.junit.Assert.*;

public class StackTest {
    @Test
    public void NewStack_ReturnSizeZero(){
        Stack mystack = new Stack();
        assertEquals("The size of a new Stack must be zero",0, mystack.size());
    }
    @Test
    public void Push_CalledOnce_ReturnSizeOne(){
        Stack mystack = new Stack();
        mystack.push("a");
        assertEquals("When push() method called once, the Stack size must be one",1,mystack.size());
    }
    @Test
    public void Pop_CallTwoPushesAndOnePop_ReturnItemB() throws StackUnderFlowException {
        Stack mystack = new Stack();
        mystack.push("a");
        mystack.push("b");
        assertEquals("It must return the last element in Stack which is b","b", mystack.pop());
    }
    @Test
    public void Exception_CallPopOnEmptyStack_ThrowUnderFlowException() throws StackUnderFlowException {
        try {
            Stack mystack = new Stack();
            mystack.pop();
            fail("UnderFlowException not thrown");
        }
        catch (StackUnderFlowException e){
            assertEquals("You cannot call pop() method if the Stack is empty",e.getMessage());
        }

    }
}