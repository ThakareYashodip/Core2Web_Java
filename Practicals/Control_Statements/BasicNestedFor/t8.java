












class BasicNestedFor8 {

        public static void main(String[] args) {

                int rows = 3 ;
                //int rows = 4 ;
		int num = 1 ;
		char ch = 'C';

                for( int i = 1 ; i <= rows ; i++ ) {
                        for( int j = 1 ; j <= rows ; j++ ) {
                                System.out.print(ch + "" + num++ + " ");
                        }
                        System.out.println();
                }

        }

}
