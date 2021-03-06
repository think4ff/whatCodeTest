package test.code;

public class BublleSort {

    public static void main(String[] args) {

        int[] arr = { 4, 5, 7, 0, 1, 33, 20 };
        for (int a : arr)
            System.out.print(a);

        System.out.println();

        int[] arr2 = bubbleSort(arr);
        int arr2Size = arr2.length;
        int seq = 0;
        for (int b : arr2) {
            seq++;
            System.out.print(seq == arr2Size ? b + "" : b + ", ");
        }
        //just modify for merge test...
    }

    private static int[] bubbleSort(int[] arr) {

        int n = arr.length;
        int tmp = 0;
        for (int k = 1; k < n - 1; k++) {
            int flag = 0;
            for (int i = 0; i < n - k; i++) {
                if (arr[i] > arr[i + 1]) {
                    tmp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = tmp;
                    flag = 1;
                }
            }
            if (flag == 0)
                break;
        }

        return arr;
    }

}
