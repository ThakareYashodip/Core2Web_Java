

class SwitchDemo3 {

	public static void main(String[] args) {

		String friends =  "Vaibhav";
		System.out.println("Before switch");

		switch(friends){
			case "Aashish":
				System.out.println("Barclays");
				break;
			case "Vaibhav":
				System.out.println("Microsoft");
				break;
			case "Rahul":
				System.out.println("Infosys");
				break;
			default :
				System.out.println("in the Default state");
		}

		System.out.println("After Switch ");

	}

}

