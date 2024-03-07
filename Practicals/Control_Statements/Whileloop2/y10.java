






class WH30 {

	public static void main(String[] args) {

		int num  = 9367924 ;
		int rem  = 0 ;
		int sum  = 0 ;
		int prod = 1 ;

		while( num != 0 ) {
			rem = num % 10 ;
			num /= 10 ;
			if( rem % 2 == 0 ) {
				prod *= rem ;
			} else {
				sum += rem ;
			}
		}
		System.out.println("Product of Even Numbers : " + prod ) ;
		System.out.println("Sum of Odd Numbers : " + sum ) ;
	}

}

						
