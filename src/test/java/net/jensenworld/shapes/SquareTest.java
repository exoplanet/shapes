package net.jensenworld.shapes;

import junit.framework.TestCase;

public class SquareTest extends TestCase {

	public void test_type() throws Exception {
		assertNotNull(Square.class);
	}

	public void test_instantiation() throws Exception {
		double sideLength = 5.0d;
		Square target = new Square(sideLength);
		assertNotNull(target);
	}

	public void test_area_A$() throws Exception {
		double sideLength = 5.0d;
		Square target = new Square(sideLength);
		double actual = target.area();
		double expected = 25.0d;
		assertEquals(expected, actual);
	}

	public void test_toString_A$() throws Exception {
		double sideLength = 0.0;
		Square target = new Square(sideLength);
		String actual = target.toString();
		String expected = "Square [sideLength=0.0]";
		assertEquals(expected, actual);
	}

}
