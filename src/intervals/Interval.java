package intervals;

public class Interval {

	private Point minimum;
	private Point maximum;
	private Opening opening;

	public Interval(Point minimum, Point maximum, Opening opening) {
		this.minimum = minimum;
		this.maximum = maximum;
		this.opening = opening;
	}
	
	protected Point getMinimum() {
		return minimum;
	}

	protected void setMinimum(Point minimum) {
		this.minimum = minimum;
	}

	protected Point getMaximum() {
		return maximum;
	}

	protected void setMaximum(Point maximum) {
		this.maximum = maximum;
	}
	
	protected Opening getOpening() {
		return opening;
	}

	protected void setOpening(Opening opening) {
		this.opening = opening;
	}

	public double midPoint() {
		return (maximum.getValue() + minimum.getValue()) / 2;
	}

	public boolean includes(double value) {
		Point point = new ClosedPoint(value);
		return this.minimum.isLowerThan(point) && this.maximum.isGreaterThan(point);
	}

	public boolean includes(Interval interval) {
		return this.minimum.isLowerThan(interval.getMinimum()) && this.maximum.isGreaterThan(interval.getMaximum());
	}

	public boolean intersectsWith(Interval interval) {
		if (getMinimum().getValue() == interval.getMaximum().getValue()) {
			switch(opening) {
			case RIGHT_OPENED:
			case UNOPENED:
				return interval.getOpening() == Opening.LEFT_OPENED ||
				interval.getOpening() == Opening.UNOPENED;
			case LEFT_OPENED:
			case BOTH_OPENED:
				return false;
			default:
				assert false;
				return false;
			}
		}
		if (getMaximum().getValue() == interval.getMinimum().getValue()) {
			switch(opening) {
			case LEFT_OPENED:
			case UNOPENED:
				return interval.getOpening() == Opening.RIGHT_OPENED ||
				interval.getOpening() == Opening.UNOPENED;
			case RIGHT_OPENED:
			case BOTH_OPENED:
				return false;
			default:
				assert false;
				return false;
			}
		}
		return this.includes(interval.getMinimum().getValue())
				|| this.includes(interval.getMaximum().getValue());
	}

	@Override
	public String toString() {
		// TODO
		return null;
	}

	@Override
	public boolean equals(Object object) {
		// TODO
		return false;
	}

}
