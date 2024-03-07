
class NestedFor10 {

        public static void main(String[] args) {
 		

		char ch = 'A';
		int mh = 1;
                for(int i = 1 ; i <= 4 ; i++){

                        for(int j = 1 ; j <= 3 ; j++){
			
				if( i % 2 != 0 ){
                                	System.out.print( ch++ + " " );
				} else {
					System.out.print( mh++ + " " );
				}

                        }
			System.out.println();

                }

        }

}
