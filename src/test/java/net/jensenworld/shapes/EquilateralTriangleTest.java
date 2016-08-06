package net.jensenworld.shapes;

import junit.framework.TestCase;

public class EquilateralTriangleTest extends TestCase {

	public void test_type() throws Exception {
		assertNotNull(EquilateralTriangle.class);
	}

	public void test_instantiation() throws Exception {
		double sideLength = 0.0;
		EquilateralTriangle target = new EquilateralTriangle(sideLength);
		assertNotNull(target);
	}

	public void test_area_A$() throws Exception {
		double sideLength = 5.0d;
		EquilateralTriangle target = new EquilateralTriangle(sideLength);
		double actual = target.area();
		double expected = 10.8253d;
		double roundedActual = Math.round(actual*10000.0d)/10000.0d;
		assertEquals(expected, roundedActual);
	}

	public void test_toString_A$() throws Exception {
		double sideLength = 0.0;
		EquilateralTriangle target = new EquilateralTriangle(sideLength);
		String actual = target.toString();
		String expected = "EquilateralTriangle [sideLength=0.0]";
		assertEquals(expected, actual);
	}

}
