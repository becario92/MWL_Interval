package intervals;

public class BothOpenedInterval extends Interval {

	public BothOpenedInterval(Point minimum, Point maximum, Opening opening) {
		super(minimum, maximum, opening);
	}
	
	public boolean intersectsWithOnLeftLimit(Interval interval) {
		return false;
	}
	
	public boolean intersectsWithOnRightLimit(Interval interval) {
		return false;
	}

}
