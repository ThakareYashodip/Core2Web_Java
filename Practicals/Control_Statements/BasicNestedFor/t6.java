






class BasicNestedFor6 {

        public static void main(String[] args) {

                //int rows = 3 ;
                int rows = 4 ;

                for( int i = 1 ; i <= rows ; i++ ) {
			
			int num = 1 ;
			char ch = 'A' ;

                        for( int j = 1 ; j <= rows ; j++ ) {
                                System.out.print(num++ + "" + ch++ + " ");
                        }
                        System.out.println();
                }

        }

}
