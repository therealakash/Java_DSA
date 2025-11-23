//4. Reverse an array without extra space 

import java.util.Scanner;

class Revesearray {
    static int[] Rev(int[] arr){
        int i=0;
        int j=arr.length-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }

        return arr;
    }
    static void print(int[] arr){
        System.out.println("the values of array:");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) 
    {
         Scanner sc = new  Scanner(System.in);
         System.out.println("enter the size of array:");
        int s=sc.nextInt();
        int [] arr=new int[s];
        for(int i =0;i<s;i++){
            System.out.println("enter values for array:");
            arr[i]=sc.nextInt();
        }

        System.out.println("the array is:");
        print(arr);
        int[] num = Rev(arr);
        print(num);
        
    }
}
