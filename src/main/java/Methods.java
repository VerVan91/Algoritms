public class Methods {
    public static int find(int[] arr, int num) {
        if (arr == null) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return i;
            }
        }
        return -1;
    }

    public static int findSorted(int[] sortedArr, int num) {
        if (sortedArr == null) {
            return -1;
        }

        for (int i = 0; i < sortedArr.length; i++) {
            if (sortedArr[i] == num) {
                return i;
            }
        }
        return -1;
    }

    public static int[] sort(int[] arr) {
        if (arr == null) {
            return new int[]{};
        }
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            int temp;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    isSorted = false;
                }
            }
        }
        return arr;
    }
}