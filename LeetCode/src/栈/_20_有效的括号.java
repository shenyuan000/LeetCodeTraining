package 栈;

import java.util.HashMap;
import java.util.Stack;
/**
 * https://leetcode-cn.com/problems/valid-parentheses/submissions/
 * @author yysi
 *
 */
public class _20_有效的括号 {
	
	private static HashMap<Character, Character> map = new HashMap<>();
	static {
		// key - value
		map.put('(', ')');
		map.put('{', '}');
		map.put('[', ']');
	}
	
	public boolean isValid2(String s) {
		Stack<Character> stack = new Stack<>();
		
		int len = s.length();
		for (int i = 0; i < len; i++) {
			char c = s.charAt(i);
			if (map.containsKey(c)) {//左括号
				stack.push(c);
			} else {//右括号
				if (stack.isEmpty()) return false;;
				if (c != map.get(stack.pop())) return false;
			}
		}
		
		
		return stack.isEmpty();
	}
	
	public boolean isValid(String s) {
		Stack<Character> stack = new Stack<>();
		
		int len = s.length();
		for (int i = 0; i < len; i++) {
			char c = s.charAt(i);
			if (c == '(' || c == '{'|| c == '[') {//左括号
				stack.push(c);
			} else {//右括号
				char left = stack.pop();
				if (left == '(' && c != ')') return false;
				if (left == '[' && c != ']') return false;
				if (left == '{' && c != '}') return false;
			}
		}
		
		
		return stack.isEmpty();
	}
}
