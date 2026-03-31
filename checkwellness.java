import java.util.Stack;

public class checkwellness {
    public boolean isValid(String s) {
        Stack<Character>check=new Stack<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c=='{' || c=='['|| c=='('){
                check.push(c);
            }
            else{
                if(check.isEmpty()){
                    return false;
                }
                else{
                    char top =check.pop();
                    if(c==')' && top!='(') return false;
                    if(c=='}' && top!='{') return false;
                    if(c==']' && top!='[') return false;

                }
            }
        }
        return check.isEmpty();
    }
    public static void main(String[] args) {
      checkwellness checkparamtates = new checkwellness();
        String s = "({[]})";
        boolean result = checkparamtates.isValid(s);
        System.out.println(result); // Output: true
    }
}
