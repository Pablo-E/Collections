package com.collections;

public class Main {

	public static void main(String[] args) {
		
		IArrays<String> myList = new MyArrayList<>();
		myList.add("Pablo");
		myList.add("Josh");
		myList.add("Fer");
		myList.add("Gisele");
		myList.add("Ale");
		myList.add("Pedro");
		myList.add("Alicia");
		myList.printArray();
		System.out.println("---------------------");
		myList.removeByIndex(2);
		myList.printArray();
		System.out.println("---------------------");
		myList.removeByElement("Gisele");
		myList.printArray();
		myList.searchbyIndex(1000);

	}

}
