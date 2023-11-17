** Bubble Sort in Accending Order:-
    public class sorting {
    public static void printBubbleSort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 8, 6, 4, 1, 5, 2, 7, 3 };
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int tempo = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tempo;
                }
            }
        }
        printBubbleSort(arr);
    }

}

** Buuble Sort in Decsending Order
    public class sorting {
    public static void printBubbleSort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 8, 6, 4, 1, 5, 2, 7, 3 };
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    // swap
                    int tempo = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tempo;
                }
            }
        }
        printBubbleSort(arr);
    }

}
    

** Selection Sort- Ascending Order
    public class sorting {
    public static void printSelectionSort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 8, 6, 4, 1, 5, 2, 7, 3 };
        for (int i = 0; i < arr.length - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[smallest] > arr[j]) {
                    smallest = j;
                }

            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
        printSelectionSort(arr);
    }

}



** Insertion Sort
    public class sorting {
    public static void printInsertionSort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 8, 5, 1, 3, 2, 4, 7, 6 };
        for (int i = 0; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;
            while (j >= 0 && current < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current;
        }
        printInsertionSort(arr);
    }
}