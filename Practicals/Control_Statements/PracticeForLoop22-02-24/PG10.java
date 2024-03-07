






class FL10 {

	public static void main(String[] args) {

		char ch = 65 ;

		for( int i = 1 ; i <= 10 ; i++ ) {

			if( i % 2 == 1 ) {
				System.out.print( ch + " ") ;
			} else {
				ch += 32 ;
				System.out.print( ch + " ") ;
				ch -= 32 ;
			}
			ch++ ;
		}
		System.out.println();
	}

}

