package algorithms_basicstructures;

/**
 *
 * @author Stephen
 * @version 1.0
 */
public class Algorithms_BasicStructures {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Test the marStack class
        marQueue<Integer> testLL = new marQueue<Integer>(); 
        
        testLL.enqueue(0);
        testLL.enqueue(1);
        testLL.enqueue(2);
        testLL.enqueue(3);
        
        System.out.println(testLL.size());
        
        System.out.println(testLL.dequeue());
        System.out.println(testLL.dequeue());
        System.out.println(testLL.dequeue());
        System.out.println(testLL.dequeue());
        System.out.println(testLL.dequeue());
        System.out.println(testLL.isEmpty());
    } 
}
