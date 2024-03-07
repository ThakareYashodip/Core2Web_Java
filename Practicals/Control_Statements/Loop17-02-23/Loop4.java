








class Loop4 {

	public static void main(String[] args) {

		int num = 301071 ;
		int temp= num ;
		int numVal = 0;

		while( temp != 0) {
			numVal = numVal*10 + (temp%10);
			temp /= 10;
		}
		System.out.println(temp);
		System.out.println(numVal);

	}
}

