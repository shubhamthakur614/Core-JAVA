package com.stack;

public class Reverse_String 
{
	int size;
	char arr[];
	int top;

	Reverse_String(int size) {
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
	public int length() {
		return top + 1;
	}

	public static void main(String[] args) {
		Reverse_String s = new Reverse_String(10);
         String name="Shubham";
		
		for(int i=0;i<name.length();i++)
		{
			s.push(name.charAt(i));
		}
		while(!s.isEmpty())
		{
			System.out.print(s.pop());
		}
		
	}


}
