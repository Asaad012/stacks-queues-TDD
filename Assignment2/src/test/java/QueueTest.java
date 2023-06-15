import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class QueueTest {
    @Test
    public void Constructor_NewlyCreated_ReturnsZero() {
        Queue queue = new Queue();
        assertEquals("A newly created queue does not have size zero.", 0, queue.size());
    }

    @Test
    public void Enqueue_SingleElement_ReturnsOne(){
        Queue queue = new Queue();
        queue.enqueue("a");
        assertEquals("The queue did not return size one after one element is added.",1, queue.size());
    }

    @Test
    public void  Dequeue_MultipleElement_ReturnOne() throws StackUnderFlowException {
        Queue queue = new Queue();
        queue.enqueue("a");
        queue.enqueue("b");
        queue.dequeue();
        assertEquals("The queue did not return the correct element.","a",queue.peek());
    }

    @Test
    public void Dequeue_EmptyQueue_ThrowUnderFlowException() throws StackUnderFlowException {
        try {
            Queue queue = new Queue();
            queue.dequeue();
            fail("UnderFlowException was not thrown.");
        }
        catch(StackUnderFlowException e){
            String message = "You cannot dequeue from an empty queue.";
            assertEquals(message,e.getMessage());
        }
    }
}
