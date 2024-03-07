



class SwitchDemo2 {

	public static void main(String[] args) {

		char data = 'C';
		System.out.println("Before Switch");

		switch(data) {
			case 'A': 
				System.out.println("A");
				break;
			case  65:
				System.out.println("65");
				break;
			case 'B':
				System.out.println("B");
				break;
			case  66:
				System.out.println("66");
				break;
			default :
				System.out.println("In Default state");

		}
		System.out.println("After switch");
	}
}


			//Prog4_1.java:16: error: duplicate case label
                        // 			case  65:
                       	//			^
			// Prog4_1.java:22: error: duplicate case label
			//                        case  66:
			//                        ^

