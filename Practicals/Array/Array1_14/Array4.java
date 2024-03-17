





class YashArray4 {

	public static void main(String[] args) {

		int arr[] = new int[10];
		arr[0] = 1 ;
		arr[1] = 2 ;
		arr[2] = 3 ;
		arr[3] = 4 ;
		arr[4] = 2 ;
		arr[5] = 5 ;
		arr[6] = 6 ;
		arr[7] = 2 ;
		arr[8] = 8 ;
		arr[9] = 10 ;

		int sum = 0 ;
		for( int i = 0 ; i < arr.length ; i++ ){
			if( arr[i] % 2 == 1 ){
				sum = sum + arr[i] ;
			}

		}
		System.out.println("Sum of all odd numbers are : " + sum );
	}

}

