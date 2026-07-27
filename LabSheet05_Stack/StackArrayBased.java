public class StackArrayBased {
	
   private int[] stacks;	 	// array to store elements
   private final int MAX_STACK = 50;	// maximum size of stack
   private int top;		 	// index of the top element

   // create an empty stack with a maximum size
   public StackArrayBased() {
      stacks = new int[MAX_STACK];
      top = -1;
   }

   // create an empty stack with a specific size
   public StackArrayBased(int capacity) {
      stacks = new int[capacity];
      top = -1;
   }
   
}
