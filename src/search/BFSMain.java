package search;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class BFSMain {
    public static void main(String[] args) {
        BreadthFirstSearch bfs = new BreadthFirstSearch();
        System.out.println("[bfs]");
        System.out.println(bfs.bfsSearch1(makeGraph(),"A"));
    }

    public static HashMap<String, ArrayList<String>> makeGraph(){
        HashMap<String, ArrayList<String>> graph = new HashMap<String, ArrayList<String>>();

        graph.put("A", new ArrayList<String>(Arrays.asList("B", "C")));
        graph.put("B", new ArrayList<String>(Arrays.asList("A", "D")));
        graph.put("C", new ArrayList<String>(Arrays.asList("A", "G", "H", "I")));
        graph.put("D", new ArrayList<String>(Arrays.asList("B", "E", "F")));
        graph.put("E", new ArrayList<String>(Arrays.asList("D")));
        graph.put("F", new ArrayList<String>(Arrays.asList("D")));
        graph.put("G", new ArrayList<String>(Arrays.asList("C")));
        graph.put("H", new ArrayList<String>(Arrays.asList("C")));
        graph.put("I", new ArrayList<String>(Arrays.asList("C", "J")));
        graph.put("J", new ArrayList<String>(Arrays.asList("I")));

        return graph;
    }
}
