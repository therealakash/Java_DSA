
import java.util.Scanner;
//1. Find the largest element in an array
class largestnumber{
  static  int largest(int[] arr){
    int max = arr[0];
         for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max =arr[i];
            }
         }
         return  max;
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
        largestnumber.print(arr);
        System.out.println("the maxmium value is :"+largest(arr));

    }
}