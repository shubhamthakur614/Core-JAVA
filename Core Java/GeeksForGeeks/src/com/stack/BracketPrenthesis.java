package com.stack;

class mystack {
	int size;
	char arr[];
	int top;

	mystack(int size) {
		this.size = size;
		this.arr = new char[size];
		this.top = -1;
	}

	public boolean isEmpty() {
		return (top == -1);
	}

	public boolean isFull() {
		return size - 1 == top;
	}

	public int peek() {
		if (!isEmpty()) {
			return arr[top];
		} else {
			System.out.println("Stack is Empty..");
			return -1;
		}
	}

	public void push(char element) {
		if (!isFull()) {
			top++;
			arr[top] = element;
			System.out.println("Element is push:" + element);
		} else {
			System.out.println("Stack is full..");

		}
	}

	public char pop() {
		if (!isEmpty()) {
			char topelement = arr[top];
			top--;

			return topelement;
		} else {
			System.out.println("stack is empty..");
			return '-';
		}
	}

	// find the element present in stack
	public int isLength() {
		return top + 1;
	}
}

public class BracketPrenthesis {

	public boolean balanced(String str) {
		mystack mm = new mystack(str.length());
		for (int i = 0; i < str.length(); i++) {
			char a = str.charAt(i);

			// if bracket is opening then only push
			if (a == '{' || a == '[' || a == '(') {
				mm.push(a);
				continue;
			}

			// If current character is not opening
			// bracket, then it must be closing. So stack
			// cannot be empty at this point.
			if (mm.isEmpty()) {
				return false;
			}
			char check;
			switch (a) 
			{
			case '}':
				check = mm.pop();
				if (check == '[' || check == '(') {
					return false;

				}
				break;

			case ']':
				check = mm.pop();
				if (check == '{' || check == '(') {
					return false;
				}
				break;

			case ')':
				check = mm.pop();
				if (check == '[' || check == '{') 
				{
					return false;
				}
				break;

			}

		}
		return (mm.isEmpty());

	}

	public static void main(String[] args)
	{
		String str = "([{}])";
		BracketPrenthesis b=new BracketPrenthesis();
		System.out.println(b.balanced(str));
		
		

	}

}
