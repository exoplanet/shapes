package net.jensenworld.shapes;

import java.util.Set;

import junit.framework.TestCase;

public class ShapeFactoryTest extends TestCase {

	public void test_type() throws Exception {
		assertNotNull(ShapeFactory.class);
	}

	public void test_instantiation() throws Exception {
		ShapeFactory target = new ShapeFactory();
		assertNotNull(target);
	}

	public void test_createShapeSet3_A$() throws Exception {
		double shapeDimension = 5.0d;
		Set<Shape> shapeSet = ShapeFactory.createShapeSet3(shapeDimension);
		assertEquals(3, shapeSet.size());
		boolean circleFound=false;
		boolean squareFound=false;
		boolean equilateralTriangleFound=false;
		for(Shape shape : shapeSet) {
			if(shape instanceof Circle) {
				circleFound = true;
			} else if(shape instanceof Square) {
				squareFound = true;
			} else if (shape instanceof EquilateralTriangle) {
				equilateralTriangleFound = true;
			} else {
				fail("Unexpected Shape Class: "+shape.getClass().getCanonicalName());
			}
		}
		assertTrue(circleFound);
		assertTrue(squareFound);
		assertTrue(equilateralTriangleFound);
	}

}
