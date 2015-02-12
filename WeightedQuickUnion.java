/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms_basicstructures;

/**
 *
 * @author Stephen
 */
public class WeightedQuickUnion {
    private int[] id;
    private int[] size;
    private int nodeCount;
    
    public WeightedQuickUnion(int N) {
        nodeCount = N;
        id = new int[N];
        size = new int[N];
        for(int i = 0 ; i < N ; i++) {
            id[i] = i;
            size[i] = 1;
        }
    }
    
    public int count() {
        return nodeCount;
    }
    
    public boolean connected(int node1, int node2) {
        return find(node1) == find(node2);
    }
    
    public int find(int nodeID) {
        while(nodeID != id[nodeID]) {
            nodeID = id[nodeID];
        }
        return nodeID;
    }
    
    public void union(int node1, int node2) {
        int nodeRoot1 = find(node1);
        int nodeRoot2 = find(node2);
        
        if(nodeRoot1 == nodeRoot2) {
            return;
        }
        
        if(size[nodeRoot1] < size[nodeRoot2]) {
            id[nodeRoot1] = nodeRoot2;
            size[nodeRoot2] += size[nodeRoot1];
        } else {
            id[nodeRoot2] = nodeRoot1;
            size[nodeRoot1] += size[nodeRoot2];
        }
        
        nodeCount--;
    }
}
