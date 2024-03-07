





class WhileLoop9 {

	public static void main(String[] args) {

		int evenCount = 0;
		int oddCount  = 0;
		int rem = 0;
		int num = 214367689 ;

		while( num != 0 ) {
			rem = num % 10 ;
			num /= 10 ;

			if( rem % 2 == 1 ) {
				oddCount++ ;
			} else {
				evenCount++;
			}
		}
		 System.out.println( " Odd Number : " + oddCount ) ;
                        System.out.println( " Even Number : " + evenCount ) ;

	}

}

