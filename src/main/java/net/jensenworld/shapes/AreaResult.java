package net.jensenworld.shapes;


/**
 * @author Allen Jensen
 * This class was added to be able output each individual shape's name with the area
 * Not needed if individual shape areas are not needed to be output with shape name
 * No unit tests since code is trivial and all generated automatically.
 */
public class AreaResult {
	private String shapeClass;
	private double area;
	
	public AreaResult(String name, double area) {
		this.shapeClass = name;
		this.area = area;
	}
	
	public String getShapeClass() {
		return shapeClass;
	}

	public double getArea() {
		return area;
	}

	@Override
	public String toString() {
		return "AreaResult [shapeClass=" + shapeClass + ", area=" + area + "]";
	}

}
