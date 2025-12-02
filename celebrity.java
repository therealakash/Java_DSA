
import java.util.Scanner;

public class celebrity {
     static void create_martix(int size){
          Scanner sc = new Scanner(System.in);
        int[][] arr=new int[size][size];
       

        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                System.out.println("enter value:");
                arr[i][j]=sc.nextInt();
            }
        }
         
         for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[i][j]+" ");
            }
          System.out.println();
        }
        for (int p = 0; p < size; p++) {

    boolean ro = true;
    boolean co = true;

    for (int j = 0; j < size; j++) {
        if (arr[p][j] == 1) {
            ro = false;
            break;
        }
    }
    for (int i = 0; i < size; i++) {
        if (i != p && arr[i][p] == 0) {
            co = false;
            break;
        }
    }

    if (ro && co) {
        System.out.println("Celebrity is: " + p);
        return;
            
         
        }
    }
     }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of martix:");
        int s =sc.nextInt();
        create_martix(s);
    }
}
