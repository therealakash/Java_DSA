
import java.util.Scanner;
import java.util.Stack;
//number to binnary using stack:
public class numbertobinary {
    Stack<Integer> sc = new Stack<>();
void enter_number_convert(int n){
        int s =n;
        while(s!=0){
         int d = s%2;
         sc.push(d);
         s=s/2;
        }
}
String br="";
void print(){
    while(!sc.isEmpty()){
        br+=sc.pop();
    }
    System.out.println("binary number is :"+br);
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        numbertobinary nb = new numbertobinary();
        System.out.println("enter number want to convert:");
        int n = sc.nextInt();
        nb.enter_number_convert(n);
        nb.print();

    }
}
