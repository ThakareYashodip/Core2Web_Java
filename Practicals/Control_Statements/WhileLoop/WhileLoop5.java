









class WhileLoop5 {

	public static void main(String[] args) {
		
		int row = 4 ;
		int i   = 1 ;
		int num = 1 ;

		while( i <= row ){
		        int j = 1 ;
	       		while( j <= row ){
		 		System.out.print( num + " " ) ;
				num += 2 ;
				j++ ;
			}
			System.out.println();
			i++ ;
		}

	}

}

