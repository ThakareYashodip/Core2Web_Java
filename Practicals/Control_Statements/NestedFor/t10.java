







class BasicNestedFor10 {

	public static void main(String[] args) {

		//int rows = 4 ;
		int rows = 10 ;
		int num = 11 ;

		for( int i = 1 ; i <= rows ; i++ ) {
			for( int j = 1 ; j <= rows ; j++ ) {
				System.out.print( num++ + " ");
			}
			num = num - (rows-1) ;
			System.out.println();
		}

	}

}

