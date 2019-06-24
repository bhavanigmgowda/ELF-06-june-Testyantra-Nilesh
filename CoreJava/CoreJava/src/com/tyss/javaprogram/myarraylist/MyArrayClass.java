package com.tyss.javaprogram.myarraylist;

import java.util.Arrays;

import lombok.extern.java.Log;

@Log
public class MyArrayClass {

	private Object myarr[];
	private int index;
	private static int intial = 10;

	public MyArrayClass() {
		this(intial);

	}

	public MyArrayClass(int size) {
		super();
		if (size <= 0) {
			throw new ArrayIndexOutOfBoundsException("size should be greater than zero");
		}
		myarr = new Object[size];
		index = 0;
	}

	public void add(Object val) {

		if (index >= myarr.length) {
			Object[] myArrayNew = new Object[20];
			System.arraycopy(myarr, 0, myArrayNew, 0, myArrayNew.length);
			myarr = myArrayNew;

		}
		myarr[index] = val;
		index++;
	}

	public Object get(int position) {

		return myarr[position];
	}

	public void remove(int position) {
		if (position <= myarr.length) {
			myarr[position] = null;

			System.arraycopy(myarr, position + 1, myarr, position, (myarr.length - 1 - position));
			myarr[myarr.length - 1] = null;
		} else {
			throw new ArrayIndexOutOfBoundsException("array index of bound");
		}

	}

	public int getsize() {
		return index - 1;
	}

}// End of class
