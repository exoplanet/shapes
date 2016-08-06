package net.jensenworld.shapes;

import junit.framework.TestCase;

public class CircleTest extends TestCase {

	public void test_type() throws Exception {
		assertNotNull(Circle.class);
	}

	public void test_instantiation() throws Exception {
		double radius = 5.0d;
		Circle target = new Circle(radius);
		assertNotNull(target);
	}

	public void test_area_A$() throws Exception {
		double radius = 5.0d;
		Circle target = new Circle(radius);
		double actual = target.area();
		double expected = 78.5398d;
		double roundedActual = Math.round(actual*10000.0d)/10000.0d;
		assertEquals(expected, roundedActual);
	}

	public void test_toString_A$() throws Exception {
		double radius = 0.0;
		Circle target = new Circle(radius);
		String actual = target.toString();
		String expected = "Circle [radius=0.0]";
		assertEquals(expected, actual);
	}

}
