








class WhileLoop3 {

        public static void main(String[] args) {

                int start = 1 ;
                int end   = 6 ;

                for( int i = start ; i <= end ; i++ ){
			i += 64 ;
			System.out.print( (char)i + " " );
			i -= 64 ;

                }
                System.out.println();

        }
}
