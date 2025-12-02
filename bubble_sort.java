
import java.util.Scanner;

class bubble_sort{
    void optimized_bubble_sort(int []a){
        boolean done = false;
        for(int i =a.length-1;i>0;i--){
            done =true;
            for(int j=0;j<i;j++){
                if(a[j]>a[j+1]){
                    int t = a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                    done =false;
                }
            }
            if(done==true){
                break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        bubble_sort bs = new bubble_sort();
        System.out.println("enter size of array:");
        int s = sc.nextInt();
        int[] arr=new int[s];
        System.out.println("enter values to array:");
        for(int i=0;i<s;i++){
            arr[i]=sc.nextInt();
        }
   bs.optimized_bubble_sort(arr);
   System.out.println("sorted array :");
        for(int i =0;i<s;i++){
            System.out.println(arr[i]);
        }
    }
}