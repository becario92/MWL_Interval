package intervals;

public class BothOpenedInterval extends Interval {

	public BothOpenedInterval(Point minimum, Point maximum, Opening opening) {
		super(minimum, maximum, opening);
	}
	
	public boolean intersectsWith(Interval interval) {
		if (getMinimum().getValue() == interval.getMaximum().getValue()) {
			return false;
		}
		if (getMaximum() == interval.getMinimum()) {
			return false;
		}
		return this.includes(interval.getMinimum().getValue())
				|| this.includes(interval.getMaximum().getValue());
	}

}
