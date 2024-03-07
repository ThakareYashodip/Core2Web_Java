

class StudentPassed {

	public static void main(String[] args) {

		float Percent = 78.00f;

	if( Percent >= 85.00 ) {
		System.out.println( "Passed : First class with distinction .");
	} else if( Percent < 85.00 && Percent >= 70) {
		System.out.println("Passed : First Class");
	} else if( Percent < 70.00 && Percent >= 55.00) {
		System.out.println("Passed : Second Class");
	} else if( Percent < 55 && Percent >= 35) {
		System.out.println("Pass");
	} else {
		System.out.println("Fail");
	}

	}

}
