public static void quickSort(int arr[], int si, int ei) {
    if (si >= ei) {
        return;
    }

    // last element as pivot
    int pIdx = partition(arr, si, ei);

    // left part
    quickSort(arr, si, pIdx - 1);

    // right part
    quickSort(arr, pIdx + 1, ei);
}

public static int partition(int arr[], int si, int ei) {
    int pivot = arr[ei];      // pivot = last element
    int i = si - 1;           // index for smaller elements

    // traverse from si to ei-1
    for (int j = si; j < ei; j++) {
        if (arr[j] <= pivot) {
            i++;

            // swap arr[i] and arr[j]
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    // place pivot at correct position
    i++;
    int temp = arr[i];
    arr[i] = arr[ei];
    arr[ei] = temp;

    return i; // pivot index
}
