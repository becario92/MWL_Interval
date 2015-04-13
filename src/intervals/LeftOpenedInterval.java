package intervals;

public class LeftOpenedInterval extends Interval {

	public LeftOpenedInterval(Point minimum, Point maximum, Opening opening) {
		super(minimum, maximum, opening);
	}
	
	public boolean intersectsWithOnLimits(Interval interval) {
		if (getMinimum().getValue() == interval.getMaximum().getValue()) {
			return false;
		}
		if (getMaximum().getValue() == interval.getMinimum().getValue()) {
			return interval.getOpening() == Opening.RIGHT_OPENED ||
					interval.getOpening() == Opening.UNOPENED;
		}
		return false;
	}

}
