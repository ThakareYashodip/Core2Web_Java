

class Divisible37 {

	public static void main(String[] args) {

		int x = 20 ;

		if( x %3 == 0 && x % 7 == 0){
			System.out.println(x+ " is divisible by 3 and 7.");
		}else if( x % 3 == 0){
			System.out.println(x + " is divisible by 3. ");
		} else if( x % 7 == 0) {
			System.out.println(x + " is divisible by 7.");
		} else {
			System.out.println(x + " is neither divisible by 3 or 7.");
		}


	}

}

				

