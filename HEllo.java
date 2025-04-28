public class HEllo {

    // Bubble Sort method
    static void BubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 1, 4, 2, 8};

        System.out.println("Array before sorting:");
        for (int i : arr) {
            System.out.print(i + " ");
        }

        BubbleSort(arr);

        System.out.println("\nArray after sorting:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}