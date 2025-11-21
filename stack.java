
import java.util.Scanner;
//normal stack ADT:
class stack{
  int maxsize,tos,stack[];
    void create_stack(int size){
        maxsize=size;
        tos=-1;
        stack = new int[maxsize];
    }
    void push(int n){
          int e=n;
          stack[++tos]=e;
    }
    int pop(){
        return stack[tos--];
    }
    int peek(){
        return stack[tos];
    }
    void print(){
       for(int i=tos;i>=0;i--){
        System.out.println("the value are :"+stack[i]);
       }
    }
    boolean is_Empty(){
        return tos==-1;

    }
    boolean is_Full(){
        return tos==maxsize-1;
    }
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    stack s=new stack();
      System.out.println("enter the size of stack:");
             int s1=sc.nextInt();
            s.create_stack(s1);
    int choice;
    do{
    System.out.println("enter your choice:");
    System.out.println("===================");
    System.out.println("1-push:");
    System.err.println("2-pop:");
    System.out.println("3-peek:");
    System.out.println("4-print");
    System.out.println("0-Exit");
    System.out.println("===================");
    choice=sc.nextInt();

    switch(choice){
        case 0:
            return;
        case 1:
            if(!s.is_Full()){
             System.out.println("values to push :");
             int s2=sc.nextInt();
             s.push(s2);
            }
            else{
             System.out.println("stack full");
            }
             break;
        case 2:
            if(!s.is_Empty()){
            System.out.println("the value pop :"+s.pop());
            }
            else{
                System.out.println("its empty stack:");
            }
            break;
        case 3:
            if(!s.is_Empty()){
            System.out.println("the peek value is :"+s.peek());}
            else{
                System.out.println("stack empty:");
            }
            break;
        case 4:
            if(!s.is_Empty()){
            s.print();}
            else{
                System.out.println("empty stack");
            }
            break;
        default:

    }

    }while(choice!=0);

    }
}