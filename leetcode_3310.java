class Solution {
    public List<Integer> remainingMethods(int n, int k, int[][] invocations) {

        List<Integer>[] graph = new ArrayList[n];

        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int[] invocation : invocations) {
            graph[invocation[0]].add(invocation[1]);
        }

        boolean[] suspicious = new boolean[n];

        dfs(k, graph, suspicious);

        for (int i = 0; i < n; i++) {
            if (!suspicious[i]) {
                for (int next : graph[i]) {
                    if (suspicious[next]) {
                        return getAllMethods(n);
                    }
                }
            }
        }

        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (!suspicious[i]) {
                result.add(i);
            }
        }

        return result;
    }

    private void dfs(int node, List<Integer>[] graph, boolean[] suspicious) {
        if (suspicious[node]) {
            return;
        }

        suspicious[node] = true;

        for (int next : graph[node]) {
            dfs(next, graph, suspicious);
        }
    }

    private List<Integer> getAllMethods(int n) {
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            result.add(i);
        }

        return result;
    }
}

// Problem:
// Find the methods that can remain after removing the suspicious method
// and every method directly or indirectly called by it.

// Approach:
// 1. Build a directed graph using the invocation relationships.
// 2. Use DFS from method k to find all suspicious methods.
// 3. Check whether a non-suspicious method invokes a suspicious method.
// 4. If so, no suspicious methods can be removed.
// 5. Otherwise, return all non-suspicious methods.

// Pattern Learned:
// • Graph representation
// • DFS
// • Reachability

// Things I Learned:
// • DFS can find all nodes reachable from a starting node.
// • Method invocations can be represented as a directed graph.
// • A suspicious method can affect other methods through the call chain.

// Time Complexity: O(n + m)
// Space Complexity: O(n + m)