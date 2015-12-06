package monday;

public class PairTask2<U, S> {

	private U first;
	private S second;

	public PairTask2(U _first, S _second) {
		this.first = _first;
		this.second = _second;
	}

	public PairTask2(){
		this.first = null;
		this.second = null;
	}

	public void setfirst(U first) {
		this.first = first;
	}

	public U getfirst() {
		return first;
	}

	public S getSecond(){
		return second;
	}
	public void setSecond(S _second){
		this.second = _second;
	}
	public static void main(String[] args) {
		PairTask2<? extends Number, ? extends Number> first = new PairTask2<>(4, 5);
		
		System.out.println(first.getfirst());
	}

}
