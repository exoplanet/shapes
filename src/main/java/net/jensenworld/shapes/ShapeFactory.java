package net.jensenworld.shapes;

import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author Allen Jensen
 * This class simply generates the set of shapes that we will want to
 * operate on. Each method is specific to a scenario for some combination
 * of shapes.
 *
 */
public class ShapeFactory {
	
	/**
	 * Generates a set consisting of a Circle, Square and Equilateral Triangle
	 * where the dimension is the same for the radius of the circle as the length
	 * of the edges of the square and the equilateral triangle.
	 * 
	 * @param shapeDimension
	 * @return setOfShapes
	 */
	static Set<Shape> createShapeSet3(double shapeDimension) {
		Set<Shape> shapes = ConcurrentHashMap.newKeySet(3);
		shapes.add(new Circle(shapeDimension));
		shapes.add(new Square(shapeDimension));
		shapes.add(new EquilateralTriangle(shapeDimension));
		return shapes;
	}
}
