// Medium nearly hard

import java.util.ArrayDeque;
import java.util.Deque;

public class StackValidSequence {
	public static Deque<String> stack1 = new ArrayDeque<String>();

	public static void main(String[] args) {
		originalStack();
		System.out.println();
		
		String[][] testcases = {{"red", "blue", "green", "orange"},
								{"red", "green", "blue", "orange"},
								{"blue", "orange", "green", "red"}};
		
		for (int i=0; i<testcases.length; i++) {
			System.out.println("Sequence testcase" + (i+1) + " is " + 
									(isValidSequence(testcases[i]) ? "Valid" : "Invalid"));
		}
		
	}
		
	public static boolean isValidSequence(String[] testcase) {
		Deque<String> stack_break = new ArrayDeque<String>();
		int focus = 0;
		
		while (!stack1.isEmpty()) {
			
		} 
		
		return stack_break.isEmpty();
	}
	
	public static void originalStack() {
		final String[] colors = {"red", "green", "blue", "orange"};
		for (String color : colors) {
			stack1.push(color);
		}
		System.out.println("Original stack => " + stack1);
	}

}
