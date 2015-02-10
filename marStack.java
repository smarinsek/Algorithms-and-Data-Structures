package algorithms_basicstructures;

/**
 * Implement a LIFO ADT Stack using a linked list
 * 
 * @author Stephen
 * @version 1.0
 */
public class marStack<Item> {
    /**
     * Contains the head node of the linked list
     */
    private node head;
    
    /**
     * Contains the current size of the stacked
     */
    private int listSize;
    
    /**
     * Linked list node
     */
    private class node {
        Item data;
        node nextNode;
    }
    
    /**
     * Get the current size of the array
     * @return an integer that represents the current size of the stack
     */
    public int size() {
        return listSize;
    }
    
    /**
     * Check to see if the linked list is empty
     * @return boolean where true indicates that the stack is empty
     */
    public boolean isEmpty() {
        if(listSize == 0) {
            return true;
        } else {
            return false;
        }
    }
    
    /**
     * Insert an Item into the stack
     * @param inputData The item to be added to the stack
     */
    public void push(Item inputData) {
        node nextNode = head;
        head = new node();
        head.data = inputData;
        head.nextNode = nextNode; 
        listSize++;
    }
    
    /**
     * Retrieve and remove the top item from the stack
     * @return The item stored in top of the stack. Returns null if stack is empty.
     */
    public Item pop() {
        if(!isEmpty()) {
            Item outputItem = head.data;
            head = head.nextNode;
            listSize--;
            return outputItem;
        } else {
            return null;
        }
    }
}
