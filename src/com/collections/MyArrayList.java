package com.collections;

import java.util.List;

public class MyArrayList<E> implements IArrays<E> {

	int length = 10;
	E[] myList = (E[]) new Object[length];

	@Override
	public void add(E e) {
		if (length == 0) {
			E[] newList = (E[]) new Object[myList.length + myList.length / 2];
			for (int i = 0; i < myList.length; i++) {
				newList[i] = myList[i];
			}
			length = myList.length / 2 - 1;
			newList[myList.length] = e;
			myList = newList;
		} else {
			for (int i = 0; i < myList.length; i++) {
				if (myList[i] == null) {
					myList[i] = e;
					length--;
					break;
				}
			}
		}
	}

	@Override
	public void addArray(List<E> e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeByElement(E e) {
		E[] newList = (E[]) new Object[myList.length];
		int temp = 0;

		for (int i = 0; i < myList.length; i++) {
			if (e != myList[i]) {
				newList[temp] = myList[i];
				temp++;
			} else if (e == myList[i] && newList[i] != null) {

			}
		}
		myList = newList;

	}

	@Override
	public void removeByIndex(int index) {
		E[] newList = (E[]) new Object[myList.length];
		int temp = 0;

		if (index == 0) {
			for (int i = 0; i < myList.length - 1; i++) {
				newList[i] = myList[i + 1];
				if (myList[i] == null) {
					break;
				}
			}
		} else {
			for (int i = 0; i < myList.length; i++) {
				if (index != i) {
					newList[temp] = myList[i];
					temp++;
				} else if (index == i && newList[i] != null) {

				}
			}
		}
		myList = newList;
	}

	@Override
	public void printArray() {
		for (E e : myList) {
			if (e != null) {
				System.out.println(e);
			}
		}
	}

	@Override
	public void searchbyIndex(int index) {
		if (index < myList.length && myList[index] != null) {
			System.out.println("In index " + index + " is " + myList[index]);	
		} else {
			System.out.println("There is nothing in index " + index);
		}
	}

}
