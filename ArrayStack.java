import java.util.Arrays;
public class ArrayStack<T> implements Stack<T>{ //implements interface Stack and build functions
	private T[] array = (T[]) new Object[10];
	private int top = -1; //set the the top of the array to be -1

	public void growArray(){ //grow array function, to double the size of the array.
		T[] arr = (T[]) new Object[2 * array.length];
		for (int i = 0; i < array.length; i++)
			arr[i] = array[i];
        	array = arr;
	}
	public T peek(){ //check if the array is empty, if is it return null.
		if (empty()) 
			return null;
		return array[top];
	}
	public T pop(){
		if (empty()) //check if the array is empty, if is it return null.
			return null;
		T t = array[top];//store the last element in the array and return it later
		top--; //decrement the index of top.
		final var t1 = t; 
		return t1;
	}
	public void push(T item){
		if (top == array.length - 1) //check if the array if full, if it is call growArray function
			growArray();
		top++;//increment top
		array[top] = item;
	}

	public boolean empty(){//when top = -1, the array is empty.
		return top == -1;
	}	
}
