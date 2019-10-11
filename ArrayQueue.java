import java.util.Arrays;
public class ArrayQueue<T> implements Queue<T>{
	private T[] array = (T[]) new Object[10];
	private int head = -1;
	private int tail = -1;
	private void growArr(){
		T[] arr = (T[]) new Object[2 * array.length];
		for (int i = 0; i < array.length; i++)
			arr[i] = array[i];
        array = arr;
    }
	public T dequeue(){
		head++;
		T t = array[head];
		array[head] = null;
		return t;
	}
	public void enqueue(T item){
		if (tail == array.length-1) growArr();
		tail++;
		array[tail] = item;
	}
	public boolean empty(){
		return head == tail;
	}
}
