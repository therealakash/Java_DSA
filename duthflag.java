package day_1_array;

import java.util.Arrays;

public class duthflag {
    static void sort012(int[] arr){
        int n = arr.length;
        int lo=0;
        int hi = n-1;
        int mid=0;

        while(mid<=hi){
            if(arr[mid]==0){
                int temp= arr[lo];
                arr[lo++]=arr[mid];
                arr[mid++]=temp;
            }
            else if(arr[mid]==1){
                mid++;
            }
            else{
                int temp= arr[mid];
                arr[mid]=arr[hi];
                arr[hi--]=temp;
            }
        }
    }
    public static void main(String[] args) {
    int[] arr={0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
            sort012(arr);
            System.out.println(Arrays.toString(arr));
    }
}
