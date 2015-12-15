package monday;

public class MultiplicationTask6<U, S> {

	private U firstNumber;
	private S secondNumber;

	public MultiplicationTask6(U firstNumberInput, S secondNumerInput) {
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

	public static <U extends Number,S extends Number> Number substract(U firstNumber, S secondNumber) {
		return firstNumber.doubleValue() * secondNumber.doubleValue();
	}

	public static void main(String[] args) {
		SumationFunctionTask4<Number, Number> number = new SumationFunctionTask4<Number, Number>(6,3);

		System.out.println(substract(number.getFirstNumber(), number.getSecondNumber()));
	}
}
