

class Divisible2510 {

	public static void main(String[] args) {

		int num = 13;

		if( num % 2 == 0 && num % 5 == 0 && num % 10 == 0 ) {
			System.out.println(num + " is Divisible by 2,5,10.");
		} else if( num % 2 == 0 ){
			System.out.println(num + " is Divisible by 2.");
		} else if( num % 5 == 0 && num % 10 == 0 ){
			 System.out.println(num + " is Divisible by 5,10.");
		} else {
			 System.out.println(num + " is not Divisible by 2,5,10.");
		}



	}

}

