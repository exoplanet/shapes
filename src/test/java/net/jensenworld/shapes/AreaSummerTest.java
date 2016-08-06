package net.jensenworld.shapes;

import junit.framework.TestCase;

public class AreaSummerTest extends TestCase {

	public void test_type() throws Exception {
		assertNotNull(AreaSummer.class);
	}

	public void test_instantiation() throws Exception {
		AreaSummer target = new AreaSummer();
		assertNotNull(target);
	}

	public void test_shapeSet3Sum_A$double() throws Exception {
		double shapeDimension = 5.0;
		double actual = AreaSummer.shapeSet3Sum(shapeDimension);
		double expected = 114.3651;
		double roundedActual = Math.round(actual*10000.0d)/10000.0d;
		assertEquals(expected, roundedActual);
	}

}
