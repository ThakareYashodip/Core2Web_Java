

class relationall {

	public static void main(String[] args ) {

		int x = 10 ;
		int y = 15 ;

		System.out.println(( x-- <= ++y ) && ( ++x < y--)); 		// true
		System.out.println(x); 						// 10
		System.out.println(y);						// 15

	}

}

