package intervals;

public abstract class Interval {

	private double minimum;
	private double maximum;
	private Opening opening;
	
	public Point minimumPoint;
	public Point maximumPoint;

	public Interval(double minimum, double maximum, Opening opening) {
		this.minimum = minimum;
		this.maximum = maximum;
		this.opening = opening;
	}
	
	protected double getMinimum() {
		return minimum;
	}

	protected void setMinimum(double minimum) {
		this.minimum = minimum;
	}

	protected double getMaximum() {
		return maximum;
	}

	protected void setMaximum(double maximum) {
		this.maximum = maximum;
	}
	
	protected Opening getOpening() {
		return opening;
	}

	protected void setOpening(Opening opening) {
		this.opening = opening;
	}

	public double midPoint() {
		return (maximum + minimum) / 2;
	}

	public boolean includes(double value) {
		return this.minimumPoint.isLowerThan(value) && this.maximumPoint.isGreaterThan(value);
	}

	public abstract boolean includes(Interval interval);

	public abstract boolean intersectsWith(Interval interval);

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
