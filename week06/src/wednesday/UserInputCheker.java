package wednesday;

public class UserInputCheker {

	interface Validator {
		public boolean validate();
	}

	class PersonNameValidator {
		private String name;
		private String[] helper = name.split(" ");

		public PersonNameValidator(String name) {
			this.name = name;
		}

		public boolean spaceChecker() {
			if (helper.length == 3) {
				return true;
			}
			return false;
		}

		public boolean checkCapitalLetters() {
			String helper = name.replaceAll(" ", "");
			if (helper.matches("[A-Z][a-z]+[-][a-z]*")) {
				return true;
			}
			return false;
		}

		public boolean chekForNonLetters() {
			String helper = name.replaceAll(" ", "");
			if (helper.matches("\\W")) {
				return false;
			}
			return true;
		}
	}

	class BulgarianPhoneNumberValidator {
		private String phoneNumber;

		public BulgarianPhoneNumberValidator(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}

		public boolean checkLength() {
			if (this.phoneNumber.charAt(0) == '+') {
				if (phoneNumber.length() == 13) {
					return true;
				} else {
					return false;
				}

			}
			if(this.phoneNumber.charAt(0) == '0'){
				if(this.phoneNumber.length() == 10){
					return true;
				}
			}
			return false;
		}

	}
}
