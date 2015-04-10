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
	
	public abstract boolean isLowerThan(double value);
	
	public abstract boolean isGreaterThan(double value);

}
