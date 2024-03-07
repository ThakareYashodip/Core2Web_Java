

class IfElseDemo4 {

	public static void main(String[] Ganu) {

		char ch = 97 ;
		System.out.println(ch);

		if( ch == 'a' ) {
		       ch += 3 ;
		       System.out.println( ch--);       // 100  -> 99
		} else {
			System.out.println( ch++ );     
		}
		System.out.println( ch += 5); 		// 99+5 = 104

	}

}



