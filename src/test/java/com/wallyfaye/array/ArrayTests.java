package com.wallyfaye.array;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ArrayTests {

	@Test
	void get_length() {
		int array_size = 128;
		Array calculator = new Array(array_size);
		assertEquals(array_size, calculator.get_length(), "first argument should set array size");
	}

}
