package friday;

public class Ellipse {
	private final LineSegment _major;
	private final LineSegment _minor;
	
	public Ellipse(LineSegment major, LineSegment minor){
		this._major = major;
		this._minor = minor;
	}
	public Ellipse(Ellipse other){
		this._major = other._major;
		this._minor = other._minor;
	}
	public void getMajorStartCoordinates(LineSegment _major){
		System.out.printf("MajorStart: %d, %d", _major.get_start().get_x(), _major.get_start().get_y());
		System.out.println();
	}
	public void getMajorEndPointCoordinates(LineSegment _major){
		System.out.printf("MajorEnd: %d, %d", _major.get_end().get_x(), _major.get_end().get_y());
		System.out.println();
	}
	public void getMinorStartPointY(LineSegment _minor){
		System.out.printf("MinorStart: %d, %d", _minor.get_start().get_x(), _minor.get_end().get_y());
		System.out.println();
	}
	public void getMinorEndPointY(LineSegment _minor){
		System.out.printf("MinorEnd: %d, %d", _minor.get_end().get_x(), _minor.get_end().get_y());
		System.out.println();
	}
	public double getArea(){
		return Math.PI * this._major.getLenght() / 2 * this._minor.getLenght() / 2;
	}
	public double getPerimeer(){
		return Math.PI /2 * Math.sqrt(2*Math.pow(this._major.getLenght() / 2, 2) + Math.pow(this._minor.getLenght() /2 , 2));
	}
	@Override
	public String toString() {
		return String.format(" Ellipse[%d, %d]", this._minor.getLenght(), this._major.getLenght());
	}
	@Override
	public boolean equals(Object obj) {
		if(obj == null){
			return false;
		}
		if(!this.getClass().equals(obj.getClass())){
			return false;
		}
		Ellipse temp = (Ellipse)obj;
		return this.getArea() == temp.getArea();
	}
	@Override
	public int hashCode() {
		int hash = 17;
		hash = hash * 23 + _major.hashCode();
		hash = hash * 23 + _minor.hashCode();
		return hash;
	}
	
	
}
