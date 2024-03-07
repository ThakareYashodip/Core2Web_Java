





class BasicWhile5 {

	public static void main(String[] args) {

		int day = 7 ;
		while( day >= 0 ) {
			if( day == 0 ){
			       System.out.println("Overdue");
			} else if( day == 1 ){
			       System.out.println("1 day remaining");
			} else {
 				System.out.println( day + " days remainig");

			}
			day-- ;
		}
		 System.out.println();
	}
}	
