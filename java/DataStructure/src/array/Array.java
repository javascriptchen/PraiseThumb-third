package array;

import java.util.Arrays;

public class Array {
	private int[] data;
	private int size;

	public Array(int capacity) {
		data = new int[capacity];
		size = 0;
	}

	public Array() {
		this(10);
	}

	public int getSize() {
		return size;
	}

	public int getCapacity() {
		return data.length;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public void addLast(int e) {
		add(size, e);
	}

	public void addFirst(int e) {
		add(0, e);
	}
	
	public int get(int index) {
		if(index < 0 || index > size) {
			throw new IllegalArgumentException("添加失败");
		}
		return data[index];
	}
	
	public void set(int index, int e) {
		if(index < 0 || index > size) {
			throw new IllegalArgumentException("添加失败");
		}
		data[index] = e;
	}
	
	public void add(int index, int e) {
		if (data.length == size) {
			throw new IllegalArgumentException("添加失败");
		}
		if (index < 0 || index > size) {
			throw new IllegalArgumentException("添加失败");
		}
		for (int i = size - 1; i >= index; i--) {
			data[i + 1] = data[i];
		}
		data[index] = e;
		size++;
	}

	@Override
	public String toString() {
		StringBuilder res = new StringBuilder();
		res.append(String.format("Array:size = %d, capacity = %d\n", size, data.length));
		res.append("[");
		for (int i = 0; i < size; i++) {
			res.append(data[i]);
			if (i != size - 1) {
				res.append(", ");
			}
		}
		res.append("]");
		return res.toString();
	}

}
