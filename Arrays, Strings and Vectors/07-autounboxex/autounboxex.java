import java.util.*;
public class autounboxex
{
	public static void main(String args[])
	{
		Stack<Integer> myStack = new Stack<Integer>();
	
		myStack.push(10);
		myStack.push(20);
		
		int Sum1 = myStack.pop(),
		Sum2 = myStack.pop();
		
		int stackSum = Sum1 + Sum2;
		
		System.out.println("The topmost element from the stack is: " + Sum1);
		
		System.out.println("The next element from the stack is: " + Sum2);
		
		
		
		System.out.println("The sum of two elements from the Stack: "+ stackSum);
		
		/*Stack mystack = new Stack();

		mystack.push(new Integer(10));
		mystack.push(new Integer(20));
		
		Integer stksum1 = (Integer) mystack.pop();
		Integer stksum2 = (Integer) mystack.pop();
		
		int stksum = stksum1.intValue() + stksum2.intValue();
		
		System.out.println(stksum);
		*/
	}
}