package uf;

/**
 * Weighted Quick-Union with path compression implementation of Union-Find.
 */
public class WeightedQuickUnion {
    private int[] id;
    private int[] weight;

    /**
     * Constructor.
     * @param n number of objects
     */
    public WeightedQuickUnion(int n) {
        id = new int[n];
        weight = new int[n];
        for (int i = 0; i < n; i++) {
            id[i] = i;
            weight[i] = 1;
        }
    }

    /**
     * Connect a to b. Connect tree with lower weight to higher weight.
     * @param a object a
     * @param b object b
     */
    public void union(int a, int b) {
        int from = root(a);
        int to = root(b);
        if (weight[from] < weight[to]) {
            id[from] = to;
            weight[to] += weight[from];
        } else {
            id[to] = from;
            weight[from] += weight[to];
        }
    }

    /**
     * Return true if a connects to b.
     * @param a object a
     * @param b object b
     * @return if a connects to b
     */
    public boolean connected(int a, int b) {
        return root(a) == root(b);
    }

    /**
     * Find the root of a.
     * @param a object a
     * @return the root of a.
     */
    private int root(int a) {
        while (a != id[a]) {
            id[a] = id[id[a]]; // path compression
            a = id[a];
        }
        return a;
    }
}
