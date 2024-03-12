

import java.io.*;

class s10 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter Number : ");
		long num = Long.parseLong(br.readLine());
		
		long temp = num ;
		long var1 = 0 ;
		long rem1 = 0 ;
		long rem2 = 0 ;
		while( num != 0 ){
			rem1 = num % 10 ;
			var1 = var1 * 10 + rem1 ; 
			num /= 10 ;
		}
		System.out.println("Reverse of " + temp +  " is " + var1 );
		while( var1 != 0 ){
			rem2 = var1 % 10 ;
			if( rem2 % 2 == 1 ){
				System.out.print( rem2 * rem2 + " , ");
			} 
			var1 /= 10 ;
		}
		System.out.println();
	}

}






