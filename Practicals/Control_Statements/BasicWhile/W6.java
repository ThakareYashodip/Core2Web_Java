






class BasicWhile6 {

	public static void main(String[] args)  {

		char ch = 'A';
		while( ch <= 'Z'){
			if( ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ) {
			} else {
				System.out.print(" " + ch );
			}
			ch++ ;
		}
		System.out.println();

	}

}
