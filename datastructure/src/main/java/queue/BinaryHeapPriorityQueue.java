package queue;

/**
 * Fixed size priority queue implemented by binary heap.
 */
public class BinaryHeapPriorityQueue {
    private int[] heap;
    private int size;

    /**
     * Construct binary heap.
     * @param capacity capacity of heap
     */
    public BinaryHeapPriorityQueue(int capacity) {
        heap = new int[capacity + 1];
        size = 0;
    }

    /**
     * Insert item to queue.
     * @param n item
     */
    public void insert(int n) {
        heap[++size] = n;
        swim();
    }

    /**
     * Remove and retrieve the max item in queue.
     * @return max item in queue.
     */
    public int deleteMax() {
        final int max = heap[1];
        swap(1, size);
        heap[size--] = 0;
        sink();
        return max;
    }

    /**
     * Check if queue is empty.
     * @return true if queue is empty
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * Move last element up to keep max heap property.
     */
    private void swim() {
        int index = size;
        while (index > 1 && heap[index] > heap[index / 2]) {
            swap(index, index / 2);
            index /= 2;
        }
    }

    /**
     * Move first element down to keep max heap property.
     */
    private void sink() {
        int index = 1;
        while (index * 2 <= size) {
            int leftIndex = index * 2;
            if (leftIndex < size && heap[leftIndex] < heap[leftIndex + 1]) {
                leftIndex++;
            }
            if (heap[index] >= heap[leftIndex]) {
                break;
            }
            swap(index, leftIndex);
            index = leftIndex;
        }
    }

    /**
     * Exchange value of index x and y.
     * @param x first index
     * @param y second index
     */
    private void swap(int x, int y) {
        int temp = heap[x];
        heap[x] = heap[y];
        heap[y] = temp;
    }
}
