public class App {
    public static void main(String[] args) throws Exception {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        bubbleSort(arr);
        System.out.println("Array setelah diurutkan:");
        printArray(arr);

        int[] arr2 = {64, 34, 25, 12, 22, 11, 90};
        insertionSort(arr2);
        System.out.println("Array 2 setelah diurutkan");
        printArray(arr2);
    
        int[] arr3 = {64, 34, 25, 12, 22, 100, 90};
        insertionSort(arr2);
        System.out.println("Array 3 setelah diurutkan:");
        printArray(arr3);
    }
    
    public static void insertionSort(int[]arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j]> key) {
                arr[j + 1]= Arr[j];
                j = j -1;
            }
            arr[j + 1]= key;
        }
    }
    public static void selectionSort(int arr[])
}
    int pos;
    int temp;
    for (int i = 0; i < arr.length; i++)
    {
        if (arr[j]< arr[pos])

        {
            pos = j;
        }

    
    }

