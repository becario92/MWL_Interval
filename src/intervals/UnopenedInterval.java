package intervals;

public class UnopenedInterval extends Interval {

	public UnopenedInterval(Point minimum, Point maximum, Opening opening) {
		super(minimum, maximum, opening);
	}
	
	public boolean intersectsWithOnLeftLimit(Interval interval) {
		return interval.getOpening() == Opening.LEFT_OPENED ||
				interval.getOpening() == Opening.UNOPENED;
	}
	
	public boolean intersectsWithOnRightLimit(Interval interval) {
		return interval.getOpening() == Opening.RIGHT_OPENED ||
				interval.getOpening() == Opening.UNOPENED;
	}

}
