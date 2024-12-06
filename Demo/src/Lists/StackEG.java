package Lists;

import java.util.Stack;

public class StackEG {

	public static void main(String[] args) {
		Stack<Integer>stk=new Stack<Integer>();
		stk.push(45);
		stk.push(23);
		stk.push(34);
		System.out.println(stk);
		System.out.println(stk.isEmpty());
		stk.pop();
		System.out.println(stk.peek());
		System.out.println(stk.search(23));
	}

}
