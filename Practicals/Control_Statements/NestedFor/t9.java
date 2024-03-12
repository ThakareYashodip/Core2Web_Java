











class BasicNestedFor9 {

        public static void main(String[] args) {

                //int rows = 3 ;
                int rows = 4 ;
		int num = 10java ;

                for( int i = 1 ; i <= rows ; i++ ) {
                        for( int j = 1 ; j <= rows ; j++ ) {
                                System.out.print(num +" ");
				num++;
                        }
			--num;
                        System.out.println();
                }

        }

}
