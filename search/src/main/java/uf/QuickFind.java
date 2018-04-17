package uf;

/**
 * Quick-Find implementation of Union-Find.
 */
public class QuickFind {
    private int[] id;

    /**
     * Constructor.
     * @param n number of objects
     */
    public QuickFind(int n) {
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
        int from = id[a];
        int to = id[b];
        for (int i = 0; i < id.length; i++) {
            if (id[i] == from) {
                id[i] = to;
            }
        }
    }

    /**
     * Return true if a connects to b.
     * @param a object a
     * @param b object b
     * @return if a connects to b
     */
    public boolean connected(int a, int b) {
        return id[a] == id[b];
    }
}
