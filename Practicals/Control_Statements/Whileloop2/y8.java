








class WH28 {

	public static void main(String[] args) {

		int num = 256985 ;
		int rem = 0 ;
		int prod = 1 ;
		
		System.out.print("Product of Odd numbers : ");
		while( num != 0 ) {
			rem = num % 10 ;
			num /= 10 ;
			if( rem % 2 == 1 ) {
				prod = prod * rem ;
			}

		}
		System.out.println(prod + " ");
	}

}

		

