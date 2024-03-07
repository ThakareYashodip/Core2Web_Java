

class Percentage {

	public static void main(String[] args) {

		double Marks = 87.20f;

		if( Marks > 80.00){
			System.out.println("Medical");
		}else if ( Marks <= 80.00 && Marks > 70.00){
			System.out.println("Engineering");
		}else if( Marks <= 70.00 && Marks > 60.00){
			System.out.println("Pharmacy or bachelor in science");
		} else {
			System.out.println("Commerse");
		}

	}
}

