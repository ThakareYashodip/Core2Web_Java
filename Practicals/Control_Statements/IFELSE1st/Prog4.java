

class IfChar {

	public static void main(String[] args) {

		char ch = 'M';
		//char mh = 'o';

		if( 'a' <= ch && 'z' >= ch ) {
			System.out.println(ch + " is a Lowercase character. ");
		} 
		else if( 'A' <= ch && 'Z' >= ch ) {
			System.out.println(ch + " is a Uppercase character. ");
		}
	       	else {
			System.out.println("Invalid data. ");
		}

	}

}


