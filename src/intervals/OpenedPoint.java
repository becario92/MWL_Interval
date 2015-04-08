package intervals;

public class OpenedPoint extends Point {

	public OpenedPoint(double value) {
		super(value);
		// TODO Auto-generated constructor stub
	}

	public boolean isLowerThan(double value) {
		return this.getValue() < value;
	}
	
	public boolean isGreaterThan(double value) {
		return this.getValue() > value;
	}
	
}
