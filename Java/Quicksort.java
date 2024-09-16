public class Quicksort {
    public static void main(String[] args) {
        int[] array = {3, 6, 8, 10, 1, 2, 1};
        quicksort(array, 0, array.length - 1);

        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    private static void quicksort(int[] arr, int left, int right) {
        if (left < right) {
            int pivotIndex = partition(arr, left, right);
            quicksort(arr, left, pivotIndex - 1);
            quicksort(arr, pivotIndex + 1, right);
        }
    }

    private static int partition(int[] arr, int left, int right) {
        int pivot = arr[right];
        int i = left - 1;

        for (int j = left; j < right; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[right];
        arr[right] = temp;

        return i + 1;
    }
}
