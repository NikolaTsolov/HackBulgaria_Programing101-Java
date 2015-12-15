package monday;

public class TripleTask3<U, S, I> {
	private U first;
	private S second;
	private I third;

	public TripleTask3(U _first, S _second, I _third) {
		this.first = _first;
		this.second = _second;
		this.third = _third;
	}

	public TripleTask3() {
		this.first = null;
		this.second = null;
		this.third = null;
	}

	public void setfirst(U first) {
		this.first = first;
	}

	public U getfirst() {
		return first;
	}

	public S getSecond() {
		return second;
	}

	public void setSecond(S _second) {
		this.second = _second;
	}

	public I getThird() {
		return third;
	}

	public void setThird(I _third) {
		this.third = _third;
	}

}
