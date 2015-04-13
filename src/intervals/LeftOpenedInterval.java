package intervals;

public class LeftOpenedInterval extends Interval {

	public LeftOpenedInterval(Point minimum, Point maximum, Opening opening) {
		super(minimum, maximum, opening);
	}
	
	public boolean intersectsWithOnLeftLimit(Interval interval) {
		return false;
	}
	
	public boolean intersectsWithOnRightLimit(Interval interval) {
		return interval.getOpening() == Opening.RIGHT_OPENED ||
				interval.getOpening() == Opening.UNOPENED;
	}

}
