





class SwitchDemo19 {

	public static void main(String[] args) {

		String friends = "Kanha";

		System.out.println("Before Switch");

		switch(friends){
			case "Aashish":
				System.out.println("Barclays");
				break;
			case "Kanha":
				System.out.println("BMC Softwares");
				break;
			case "Rahul":
				System.out.println("Infosys");
				break;
			case "Badhe":
				System.out.println("IBM");
				break;
			default :
				System.out.println("In default state");
		}
		System.out.println("After Switch");
	}

}



