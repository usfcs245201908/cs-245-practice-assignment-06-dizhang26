import java.util.Arrays;
public class ArrayQueue<T> implements Queue<T>{//implement interface Quene as well as all the functions in it.
	private T[] array = (T[]) new Object[10];
	private int head = -1;
	private int tail = -1;
	private void growArr(){//grow the array twice its size when the amount of elements reaches the array's limit.
		T[] arr = (T[]) new Object[2 * array.length];
		for (int i = 0; i < array.length; i++)
			arr[i] = array[i];
        array = arr;
    }
	public T dequeue(){
		head++; //first in first out
		T t = array[head]; //store the head to a varible t and return it.
		array[head] = null; //then set the head to null
		return t;
	}
	public void enqueue(T item){
		if (tail == array.length-1)//check if the array is out of space for an extra element, if it is, call growArr function.
			growArr();
		tail++;//increment tail by 1, and make the new incremented space equal to the new item.
		array[tail] = item;
	}
	public boolean empty(){//when the head and tail are in the same position we know that the array is empty.
		return head == tail;
	}
}
