
// number is even or odd and also check it is greater than  10 

class IfElseLadder3 {

	public static void main(String[] args) {

		int num = 10;

		if( num % 2 == 0 && num > 10 ) {
			System.out.println( num + " is an Even Number and greater than 10.");
		}
		else if( num % 2 == 0 && num < 10 ){
			System.out.println(num + " is an Even Number and Less than 10.");
		}
	       	else if( num % 2 == 1 && num < 10 ){
			System.out.println(num + " is an Odd Number and Less than 10.");
		}
		else if( num % 2 == 1 && num > 10 ){
                        System.out.println(num + " is an Odd Number and Greater than 10.");
                }
	       	else if( num % 2 == 0 && num == 10) {
			System.out.println(num + " is an Even Number and equal to 10");
		}
	       	else {
			System.out.println("Invalid data.");
		}

	}

}

