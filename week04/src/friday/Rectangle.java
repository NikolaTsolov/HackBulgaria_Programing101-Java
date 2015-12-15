package friday;

public class Rectangle implements Shape{

	private Point _upLeft;
	private Point _lowRigh;
	private Point _upRight;
	private Point _lowLeft;

	private LineSegment _up;
	private LineSegment _down;
	private LineSegment _left;
	private LineSegment _right;

	private double width;
	private double height;

	public Rectangle(Point point1, Point point2) {
		if (point1.get_x() == point2.get_x() || point1.get_y() == point2.get_y()) {
			throw new IllegalArgumentException();
		} else {
			this._upLeft = point1;
			this._lowRigh = point2;
			this._lowLeft = new Point(_lowRigh.get_x(), _upLeft.get_y());
			this._upRight = new Point(_upLeft.get_x(), _lowRigh.get_y());

			this._up = new LineSegment(_upLeft, _upRight);
			this._down = new LineSegment(_lowLeft, _lowRigh);
			this._left = new LineSegment(_lowLeft, _upLeft);
			this._right = new LineSegment(_lowRigh, _upRight);

			this.width = _down.getLenght();
			this.height = _left.getLenght();
		}
	}

	public Rectangle(Rectangle other) {
		this._upLeft = other._upLeft;
		this._lowRigh = other._lowRigh;
		this._lowLeft = other._lowLeft;
		this._upRight = other._upRight;
	}
	@Override
	public Point getCenter() {
		Point result = new Point((this._lowLeft.get_x() + this._lowRigh.get_x()) / 2,
				(this._upLeft.get_y() + this._upRight.get_y() / 2));
		return result;
	}
	@Override
	public double getArea() {

		return this.width * this.height;
	}

	@Override
	public String toString() {
		return String.format("Rectangle[(%d,%d), (%d,%d)]", this._down.get_start().get_x(),
				this._up.get_start().get_y(), this.getHeight(), this.getWidth());
	}
	@Override
	public boolean equals(Object obj) {
		if(obj == null){
			return false;
		}
		if(!this.getClass().equals(obj.getClass())){
			return false;
		}
		Rectangle temp = (Rectangle) obj;
		
		return this.getArea() == temp.getArea();
	}
	@Override
	public int hashCode() {
		int hash = 17;
	    hash = hash * 23 + _up.hashCode();
	    hash = hash * 23 + _left.hashCode();
	    hash = hash * 23 + _down.hashCode();
	    hash = hash * 23 + _right.hashCode();
	    return hash;
	}
	
	public Point get_lowLeft() {
		return _lowLeft;
	}

	public Point get_lowRigh() {
		return _lowRigh;
	}

	public Point get_upLeft() {
		return _upLeft;
	}

	public Point get_upRight() {
		return _upRight;
	}

	public LineSegment get_down() {
		return _down;
	}

	public LineSegment get_left() {
		return _left;
	}

	public LineSegment get_right() {
		return _right;
	}

	public LineSegment get_up() {
		return _up;
	}

	public double getHeight() {
		return height;
	}

	public double getWidth() {
		return width;
	}

	@Override
	public double getPerimeter() {
		return (this.height + this.width) / 2;
	}

}
