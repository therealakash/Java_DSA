package day_1_array;

public class missingnumber {
    static int misssnumber(int[] arr){
        int n = arr.length;
        int sum = n*(n+1)/2;
        for(int x:arr){
            sum-=x;
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,5};
        System.out.println(misssnumber(arr));
    }
}
