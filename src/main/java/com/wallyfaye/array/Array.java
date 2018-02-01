package com.wallyfaye.array;

/**
 * Array of Integers <br />
 * 
 * A wrapper for an array of integers
 *
 * @version 1.0
*/

public class Array {

	private int[] array;

	/**
	* Constructor
	* 
	* @param s (required) the desired size of the array
	*/

	public Array(int s) {
		array = new int[s];
	}

	/**
	* Returns the size of the array
	* 
	* @return the size of the array
	*/

	public int get_length() {
		return array.length;
	}

}