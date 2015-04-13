package intervals;

public abstract class Point {

	private double value;

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public Point(double value) {
		this.setValue(value);
	}

	public abstract boolean isLowerThan(Point point);

	public abstract boolean isGreaterThan(Point point);

	public abstract boolean isLowerThan(ClosedPoint point);

	public abstract boolean isGreaterThan(ClosedPoint point);
	
	public abstract boolean isLowerThan(OpenedPoint point);

	public abstract boolean isGreaterThan(OpenedPoint point);
	
	public abstract boolean isExactValue();

}
