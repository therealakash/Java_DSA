//2. Find the smallest element in an array

import java.util.Scanner;

public class smallestnumber {
    static  int smallest(int[] arr){
    int min = arr[0];
         for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min =arr[i];
            }
         }
         return  min;
  }
  static void print(int[] arr){
    for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
    }
}
public static void main(String[] args) {
    
      Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array:");
        int s=sc.nextInt();
        int [] arr=new int[s];
        for(int i =0;i<s;i++){
            System.out.println("enter values for array:");
            arr[i]=sc.nextInt();
        }

        System.out.println("the array is:");
        print(arr);
        System.out.println("the min value is :"+smallest(arr));
}
}
