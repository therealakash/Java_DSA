import java.util.Scanner;

public class stack {
    int tos,maxsize;
    int[] stack;
    void create_stack(int s){
         maxsize=s;
        stack = new int[maxsize];
        tos=-1;
    }
    void push(int d){
      stack[++tos]=d;
    }
    int pop(){
        return stack[tos--];
    }
    int peek(){
        return stack[tos];
    }
    void print(){
        for(int i=0;i<=tos;i++){
            System.out.println(stack[i]);
        }
    }

    boolean is_full(){
        return tos==maxsize-1;
    }
    boolean is_Empty(){
        return tos==-1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        stack st = new stack();
        System.out.println("enter array size:");
        int size =sc.nextInt();
        st.create_stack(size);
        int ch;
        do { 
            System.out.println("===============");
            System.out.println("enter your choice:");
            System.out.println("1-push");
            System.out.println("2-pop");
            System.out.println("3-peek");
            System.out.println("4-print");
            System.out.println("0-exit");
            System.out.println("===============");
            ch =sc.nextInt();
            
            switch (ch) {
                case 0:
                    return;
                case 1:
                    if(!st.is_full()){
                        System.out.println("enter value to push");
                        int ch1 = sc.nextInt();
                         st.push(ch1);
                    }
                    else{
                        System.out.println("stack full");
                    }
                    
                    break;
                case 2:
                    if(!st.is_Empty()){
                        System.out.println("value pop:"+st.pop());
                    }
                    else{
                        System.out.println("stack is empty");
                    }
                    break;
                case 3:
                    System.out.println("the value peek"+st.peek());
                    break;
                case 4:
                    st.print();
                    break;

                default:
                System.out.println("enter valid input:");
            }
        } while (ch!=0);
    }
}
