





class WH25 {

	public static void main(String[] args)  {

		int num = 216985 ;
		int rem = 0 ;

		while( num != 0 ) {
			rem = num % 10 ;
			num /= 10 ;
			if( rem % 2 == 0 ) {
				System.out.print( rem*rem*rem + " " );
			}

		}
		System.out.println();
	}

}

