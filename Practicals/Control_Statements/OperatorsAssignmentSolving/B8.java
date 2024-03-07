


class LadderDemo2 {

	public static void main(String[] Ganu) {

		int x = 65 ;
		char ch = 'B' ;

		if( x == ch && x+1 > ch ){			//Condition False
			System.out.println("" + ch+ch);
		} 
		else if( ++x >= ch ){				//Condition True     // ++x  = 66
			System.out.println("" + x+ch );		// 66+B = 66B
		} 
		else if( x++ == ch ){
			System.out.println( x+2 );
		} 
		else {
			System.out.println( x++ );
		}

	}

}
