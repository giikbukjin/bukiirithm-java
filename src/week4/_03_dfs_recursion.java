package week4;

import java.util.*;
import java.io.*;

public class _03_dfs_recursion {
    public static void main(String[] args) {
        Map<Integer, List<Integer>> graph = new HashMap<>();
        graph.put(1, List.of(2, 5, 9));
        graph.put(2, List.of(1, 3));
        graph.put(3, List.of(2, 4));
        graph.put(4, List.of(3));
        graph.put(5, List.of(1, 6, 8));
        graph.put(6, List.of(5, 7));
        graph.put(7, List.of(6));
        graph.put(8, List.of(5));
        graph.put(9, List.of(1, 10));
        graph.put(10, List.of(9));

        List<Integer> visited = new ArrayList<>();
        dfs_recursion(graph, 1, visited);
        System.out.println(visited);
    }

    // 1. 시작 노드인 1부터 탐색
    // 2. 현재 방문한 노드를 visited_array에 주가
    // 3. 현재 방문한 노드와 인접한 노드 중 방문하지 않은 노드 방문
    public static void dfs_recursion(
            Map<Integer, List<Integer>> adjacent_graph, int cur_node, List<Integer> visited_array
    ) {
        visited_array.add(cur_node);
        System.out.println("cur_node " + cur_node + " / adjacent_graph[cur_node] " + adjacent_graph.get(cur_node));

        for (int i = 0; i < adjacent_graph.get(cur_node).size(); i++) {
            int adjacent_node = adjacent_graph.get(cur_node).get(i);
            if (!visited_array.contains(adjacent_node)) {
                dfs_recursion(adjacent_graph, adjacent_node, visited_array);
            }
        }
    }
}
// 그러나 재귀 함수를 이용해 구현하면 노드가 무한정 깊어질 경우 RecursionError가 발생할 수 있다.