package com.wallyfaye.array;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ArrayTests {

	@Test
	void getLength() {
		int length = 128;
		Array array = new Array(length);
		assertEquals(length, array.getLength(), "first argument should set array size");
	}

}