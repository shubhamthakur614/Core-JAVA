package com.stack;

//Pros: Easy to implement. Memory is saved as pointers are not involved. 

//Cons: It is not dynamic. It doesn’t grow and shrink depending on needs at runtime.

//A Linear data structure have data elements arranged in sequential manner and each member
//element is connected to its previous and next element. Such data structures are easy to implement 
//as computer memory is also sequential. ...
//Examples of linear data structures are List, Queue, Stack, Array etc.

public class Stack_using_Array 
{
	int size;
	int arr[];
	int top;

	Stack_using_Array(int size) {
		this.size = size;
		this.arr = new int[size];
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

	public void push(int element) {
		if (!isFull()) {
			top++;
			arr[top] = element;
			System.out.println("Element is push:" + element);
		} else {
			System.out.println("Stack is full..");

		}
	}

	public void pop() {
		if (!isEmpty()) {
			int topelement = arr[top];
			top--;

			System.out.println("popped element :" + topelement);
		} else {
			System.out.println("stack is empty..");
		}
	}

	// find the element present in stack
	public int length() {
		return top + 1;
	}

	public static void main(String[] args) {
		Stack_using_Array s = new Stack_using_Array(10);
		System.out.println("Is stack is empty: " + s.isEmpty());
		System.out.println("Is stack is full: " + s.isFull());
		s.pop();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		System.out.println("The length of element in stack is:" + s.length());
		System.out.println(s.peek());
		s.pop();
		System.out.println(s.peek());

	}

}
