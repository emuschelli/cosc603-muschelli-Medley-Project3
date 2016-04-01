package edu.towson.cis.cosc603.project4.rectangle;

/**
 * The Point Class.
 */
public class Point {
	
	/** x and y coordinates. */
	public Double x, y;
	
	/**
	 * Instantiates a new point.
	 *
	 * @param x the x
	 * @param y the y
	 */
	Point(Double x, Double y) {
		this.x = x;
		this.y = y;
	}

	/**
	 * Gets the diagonal.
	 * @param p2
	 * @return  the diagonal
	 */
	public Double getDiagonal(Point p2) {
		return Math.sqrt(Math.pow((p2.x - this.x), 2)
				+ Math.pow((p2.y - this.y), 2));
	}

	/**
	 * Gets the area.
	 * @param p2
	 * @return  the area
	 */
	public Double getArea(Point p2) {
		return Math.abs((p2.x - this.x) * (p2.y - this.y));
	}
}
