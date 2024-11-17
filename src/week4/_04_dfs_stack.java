package week4;

import java.util.*;

public class _04_dfs_stack {
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

        System.out.println(dfs_stack(graph, 1));
    }

    // 1. 시작 노드를 스택에 넣기
    // 2. 현재 스택의 노드를 빼서 visited에 추가
    // 3. 현재 방문한 노드와 인접한 노드 중 방문하지 않은 노드 스택에 추가
    public static List<Integer> dfs_stack(
            Map<Integer, List<Integer>> adjacent_graph, int start_node
    ) {
        Stack<Integer> stack = new Stack<>(); // 스택 선언
        List<Integer> visited = new ArrayList<>(); // 방문한 노드 목록이
        stack.push(start_node); // 시작 노드 스택에 추가

        while (!stack.empty()) {
            int current_node = stack.pop(); // 현재 스택의 노드 스택에서 빼서~
            visited.add(current_node); // visited에 추가

            List<Integer> adjacent_node = adjacent_graph.get(current_node);
            for (Integer integer : adjacent_node) {
                if (!visited.contains(integer)) { // 현재 방문한 노드와 인접한 노드 중 방문하지 않은 노드라면~
                    stack.push(integer); // 스택에 추가
                }
            }
        }
        return visited;
    }
}
