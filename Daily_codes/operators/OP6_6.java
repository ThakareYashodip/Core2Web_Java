 

		// Bitwise signed right shift >> 
		// Bitwise Unsigned right shift >>>


class BitwiseOperator6 {

	public static void main(String[] args) {

		int x = 3 ; 			// 0000 0011
		System.out.println( x >> 2 ); 	// 0000 0000

		int y = 12 ; 			// 0000 1100
		System.out.println( y >> 2 );   // 0000 0011

		int z = -5 ; 			// 1111 1011 (-5)
		System.out.println( z >> 2 );   // 1111 1110 (-2) 

		int m = 5 ; 			// 0000 0101
		System.out.println( m >>> 2 );  // 0000 0001

		int n = -5 ;			// 1111 1011
		System.out.println( n >>> 2 );  // 0011 1111    


	}

}
					
