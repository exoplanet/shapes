package net.jensenworld.shapes;

import junit.framework.TestCase;

public class ShapeAreaTest extends TestCase {

	public void test_type() throws Exception {
		assertNotNull(ShapeArea.class);
	}

	public void test_instantiation() throws Exception {
		Shape shape = new Square(5.0d);
		ShapeArea target = new ShapeArea(shape);
		assertNotNull(target);
	}

	public void test_call_A$() throws Exception {
		Shape shape = new Square(5.0d);
		ShapeArea target = new ShapeArea(shape);
		AreaResult actual = target.call();
		Double expected = 25.0d;
		assertEquals(expected, actual.getArea());
	}

	public void test_call_A$_T$Exception() throws Exception {
		Shape shape = null;
		ShapeArea target = new ShapeArea(shape);
		try {
			AreaResult areaResult = target.call();
			fail("Expected exception was not thrown!");
			assertEquals(areaResult.getArea(),0.0d);
		} catch (Exception e) {
			assertNotNull(e);
		}
	}

}
