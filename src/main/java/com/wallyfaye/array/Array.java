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

	public int getValueByIndex(int i) {

		boolean iTooBig = i >= length;
		boolean iTooSmall = i < 0;

		return (iTooBig || iTooSmall) ? 0 : array[i];

	}

	/**
	* Insert a value into the next unset array element
	* 
	* @param v (required) the value to be inserted
	* @return true if the value was created, or false if array is full
	*/

	public boolean insertValue(int v) {

		boolean did_insert = false;

		boolean value_not_zero = v != 0;
		boolean array_not_full = insertIndex < length;

		if(array_not_full && value_not_zero){
			array[insertIndex] = v;
			insertIndex++;
			did_insert = true;
		}

		return did_insert;

	}

	/**
	* Delete all matching values within the array
	* 
	* @param v (required) the value to be deleted
	* @return true if a value was deleted, or false if nothing changed
	*/

	public boolean deleteValue(int v) {

		boolean did_delete = false;
		int zero_count = 0;

		// find matches and count 0s
		for(int i = 0; i < length; i++){

			if(array[i] == 0){
				zero_count++;
			} else if(array[i] == v){
				array[i] = 0;
				did_delete = true;
				zero_count++;
			}

		}

		// if deletion occurred shift items forward
		if(did_delete){

			int array_indexer = 0;

			for(int i = 0; i < length; i++){
				if(array[i] != 0){
					array[array_indexer] = array[i];
					array_indexer++;
				}
			}

			insertIndex = length - zero_count;

			while(zero_count > 0){
				array[length - zero_count] = 0;
				zero_count--;
			}

		}

		return did_delete;

	}
}