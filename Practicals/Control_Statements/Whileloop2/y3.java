





class WH23 {

	public static void main(String[] args) {

		int num = 436780521 ;
		int rem = 0 ;
		
		System.out.print("Digits divisible by 2 or 3 are : ");
		while( num !=  0 ) {
			rem = num % 10 ;
			num /= 10 ;
			if( rem % 2 == 0 || rem % 3 == 0 ) {
				System.out.print( rem + " " );
			}

		}
		System.out.println();
	}

}


