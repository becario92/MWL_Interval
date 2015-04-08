package intervals;

public class ClosedPoint extends Point {

	public ClosedPoint(double value) {
		super(value);
		// TODO Auto-generated constructor stub
	}
	
	public boolean isLowerOrEqualsThan(double value) {
		return this.getValue() <= value;
	}
	
	public boolean isGreaterOrEqualsThan(double value) {
		return this.getValue() >= value;
	}

}
