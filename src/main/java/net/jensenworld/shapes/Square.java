package net.jensenworld.shapes;

/**
 * @author Allen Jensen
 * A Square is a rectangle where each side is the same length.
 * Initial implementation provides for computing Area.
 */
public class Square extends Shape {

	private double sideLength;

	public Square(double sideLength) {
		this.sideLength = sideLength;
	}
	
	/* (non-Javadoc)
	 * @see net.jensenworld.shapes.Shape#area()
	 * Area of a square is just the square of the side length.
	 */
	@Override
	public double area() {
		return Math.pow(sideLength, 2);
	}

	@Override
	public String toString() {
		return "Square [sideLength=" + sideLength + "]";
	}

}
