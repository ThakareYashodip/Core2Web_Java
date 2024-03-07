






class WH26 {

	public static void main(String[] args) {

		int num = 234 ;
		int rem = 0 ;
		int prod = 1 ;

		while( num != 0 ) {
			rem = num % 10 ;
			num /= 10 ;
			prod = rem * prod ;
		}
		System.out.println(prod);
	}

}

