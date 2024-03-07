




class NestedFor11 {

        public static void main(String[] args) {

                for(int i = 1 ; i <= 4 ; i++){

			char ch = 'a' ;
			char mh = 'A' ;

                        for(int j = 1 ; j <= 3 ; j++) {

				if( i % 2 == 1 ){
					System.out.print( ch++ + " ");
				} else{
					System.out.print( mh++ + " ");
				}

                        }
                        System.out.println();
                }

        }

}
