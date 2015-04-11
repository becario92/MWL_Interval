package intervals;

public class UnopenedInterval extends Interval {

	public UnopenedInterval(Point minimum, Point maximum, Opening opening) {
		super(minimum, maximum, opening);
	}
	
	public boolean intersectsWith(Interval interval) {
		if (getMinimum().getValue() == interval.getMaximum().getValue()) {
			return interval.getOpening() == Opening.LEFT_OPENED ||
					interval.getOpening() == Opening.UNOPENED;
		}
		if (getMaximum().getValue() == interval.getMinimum().getValue()) {
			return interval.getOpening() == Opening.RIGHT_OPENED ||
					interval.getOpening() == Opening.UNOPENED;
		}
		return this.includes(interval.getMinimum().getValue())
				|| this.includes(interval.getMaximum().getValue());
	}

}
