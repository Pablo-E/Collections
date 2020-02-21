package com.collections;

import java.util.List;

public interface IArrays<E> {
	
	void add(E e);
	void addArray(List<E> e);
	void removeByIndex(int index);
	void removeByElement(E e);
	void printArray();
	void searchbyIndex(int index);
	

}
