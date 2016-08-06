package net.jensenworld.shapes;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author Allen Jensen
 * 
 * This is the main logic for the assignment. Creates a Callable fir each
 * shape and then uses the ExecutorService to execute the Callable object
 * on a thread.  The resulting Future object blocks until the thread completes
 * the computation of the area. We loop over the results and add them up.
 * Code will only block for as long as the longest computation takes since the
 * areas are being computed concurrently.
 *
 */
public class AreaSummer {

	/**
	 * Core logic called by Main to compute areas on threads and display
	 * the area for each shape and the name of the shape.
	 * 
	 * @param shapeDimension
	 * @return sumOfAllAreas
	 */
	public static double shapeSet3Sum(double shapeDimension) {
		ExecutorService pool = Executors.newFixedThreadPool(3);
		Set<Future<AreaResult>> set = new HashSet<Future<AreaResult>>();
		Set<Shape> shapes = ShapeFactory.createShapeSet3(shapeDimension);
		for (Shape shape : shapes) {
			Callable<AreaResult> callable = new ShapeArea(shape);
			Future<AreaResult> future = pool.submit(callable);
			set.add(future);
		}
		double sum = 0.0d;
		for (Future<AreaResult> future : set) {
			try {
				AreaResult areaResult = future.get();
				double area = areaResult.getArea();
				System.out.printf("%s: %.2f ", areaResult.getShapeClass(), area);
				sum += area;
			} catch (InterruptedException | ExecutionException e) {
				e.printStackTrace();
			}
		}
		return sum;
	}
	//CHECKSTYLE:OFF
	/**
	 * Main - parses single argument and calls shapeSet3Sum to generate
	 * sum of the areas. Each area is displayed by the shapeSet3Sum method
	 * and the sum is displayed here.  Requirements were for 2 decimal digits
	 * to be shown for each area and for the sum.
	 * 
	 * @param args
	 * @throws Exception
	 */
	public static void main(String args[]) throws Exception {
		if(args.length != 1) {
			System.out.printf("Wrong number of arguments: %d%n", args.length);
			System.out.printf("Syntax: net.jensenworld.shapes.AreaSummer <dimension>%n");
			System.exit(1);
		}
		double dimension = 0.0d;
		try {
			dimension = Double.parseDouble(args[0]);
		} catch (Exception e) {
			System.out.printf("Conversion to double failed, illegal argument: %s%n", args[0]);
			System.exit(1);
		}
		if(dimension <= 0.0d) {
			System.out.printf("Dimension must be greater than zero: %f%n", dimension);
		}
		double sum = shapeSet3Sum(dimension);
		System.out.printf("sum: %.2f%n", sum);
		System.exit(0);
	}
	//CHECKSTYLE:ON
}
