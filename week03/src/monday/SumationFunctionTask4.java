package monday;

public class SumationFunctionTask4<U extends Number, S extends Number> {

	private U firstNumber;
	private S secondNumber;

	public SumationFunctionTask4(U firstNumberInput, S secondNumerInput) {
		this.secondNumber = secondNumerInput;
		this.firstNumber = firstNumberInput;
	}

	public U getFirstNumber() {
		return firstNumber;
	}

	public void setFirstNumber(U firstNumber) {
		this.firstNumber = firstNumber;
	}

	public S getSecondNumber() {
		return secondNumber;
	}

	public void setSecondNumber(S secondNumber) {
		this.secondNumber = secondNumber;
	}

	public static <U extends Number,S extends Number> Number sum(U firstNumber, S secondNumber) {
		return firstNumber.doubleValue() + secondNumber.doubleValue();
	}

	public static void main(String[] args) {
		SumationFunctionTask4<Number, Number> number = new SumationFunctionTask4<Number, Number>(2, 5);

		System.out.println(sum(number.getFirstNumber(), number.getSecondNumber()));
	}
}
