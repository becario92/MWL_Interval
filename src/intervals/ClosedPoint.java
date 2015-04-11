package intervals;

public class ClosedPoint extends Point {

	public ClosedPoint(double value) {
		super(value);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isLowerThan(Point point) {
		// TODO Auto-generated method stub
		return point.isLowerThan(this);
	}

	@Override
	public boolean isGreaterThan(Point point) {
		// TODO Auto-generated method stub
		return point.isGreaterThan(this);
	}

	@Override
	public boolean isLowerThan(ClosedPoint point) {
		// TODO Auto-generated method stub
		return this.getValue() >= point.getValue();
	}

	@Override
	public boolean isGreaterThan(ClosedPoint point) {
		// TODO Auto-generated method stub
		return this.getValue() <= point.getValue();
	}

	@Override
	public boolean isLowerThan(OpenedPoint point) {
		// TODO Auto-generated method stub
		return this.getValue() > point.getValue();
	}

	@Override
	public boolean isGreaterThan(OpenedPoint point) {
		// TODO Auto-generated method stub
		return this.getValue() < point.getValue();
	}

}
