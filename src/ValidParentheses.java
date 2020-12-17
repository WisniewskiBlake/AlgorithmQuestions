import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> myStack = new Stack<>();

        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);

            switch (c){
                case '(': case '{': case '[': myStack.push(c);
                    break;
                case ')': if(myStack.empty() || myStack.pop()!='(') return false;
                    break;
                case '}': if(myStack.empty() || myStack.pop()!='{') return false;
                    break;
                case ']': if(myStack.empty() || myStack.pop()!='[') return false;
                    break;
                default: return false;
            }
        }
        return myStack.empty();

    }
}
