package net.jensenworld.shapes;

/**
 * @author Allen Jensen
 * A circle is defined by its radius.
 * Initial implementation provides for computing Area.
 */
public class Circle extends Shape {

	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}
	
	/* (non-Javadoc)
	 * @see net.jensenworld.shapes.Shape#area()
	 * 
	 * Area of a circle - pie are square - pi*r^2
	 */
	@Override
	public double area() {
		return Math.PI * Math.pow(radius, 2);
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}

}
