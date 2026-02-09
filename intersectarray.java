package day_1_array;

public class intersectarray {
    void printCommon(int[] arr1, int[] arr2, int arr1_len, int arr2_len) {
        int i = 0, j = 0;

        while (i < arr1_len && j < arr2_len) {
            if (arr1[i] == arr2[j]) {
                System.out.print(arr1[i] + " ");
                i++;
                j++;
            } else if (arr1[i] < arr2[j]) {
                i++;
            } else {
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 4, 6, 7, 9};
        int[] arr2 = {1, 2, 4, 5, 9, 10};

        intersectarray ce = new intersectarray();
        ce.printCommon(arr1, arr2, arr1.length, arr2.length);

    }
}
