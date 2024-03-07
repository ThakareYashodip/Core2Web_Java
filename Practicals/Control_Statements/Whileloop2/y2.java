






class WH22 {

	public static void main(String[] args) {

		int num = 2569185 ;
		int rem = 0 ;

		System.out.print("Digits are not divisible by 3 : ");
		while( num != 0 ) {
			rem = num % 10 ;
			num /= 10 ;
			if( rem % 3 != 0 ) {
				System.out.print( rem + " ");
			}

		}
		System.out.println();
	}

}

