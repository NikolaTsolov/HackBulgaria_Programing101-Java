package monday;

public class GenericBackPack<T> {
	private T el;

	public GenericBackPack(T element) {
		this.el = element;
	}

	public T getEl() {
		return el;
	}

	public void setEl(T el) {
		this.el = el;
	}

	public static void main(String[] args) {
		double x = 2.9;
		GenericBackPack<? extends Number> bp = new GenericBackPack<>(x);

		System.out.println(bp.getEl());
	}

}
