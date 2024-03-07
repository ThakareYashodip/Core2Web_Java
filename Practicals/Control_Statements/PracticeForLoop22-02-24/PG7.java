



class FL7 {

	public static void main(String[] args) {
		
		int num = 1 ;
		for( int i = 1 ; i <= 9 ; i++ ) {

			if( i % 2 == 0 ) {
				System.out.print( num + " " );
			} else {
				num += 64 ;
				System.out.print( (char)num + " " );
				num -= 64 ;
			}
			num++;
		}
		System.out.println();
	}

}


