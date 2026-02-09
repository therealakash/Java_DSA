package day_1_array;

public class patterninloop {
   public static void printpattern(int n){

       int r=1;
       int c=0;
       for(r=1;r<=n;)
       {
           if(c<r){
               System.out.print("*");
               c++;
           }
           else if(c==r){
               System.out.println();
               r++;
               c=0;
           }
       }
   }

    public static void main(String[] args) {

       printpattern(3);
    }

}
