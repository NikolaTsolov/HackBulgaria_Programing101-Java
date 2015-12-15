package friday;


public class Circle {
	
	private final LineSegment _radius;
	
	public Circle(LineSegment radius){
		this._radius = radius;
	}
	public Circle(Circle other){
		this._radius = other._radius;
	}
	public double getArea(){
		return Math.PI * Math.pow(_radius.getLenght(), 2);
	}
	public double getPerimeter(){
		return Math.PI * this._radius.getLenght() * 2;
	}
	public void getCenter(){
		System.out.printf("Center(%d, %d)", this._radius.get_start().get_x(), this._radius.get_start().get_y());
		System.out.println();
	}
	@Override
	public String toString() {
		return String.format("Circle[(%d, %d, (%d))]", this._radius.get_start().get_x(),this._radius.get_start().get_y(), this._radius.getLenght());
	}
	@Override
	public boolean equals(Object obj) {
		if(obj == null){
			return false;
		}
		if(!this.getClass().equals(obj.getClass())){
			return false;
		}
		Circle temp = (Circle)obj;
		
		return this.getArea() == temp.getArea();
	}
	@Override
	public int hashCode() {
		int hash = 17;
		hash = hash * 23 + _radius.hashCode();
		return hash;
	}
}
