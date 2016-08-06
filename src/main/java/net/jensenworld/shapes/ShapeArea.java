package net.jensenworld.shapes;

import java.util.concurrent.Callable;

/**
 * @author Allen Jensen
 * 
 * This will be used by Future in an ExecutorService so each shape's area
 * can be computed on a separate thread.
 *
 */
public class ShapeArea implements Callable<AreaResult> {
	private Shape shape;
	
	public ShapeArea(Shape shape) {
		this.shape = shape;
	}
	
	/* (non-Javadoc)
	 * @see java.util.concurrent.Callable#call()
	 * 
	 * When called by thread, this will compute the shapes area
	 * and get it's simple class name for a result object since we
	 * want to display the type and area as part of this project.
	 */
	@Override
	public AreaResult call() throws Exception {
		return new AreaResult(shape.getClass().getSimpleName(), shape.area());
	}
}
