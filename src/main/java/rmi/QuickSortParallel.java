package rmi;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

public class QuickSortParallel implements Runnable {
    private int[] array;
    private int threshold;

    public QuickSortParallel(int[] array, int threshold) {
        this.array = array;
        this.threshold = threshold;
    }

    @Override
    public void run() {
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        forkJoinPool.invoke(new QuickSortTask(array, 0, array.length - 1));
    }

    private class QuickSortTask extends RecursiveAction {
        private final int[] array;
        private final int low;
        private final int high;

        public QuickSortTask(int[] array, int low, int high) {
            this.array = array;
            this.low = low;
            this.high = high;
        }

        @Override
        protected void compute() {
            if (low < high) {
                if (high - low <= threshold) {
                    insertionSort(array, low, high);
                } else {
                    int pivotIndex = partition(array, low, high);
                    QuickSortTask left = new QuickSortTask(array, low, pivotIndex - 1);
                    QuickSortTask right = new QuickSortTask(array, pivotIndex + 1, high);
                    invokeAll(left, right);
                }
            }
        }

        private int partition(int[] array, int low, int high) {
            int pivot = array[high];
            int i = low - 1;

            for (int j = low; j < high; j++) {
                if (array[j] <= pivot) {
                    i++;
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }

            int temp = array[i + 1];
            array[i + 1] = array[high];
            array[high] = temp;

            return i + 1;
        }

        private void insertionSort(int[] array, int low, int high) {
            for (int i = low + 1; i <= high; i++) {
                int key = array[i];
                int j = i - 1;

                while (j >= low && array[j] > key) {
                    array[j + 1] = array[j];
                    j--;
                }

                array[j + 1] = key;
            }
        }
    }
}

