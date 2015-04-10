package intervals;

public class ClosedPoint extends Point {

	public ClosedPoint(double value) {
		super(value);
		// TODO Auto-generated constructor stub
	}
	
	public boolean isLowerThan(double value) {
		return this.getValue() <= value;
	}
	
	public boolean isGreaterThan(double value) {
		return this.getValue() >= value;
	}

}
