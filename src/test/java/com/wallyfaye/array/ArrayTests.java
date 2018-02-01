package com.wallyfaye.array;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

class ArrayTests {

	@Test
	void lengthOfArray() {
		int length = 128;
		Array array = new Array(length);
		assertEquals(length, array.length(), "first argument should set array size");
	}

	@Test
	void retrieveBadItems(){
		Array array = new Array(2);
		assertEquals(0, array.get(0), "nonexistent values should return -1");
		assertEquals(0, array.get(3), "nonexistent values should return -1");
		assertEquals(0, array.get(-1), "nonexistent values should return -1");
	}


	@Test
	void insertAndRetrieveItems(){

		Array array = new Array(2);

		int firstItem = 123;
		int secondItem = 456;
		int thirdItem = 789;

		assertAll("first item should be inserted", 
			() -> assertTrue(array.push(firstItem)),
			() -> assertEquals(firstItem, array.get(0), "first item should insert")
		);
		
		assertAll("second item should be inserted", 
			() -> assertTrue(array.push(secondItem)),
			() -> assertEquals(secondItem, array.get(1), "second item should insert")
		);
		
		assertAll("third item should be rejected, array is full", 
			() -> assertFalse(array.push(thirdItem))
		);
		
	}

}