package uf;

/**
 * Quick-Union implementation of Union-Find.
 */
public class QuickUnion {
    private int[] id;

    /**
     * Constructor.
     * @param n number of objects
     */
    public QuickUnion(int n) {
        id = new int[n];
        for (int i = 0; i < n; i++) {
            id[i] = i;
        }
    }

    /**
     * Connect a to b.
     * @param a object a
     * @param b object b
     */
    public void union(int a, int b) {
        int from = root(a);
        int to = root(b);
        id[from] = to;
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
            a = id[a];
        }
        return a;
    }
}
