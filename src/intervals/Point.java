package intervals;

public class Point {
	
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
	
	public boolean isLowerThan(double value) {
		return this.getValue() < value;
	}
	
	public boolean isGreaterThan(double value) {
		return this.getValue() > value;
	}
	
	public boolean isLowerOrEqualsThan(double value) {
		return this.getValue() <= value;
	}

}
