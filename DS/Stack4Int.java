package core_java.stack;
// defines a stack4int 
public class Stack4Int {
	private int[] stack;
	private int top; // point to the top of the stack
	// cap: 栈的容量
	Stack4Int(int cap){
		stack = new int[cap];
		top = -1;
	}
	void push(int ele){
		if(top + 1 >= stack.length)
			System.out.println("Stack is full...");
		else
			stack[++top] = ele;
	}
	int pop(){
		if(top < 0) {
			System.out.println("Stack is empty...");
			return 0;
		}
		return stack[top--];
	}
}

/*
**可改进的地方：
**1 栈的容量可以动态调整的
**  栈快满时，扩容； 元素个数低于容量的1/4时，容量折半。
**2 可存储任意类型的元素（使用泛型）
*/
