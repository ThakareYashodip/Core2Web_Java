











class WhileLoop4 {

        public static void main(String[] args) {

                int start = 1 ;
                int end   = 6 ;

                for( int i = start ; i <= end ; i++ ){
			if( i % 2 == 1 ){
				i += 64 ;
				System.out.print( (char)i + " " );
				i -= 64 ;
			} else {
				System.out.print( i + " " );
			}

                }
                System.out.println();

        }
}
