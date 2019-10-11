import java.util.Arrays;
public class ArrayStack<T> implements Stack<T>{
	private T[] array = (T[]) new Object[10];
	private int top = -1;

	public void growArray(){
		T[] arr = (T[]) new Object[2 * array.length];
		for (int i = 0; i < array.length; i++)
			arr[i] = array[i];
        array = arr;
	}
	public T peek(){
		if (empty()) 
			return null;
		return array[top];
	}
	public T pop(){
		if (empty()) 
			return null;
		T t = array[top];
		top--;
		final var t1 = t;
		return t1;
	}
	public void push(T item){
		if (top == array.length - 1) growArray();
		top++;
		array[top] = item;
	}

	public boolean empty(){
		return top == -1;
	}	
}
