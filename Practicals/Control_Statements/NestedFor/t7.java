








class BasicNestedFor7 {

        public static void main(String[] args) {

                //int rows = 3 ;
                int rows = 4 ;
                for( int i = 1 ; i <= rows ; i++ ) {

			char ch = 'd' ;
                        for( int j = 1 ; j <= rows ; j++ ) {
                                System.out.print(ch-- +" ");
                        }
                        System.out.println();
                }

        }

}

