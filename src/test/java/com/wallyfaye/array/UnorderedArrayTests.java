package com.wallyfaye.array;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

class UnorderedArrayTests {

	@Test
	void lengthOfArray() {
		int length = 128;
		UnorderedArray array = new UnorderedArray(length);
		assertEquals(length, array.length(), "first argument should set array size");
	}

	@Test
	void retrieveBadItems(){
		UnorderedArray array = new UnorderedArray(2);
		assertEquals(0, array.getValueByIndex(0), "nonexistent values should return -1");
		assertEquals(0, array.getValueByIndex(3), "nonexistent values should return -1");
		assertEquals(0, array.getValueByIndex(-1), "nonexistent values should return -1");
	}


	@Test
	void insertAndRetrieveItems(){

		UnorderedArray array = new UnorderedArray(2);

		int firstItem = 123;
		int secondItem = 456;
		int thirdItem = 789;

		assertAll("zero values are not inserted", 
			() -> assertFalse(array.insertValue(0))
		);
		
		assertAll("first item should be inserted", 
			() -> assertTrue(array.insertValue(firstItem)),
			() -> assertEquals(firstItem, array.getValueByIndex(0), "first item should insert")
		);
		
		assertAll("second item should be inserted", 
			() -> assertTrue(array.insertValue(secondItem)),
			() -> assertEquals(secondItem, array.getValueByIndex(1), "second item should insert")
		);
		
		assertAll("third item should be rejected, array is full", 
			() -> assertFalse(array.insertValue(thirdItem))
		);
		
	}

	@Test
	void deleteItemsAndInsert(){

		UnorderedArray array_1 = new UnorderedArray(10);

		array_1.insertValue(9);
		array_1.insertValue(8);
		array_1.insertValue(5);
		array_1.insertValue(7);
		array_1.insertValue(3);
		array_1.insertValue(4);
		array_1.insertValue(9);
		array_1.insertValue(8);
		array_1.insertValue(5);
		array_1.insertValue(7);

		assertTrue(array_1.deleteValue(7));
		assertTrue(array_1.deleteValue(8));
		array_1.insertValue(7);
		array_1.insertValue(4);

		assertAll("delete 7 and 8 from 9857349857 and get 9534957400", 
			() -> assertEquals(9, array_1.getValueByIndex(0), "array element at index 0 should equal 9"),
			() -> assertEquals(5, array_1.getValueByIndex(1), "array element at index 1 should equal 5"),
			() -> assertEquals(3, array_1.getValueByIndex(2), "array element at index 2 should equal 3"),
			() -> assertEquals(4, array_1.getValueByIndex(3), "array element at index 3 should equal 4"),
			() -> assertEquals(9, array_1.getValueByIndex(4), "array element at index 4 should equal 9"),
			() -> assertEquals(5, array_1.getValueByIndex(5), "array element at index 5 should equal 5"),
			() -> assertEquals(7, array_1.getValueByIndex(6), "array element at index 6 should equal 0"),
			() -> assertEquals(4, array_1.getValueByIndex(7), "array element at index 7 should equal 0"),
			() -> assertEquals(0, array_1.getValueByIndex(8), "array element at index 8 should equal 0"),
			() -> assertEquals(0, array_1.getValueByIndex(9), "array element at index 9 should equal 0")
		);

		UnorderedArray array_2 = new UnorderedArray(4);
		array_2.insertValue(1);
		array_2.insertValue(2);
		array_2.insertValue(3);
		array_2.insertValue(4);

		assertFalse(array_2.deleteValue(5));

		assertAll("delete 5 from 1234 and get 1234", 
			() -> assertEquals(1, array_2.getValueByIndex(0), "array element at index 0 should equal 1"),
			() -> assertEquals(2, array_2.getValueByIndex(1), "array element at index 1 should equal 2"),
			() -> assertEquals(3, array_2.getValueByIndex(2), "array element at index 2 should equal 3"),
			() -> assertEquals(4, array_2.getValueByIndex(3), "array element at index 3 should equal 4")
		);


	}


}