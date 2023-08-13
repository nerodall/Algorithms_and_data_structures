
public class bubbleSort {

    int size = 100;
    int max = 100;
    int min = 0;
    int[] array = getRandomArray(size, min, max);

    public static void bubbleSort(int[] array) {
        boolean fin;
        do {
            fin = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int aux = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = aux;
                    fin = true;
                }
            }

        }
        while (fin);
    }

    public static int[] getRandomArray(int size, int min, int max) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * (max - min + 1)) + min;
        }
        return array;
    }
}
