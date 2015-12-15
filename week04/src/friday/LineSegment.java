package friday;

public class LineSegment {
	private Point _start;
	private Point _end;

	public LineSegment(Point start, Point end) {
		if (start.equals(end)) {
			throw new IllegalArgumentException();
		} else {
			this._start = start;
			this._end = end;
		}
	}

	public LineSegment(LineSegment other) {
		this(other._start, other._end);
	}

	public Point get_end() {
		return _end;
	}

	public Point get_start() {
		return _start;
	}

	public double getLenght() {
		double length = Math.sqrt(Math.pow(_end.get_x() - _start.get_x(), 2))
				+ Math.pow(_end.get_y() - _start.get_y(), 2);
		return length;
	}

	@Override
	public String toString() {
		return String.format("Line[(%d,%d),(%d,%d)]", _start.get_x(), _start.get_y(), _end.get_x(), _end.get_y());
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (!this.getClass().equals(obj.getClass())) {
			return false;
		}
		LineSegment temp = (LineSegment) obj;

		return this._end.get_x() == temp._end.get_x() && this._end.get_y() == temp._end.get_y()
				&& this._start.get_x() == temp._start.get_x() && this._start.get_y() == temp._start.get_y();
	}
	@Override
	public int hashCode() {
		int hash = 17;
	    hash = hash * 23 + _start.hashCode();
	    hash = hash * 23 + _end.hashCode();
	    return hash;
	}

}
