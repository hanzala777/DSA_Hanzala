package Walmart;

import java.util.ArrayList;
import java.util.List;

public class Heap {
    private List<Integer> heap;
    private int numChildren;

    public Heap(int k) {
        this.heap = new ArrayList<>();
        this.numChildren = (int) Math.pow(2, k);
    }

    public void insert(int value) {
        heap.add(value);
        heapifyUp(heap.size() - 1);
    }

    public int popMax() {
        if (heap.isEmpty()) {
            throw new IndexOutOfBoundsException("Heap is empty");
        }

        int maxValue = heap.get(0);
        int lastValue = heap.remove(heap.size() - 1);

        if (!heap.isEmpty()) {
            heap.set(0, lastValue);
            heapifyDown(0);
        }

        return maxValue;
    }

    private void heapifyUp(int index) {
        int currentIndex = index;
        int parentIndex = getParentIndex(currentIndex);

        while (currentIndex > 0 && heap.get(currentIndex) > heap.get(parentIndex)) {
            swap(currentIndex, parentIndex);
            currentIndex = parentIndex;
            parentIndex = getParentIndex(currentIndex);
        }
    }

    private void heapifyDown(int index) {
        int currentIndex = index;

        while (true) {
            int largest = currentIndex;
            for (int i = 1; i <= numChildren; i++) {
                int childIndex = getChildIndex(currentIndex, i);
                if (childIndex < heap.size() && heap.get(childIndex) > heap.get(largest)) {
                    largest = childIndex;
                }
            }

            if (largest == currentIndex) {
                break;
            }

            swap(currentIndex, largest);
            currentIndex = largest;
        }
    }

    private int getParentIndex(int index) {
        return (index - 1) / numChildren;
    }

    private int getChildIndex(int index, int childNumber) {
        return numChildren * index + childNumber;
    }

    private void swap(int index1, int index2) {
        int temp = heap.get(index1);
        heap.set(index1, heap.get(index2));
        heap.set(index2, temp);
    }

    public void printHeap() {
        System.out.println(heap);
    }

    // Test the PowerOfTwoMaxHeap
    public static void main(String[] args) {
        Heap heap = new Heap(2);  // Each node will have 4 children (2^2)
        heap.insert(10);
        heap.insert(20);
        heap.insert(30);
        heap.insert(5);
        heap.insert(1);

        heap.printHeap();  // Prints the current state of the heap

        System.out.println(heap.popMax());  // Should print 30
        heap.printHeap();  // Prints the current state of the heap

        System.out.println(heap.popMax());  // Should print 20
        heap.printHeap();  // Prints the current state of the heap

        System.out.println(heap.popMax());  // Should print 10
        heap.printHeap();  // Prints the current state of the heap

        System.out.println(heap.popMax());  // Should print 5
        heap.printHeap();  // Prints the current state of the heap

        System.out.println(heap.popMax());  // Should print 1
        heap.printHeap();  // Prints the current state of the heap
    }
}
