



class WhileLoop10 {

	public static void main(String[] args) {

		int rem = 0 ;
		int sum = 0 ;
		int num = 9307922405 ;

		while( num != 0 ) {

			rem = num % 10 ;
			num /= 10 ;
			sum = sum + rem ;

		}
		System.out.println( "Sum of Digits is : " + sum ) ;

	}

}

