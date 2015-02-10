package algorithms_basicstructures;

/**
 * Implement a FIFO ADT Queue using a linked list
 * 
 * @author Stephen
 * @version 1.0
 */
public class marQueue<Item> {
    /**
     * Contains the current size of the queue
     */
    private int queueSize;
    
    /**
     * Contains a reference to the head of the queue
     */
    private node head;
    
    /**
     * Contains a reference to the tail of the queue
     */
    private node tail;
    
    /**
     * Linked list node
     */
    private class node {
        Item data;
        node nextNode;
    }
    
    /**
     * Get the current size of the queue
     * @return return an integer that represents the size of the queue
     */
    public int size() {
        return queueSize;
    }
    
    /**
     * Check to see if the queue is empty
     * @return boolean where true indicates queue is empty
     */
    public boolean isEmpty() {
        if(queueSize == 0) {
            return true;
        }
        return false;
    }
    
    /**
     * Add an item to the back of the queue
     * @param inputData The item to be added to the queue
     */
    public void enqueue(Item inputData) {
        node newLast = new node();
        newLast.data = inputData;
        if(isEmpty()) {
            tail = newLast;
            head = tail;
        } else {
            tail.nextNode = newLast;
            tail = newLast;
        }
        queueSize++;
    }
    
    /**
     * Get the item from the front of the queue
     * @return The item stored in the front of the queue
     */
    public Item dequeue() {
        if(isEmpty()) {
            return null;
        }
        node tempNode = head;
        head = head.nextNode;
        queueSize--;
        if(isEmpty()) {
            tail = null;
        }
        return tempNode.data;
    }
}
