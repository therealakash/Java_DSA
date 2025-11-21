import java.util.Scanner;
import java.util.Stack;
//rever the stack:
public class revstack {
  Stack<Character> sc = new Stack<>();
    void enter_string(String str){
        char[] ch = str.toCharArray();
    for(int i=0;i<str.length();i++){
           sc.push(ch[i]);
    }
    }
    String rev="";
void print_rev(){
   while(!sc.isEmpty()){
    rev+=sc.pop();
   }
   System.out.println(rev);
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string;");
        String bc = sc.nextLine();
        revstack rs= new revstack();
        rs.enter_string(bc);
        rs.print_rev();
    }
}
