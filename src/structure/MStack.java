package structure;

import java.util.Stack;

public class MStack {

	public static void run() {

		System.out.println("\n==== Stack ====\n");
		
		/**
		 * Stack = LIFO data Structure. Last-In First-Out
		 * 			stores objects into a sort of "vertical tower"
		 * 			push() to add to the top
		 * 			pop() to remove from the top
		 */
		
		Stack<String> stack = new Stack<String>();

		// Adding
		stack.push("Minecraft");
		stack.push("Skyrim");
		stack.push("DOOM");
		stack.push("Borderlands");
		stack.push("FFVII");
		
		// Removing the last item

		String ffvvii = stack.pop(); // remove FFVII
		System.out.println("popped game: " + ffvvii);

		// getting the last item
		String borderlands = stack.peek();
		System.out.println(borderlands);
		
		
		// Searching | The item start at the index 1
		// If the item doesn't exist, the method will return -1
		String searchTerm = "Minecraft";
		System.out.println("Index of " + searchTerm + ": " + stack.search(searchTerm));
		
		
		// Printing the Entire stack
		System.out.println(stack);

		System.out.println("Is the stack empty: " + stack.empty());

		/**
		 * 
		 * Usages
		 * 
		 * 1. undo/redo features in text editors
		 * 2. moving back/forward through browser history
		 * 3. backtracking algorithms (maze, file directories)
		 * 4. calling functions (call stack)
		 * 
		 */
		
	}

}
