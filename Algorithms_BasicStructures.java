package algorithms_basicstructures;

/**
 *
 * @author Stephen
 * @version 1.0
 */

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.BufferedReader;
import java.nio.charset.StandardCharsets;

public class Algorithms_BasicStructures {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        
        //Test the WeightedQuickUnion class
        BufferedReader input = Files.newBufferedReader(Paths.get("C:\\Users\\Stephen\\Documents\\NetBeansProjects\\Algorithms_BasicStructures\\data\\tinyUF.txt"), StandardCharsets.UTF_8);
        
        int nodes = Integer.parseInt(input.readLine());
        WeightedQuickUnion cMap = new WeightedQuickUnion(nodes);
        
        String inputLine;               
        while((inputLine = input.readLine()) != null) {
            String[] pairs = inputLine.split("\\s+");
            int node1 = Integer.parseInt(pairs[0]);
            int node2 = Integer.parseInt(pairs[1]);
            
            cMap.union(node1, node2);
        }
        
        System.out.println(cMap.count());
       
    } 
}
