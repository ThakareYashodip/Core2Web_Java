		



			// x += y     --> x = x + y
			// x *= y     --> x = x * y 
			// x -= y     --> x = x - y
			// x /= y     --> x = x / y
			// x %= y     --> x = x % y 

class AssignmmentOperators {

	public static void main(String[] args) {

		int x = 10 ;
		int y = 5 ;

		System.out.println(x);		// 10
		System.out.println(y);		// 5

		x += y ;	// x = x + y
		System.out.println(x);		// 15
		System.out.println(y);		// 5
		 
	}

}

