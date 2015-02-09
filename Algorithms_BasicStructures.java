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
        marStack<Integer> testLL = new marStack<Integer>(); 
        
        testLL.push(0);
        testLL.push(1);
        testLL.push(2);
        testLL.push(3);
        
        System.out.println(testLL.size());
        
        System.out.println(testLL.pop());
        System.out.println(testLL.pop());
        System.out.println(testLL.pop());
        System.out.println(testLL.pop());
        System.out.println(testLL.pop());
    } 
}
