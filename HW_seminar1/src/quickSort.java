public class quickSort {
    public static void main(String[] args) {
        int size = 100;
        int max = 100;
        int min = 0;

        int[] array = bubbleSort.getRandomArray(size, max, min);

        printArray(array);

        System.out.println();

        quickSort(array, 0, array.length - 1);

        printArray(array);

    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void quickSort(int[] array, int startPosition, int endPosition) {
        int pivot = array[(startPosition + endPosition) / 2];
        int i = startPosition, j = endPosition;
        while (i <= j) {
            while (array[i] < pivot) {
                i++;
            }
            while (array[j] > pivot) {
                j--;
            }
            if (i <= j) {
                if (i < j) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;

                }
                i++;
                j--;
            }
        }
        if(i<endPosition) {
        quickSort(array, i,endPosition);
        }
        if(j>startPosition){
            quickSort(array, startPosition, j);
        }
    }
}
