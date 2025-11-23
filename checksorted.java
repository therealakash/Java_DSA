
//. Check if an array is sorted.

import java.util.Scanner;

class checksorted{
     static boolean checksorted(int[] arr){
        for(int i =0;i<arr.length-1;i++){
                if(arr[i]>arr[i+1]){
                 
                       return false;
                }
             
        }
        return  true;
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
        System.out.println("the array is sorted :"+checksorted(arr));
            
    }
}
