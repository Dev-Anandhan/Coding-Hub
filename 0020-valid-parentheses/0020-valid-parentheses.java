import java.util.*;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        HashMap<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');

        for (char c : s.toCharArray()) {

            if (map.containsKey(c)) {

                if (stack.isEmpty()) return false;

                char top = stack.pop();

                if (top != map.get(c)) return false;
            } 
            else {
                stack.push(c);
            }
        }

        return stack.isEmpty();
    }
}