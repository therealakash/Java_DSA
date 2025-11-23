//3. Count even and odd numbers in an array

import java.util.Scanner;

class counteven_odd {
    static void counteven(int[] arr){
        int cnt=0;
        int cntodd=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                cnt++;
            }
            else{
                cntodd++;
            }
        }
        System.out.println("the odd numbers in array:"+cntodd);
        System.out.println("the even number:"+cnt);

    }

     static void print(int[] arr){
    for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
    }
}
    public static void main(String[] args) {
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


        counteven(arr);
    }
}
