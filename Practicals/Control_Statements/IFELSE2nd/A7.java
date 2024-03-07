

class Profit {

	public static void main(String[] args) {

		int Cost_price = 1500;
		int Selling_price = 2500 ; 


		if( Selling_price > Cost_price) {
			System.out.println("Proift :" + (Selling_price - Cost_price));
		} else if( Selling_price < Cost_price) {
			System.out.println("Loss :" + (Cost_price - Selling_price));
		} else {
			System.out.println("No Profit No Loss");
		}

	}

}

