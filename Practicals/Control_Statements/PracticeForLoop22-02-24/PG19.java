









class FL19 {

	public static void main(String[] args ) {

		int num = 763457;
		int rem = 0 ;

		while( num != 0 ) {
			rem = num % 10 ;
			num /= 10 ;
			if( rem % 2 == 0 ) {
			       System.out.print( rem + " " );
			}
		}
		System.out.println();
	}

}

