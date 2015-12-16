package monday;

import java.util.ArrayList;

public class Vector {

	private ArrayList<Double> _vector = new ArrayList<>();

	public Vector(ArrayList<Double> input) {
		this._vector.addAll(input);
	}

	public Vector(Vector other) {
		this._vector.addAll(other._vector);
	}

	public void getCoordinates() {
		for (double coordinate : _vector) {
			System.out.print("Vector: ");
			System.out.print(coordinate);
		}
	}

	public void setCoordinate(int dim, double coordinate) {
		_vector.add(dim, coordinate);
	}

	public int getDimention() {
		return _vector.size();
	}

	public double getLength() {
		double sum = 0;
		for (double el : _vector) {
			sum = sum + Math.pow(el, 2);
		}
		return Math.sqrt(sum);
	}

	@Override
	public String toString() {
		return _vector.toString();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (!this.getClass().equals(obj.getClass())) {
			return false;
		}
		Vector temp = (Vector) obj;

		return this._vector.equals(temp._vector);
	}

	@Override
	public int hashCode() {
		return _vector.hashCode();
	}

	public Vector add(Vector vector) {
		if (this._vector.size() != vector._vector.size()) {
			System.out.println("Vectors cannot be added !");
			return null;
		}
		ArrayList<Double> temp = new ArrayList<>();
		for (int i = 0; i < this._vector.size(); i++) {
			double sum = this._vector.get(i) + vector._vector.get(i);
			temp.add(i, sum);
		}
		Vector result = new Vector(temp);
		return result;
	}

	public Vector substract(Vector vector) {
		if (this._vector.size() != vector._vector.size()) {
			System.out.println("Operation cannot be done! Different dimensions");
			return null;
		}
		ArrayList<Double> temp = new ArrayList<>();
		for (int i = 0; i < this._vector.size(); i++) {
			double sum = this._vector.get(i) - vector._vector.get(i);
			temp.add(i, sum);
		}
		Vector result = new Vector(temp);
		return result;
	}

	public Vector add(Float by) {
		ArrayList<Double> temp = new ArrayList<>();
		for (int i = 0; i < this._vector.size(); i++) {
			double sum = this._vector.get(i) + by;
			temp.add(i, sum);
		}
		Vector result = new Vector(temp);
		return result;
	}

	public Vector substract(Float by) {
		ArrayList<Double> temp = new ArrayList<>();
		for (int i = 0; i < this._vector.size(); i++) {
			double sum = this._vector.get(i) - by;
			temp.add(i, sum);
		}
		Vector result = new Vector(temp);
		return result;
	}

	public Vector multiply(Float by) {
		ArrayList<Double> temp = new ArrayList<>();
		for (int i = 0; i < this._vector.size(); i++) {
			double sum = this._vector.get(i) * by;
			temp.add(i, sum);
		}
		Vector result = new Vector(temp);
		return result;
	}

	public Vector divide(Float by) {
		if (by == 0) {
			throw new IllegalArgumentException();
		}
		ArrayList<Double> temp = new ArrayList<>();
		for (int i = 0; i < this._vector.size(); i++) {
			double sum = this._vector.get(i) / by;
			temp.add(i, sum);
		}
		Vector result = new Vector(temp);
		return result;
	}

	public double dotProduct(Vector vector) {
		if (!this._vector.equals(vector._vector)) {
			throw new IllegalArgumentException("Different dimensions");
		}
		double res = 0;
		for (int i = 0; i < this._vector.size(); i++) {
			res = res + this._vector.get(i) * vector._vector.get(i);
		}
		return res;
	}

	public static void main(String[] args) {
		ArrayList<Double> firstCoordinates = new ArrayList<>();
		
		firstCoordinates.add(1.0);
		firstCoordinates.add(2.0);
		firstCoordinates.add(3.0);
		firstCoordinates.add(4.0);
		firstCoordinates.add(5.0);
		Vector first = new Vector(firstCoordinates);
		
		ArrayList<Double> secondCoordinates = new ArrayList<>();
		secondCoordinates.add(2.0);
		secondCoordinates.add(3.0);
		secondCoordinates.add(4.0);
		secondCoordinates.add(5.0);
		secondCoordinates.add(8.0);
		
		Vector second = new Vector(secondCoordinates);
		
		System.out.println(first.add(second));
		
	}

}
