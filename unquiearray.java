package day_1_array;

public class unquiearray {
    static  void printunquie(int[] arr){
        int n = arr.length;
        int[] arr1 = new int[n];
        int index =0;
        int perv = Integer.MIN_VALUE;
        for (int i=0;i<n;i++){

            if(arr[i]!=perv){
                arr1[index++] = arr[i];
                perv=arr[i];
            }

        }
        for(int i=0;i<index;i++){
            System.out.println(arr1[i]);
        }
    }

    public static void main(String[] args) {
        int[] nums ={11,11,22,22,44,44};
        printunquie(nums);

    }
}
