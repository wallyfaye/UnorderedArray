package com.wallyfaye.array;

/**
 * Array of Integers <br>
 * 
 * A wrapper for an array of integers
 *
 * @version 1.0
*/

public class Array {

	private int[] array;
	private int insertIndex = 0;
	private int length;

	/**
	* Constructor
	* 
	* @param s (required) the desired size of the array
	*/

	public Array(int s) {

		array = new int[s];
		length = array.length;

	}

	/**
	* Get the size of the array
	* 
	* @return the size of the array
	*/

	public int length() {

		return length;

	}

	/**
	* Get an item from the array by index
	* 
	* @param i (required) the index of the element requests
	* @return the value of an item, or 0 if nonexistant
	*/

	public int get(int i) {

		boolean iTooBig = i >= length;
		boolean iTooSmall = i < 0;

		return (iTooBig || iTooSmall) ? 0 : array[i];

	}

	/**
	* Insert an item into the end of the array
	* 
	* @param v (required) the value to be inserted
	* @return true if the value was created, or false if array is full
	*/

	public boolean push(int v) {

		boolean did_insert = false;

		if(insertIndex < length){
			array[insertIndex] = v;
			insertIndex++;
			did_insert = true;
		}

		return did_insert;

	}

}