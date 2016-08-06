package net.jensenworld.shapes;

/**
 * @author exoplanet
 * An Equilateral Triangle is a triangle where each side is the same length.
 * Initial implementation provides for computing Area.
 */
public class EquilateralTriangle extends Shape {
	
	static final double SQRT_OF_3 = Math.sqrt(3.0d);
	private double sideLength;

	public EquilateralTriangle(double sideLength) {
		this.sideLength = sideLength;
	}

	@Override
	public double area() {
		// Area of Equilateral Triangle with side length s is given by:
		// s^2 * sqrt(3)/4
		return (Math.pow(sideLength, 2) * SQRT_OF_3)/4.0d;
	}

	@Override
	public String toString() {
		return "EquilateralTriangle [sideLength=" + sideLength + "]";
	}

}
