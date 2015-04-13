package intervals;

public abstract class Interval {

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
		if (getMinimum().getValue() == interval.getMaximum().getValue()
				|| getMaximum().getValue() == interval.getMinimum().getValue()) {
			return intersectsWithOnLimits(interval);
		}
		return this.includes(interval.getMinimum().getValue())
				|| this.includes(interval.getMaximum().getValue());
	}
	
	public abstract boolean intersectsWithOnLimits(Interval interval);

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
