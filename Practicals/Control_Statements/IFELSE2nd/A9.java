




class Pythagoras {

	public static void main(String[] args) {

		int a = 20 ;
		int b = 16 ;
		int c = 12 ;

		if(a*a + b*b == c*c){
			System.out.println("It's a Pythagorean triplets.");
		} else if(a*a + c*c == b*b){
			System.out.println("It's a Pythagorean triplets.");
		} else if(c*c + b*b == a*a){
			System.out.println("It's a Pythagorean triplets.");
		} else {
			System.out.println("Not a Pythagorean triplets.");
		}


	}

}
