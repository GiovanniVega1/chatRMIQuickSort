package rmi;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

public class QuickSortForkJoin {
     public void sort(int[] a) {
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        forkJoinPool.invoke(new QuickSortTask(a, 0, a.length - 1));
    }

    private class QuickSortTask extends RecursiveAction {
        private static final int THRESHOLD = 100000000;
        private final int[] a;
        private final int low;
        private final int high;

        public QuickSortTask(int[] a, int low, int high) {
            this.a = a;
            this.low = low;
            this.high = high;
        }

        @Override
        protected void compute() {
            if (low < high) {
                if (high - low <= THRESHOLD) {
                    // Use a sequential Quicksort for small subarrays
                    insertionSort(a, low, high);
                } else {
                    int pivotIndex = partition(a, low, high);
                    QuickSortTask left = new QuickSortTask(a, low, pivotIndex - 1);
                    QuickSortTask right = new QuickSortTask(a, pivotIndex + 1, high);
                    invokeAll(left, right);
                }
            }
        }

        private int partition(int[] a, int low, int high) {
            int pivot = a[high];
            int i = low - 1;

            for (int j = low; j < high; j++) {
                if (a[j] <= pivot) {
                    i++;
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }

            int temp = a[i + 1];
            a[i + 1] = a[high];
            a[high] = temp;

            return i + 1;
        }

        private void insertionSort(int[] a, int low, int high) {
            for (int i = low + 1; i <= high; i++) {
                int key = a[i];
                int j = i - 1;

                while (j >= low && a[j] > key) {
                    a[j + 1] = a[j];
                    j--;
                }

                a[j + 1] = key;
            }
        }
    }
}
